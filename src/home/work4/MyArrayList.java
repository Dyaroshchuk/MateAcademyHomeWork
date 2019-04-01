package home.work4;

import java.util.Arrays;

public class MyArrayList<T> implements MyList<T> {
    private Object[] arrayValue;
    private int size = 0;

    public MyArrayList(int arrayCapacity) {
        if (arrayCapacity < 0) throw new IllegalArgumentException("Illegal size" + arrayCapacity);
        this.arrayValue = new Object[arrayCapacity];
    }

    public MyArrayList() {
        this(10);
    }

    private void increaseArrayCapacity(int arraySize) {
        int oldArraySize = arrayValue.length;
        int newArraySize = oldArraySize + (oldArraySize >> 1);
        arrayValue = Arrays.copyOf(arrayValue, newArraySize);
    }

    private void decrementArrayCapacity(int arraySize) {
        int oldArraySize = arrayValue.length;
        int newArraySize = oldArraySize - (oldArraySize >> 1);
        arrayValue = Arrays.copyOf(arrayValue, newArraySize);
    }

    private void checkIndex(int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException
                    ("Your index: " + index + " bigger than List size: " + size);
    }

    private T arrayValue(int index) {
        return (T) arrayValue[index];
    }

    private void incrementOrDecrementArrayCapacity(int size) {
        if (arrayValue.length <= size) {
            increaseArrayCapacity(arrayValue.length);
        }
        if (arrayValue.length > size << 1) {
            decrementArrayCapacity(arrayValue.length);
        }
    }

    @Override
    public void add(T value) {
        arrayValue[size] = value;
        size++;
        incrementOrDecrementArrayCapacity(size);
    }

    @Override
    public void add(T value, int index) {
        checkIndex(index);
        System.arraycopy(arrayValue, index, arrayValue, index + 1, ++size);
        arrayValue[index] = value;
        incrementOrDecrementArrayCapacity(size);
    }

    @Override
    public void addAll(MyList<T> list) {
        for (int i = 0; i < list.size(); i++) {
            add(list.get(i));
        }
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        return arrayValue(index);
    }

    @Override
    public void set(T value, int index) {
        checkIndex(index);
        arrayValue[index] = value;
    }

    @Override
    public T remove(int index) {
        checkIndex(index);
        T deletedValue = (T) arrayValue[index];
        System.arraycopy(arrayValue, index + 1, arrayValue, index, --size);
        incrementOrDecrementArrayCapacity(size);
        return deletedValue;
    }

    @Override
    public T remove(T value) {
        for (int i = 0; i < size; i++) {
            if (value.equals(arrayValue[i])) {
                return remove(i);
            }
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(arrayValue[0]);
        for (int i = 1; i < size; i++) {
            result.append(", ").append(arrayValue[i]);
        }
        return result.toString();
    }
}
