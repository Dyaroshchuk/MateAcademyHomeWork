package home.work5;

import java.util.NoSuchElementException;
import java.util.Objects;

public class MyHashMap<K, V> implements MyMap<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private static final int Maximum_Capacity = 1 << 30;
    private Node<K, V>[] table;
    private int size = 0;

    private int getIndex(K key) {
        return (key == null) ? 0 : Math.abs(key.hashCode() % table.length);
    }

    private Node<K, V> getNode(K key) {
        int index = getIndex(key);
        if (table[index] != null && (table[index].hash == key.hashCode())) {
            return table[index];
        } else throw new NoSuchElementException("This map doesn't contain key: " + key);
    }

    public MyHashMap(int arrayCapacity) {
        if (arrayCapacity < 0)
            throw new IllegalArgumentException("Illegal size: " + arrayCapacity);
        this.table = new Node[arrayCapacity];
    }

    public MyHashMap() {
        this(DEFAULT_CAPACITY);
    }

    private void indexRedistribution(int size) {
        Node<K, V>[] oldTable = table;
        table = new Node[size];
        for (int i = 0; i < oldTable.length; i++) {
            put(oldTable[i].key, oldTable[i].value);
        }
    }

    private void incrementTableCapacity(int size) {
        if (table.length <= size) {
            if (table.length * 2 > Maximum_Capacity) {
                indexRedistribution(Maximum_Capacity);
            } else {
                indexRedistribution(size * 2);
            }
        }
    }

    @Override
    public V put(K key, V value) {
        int tableIndex = getIndex(key);
        if (table[tableIndex] == null) {
            incrementTableCapacity(size + 1);
            table[tableIndex] = new Node<>(key.hashCode(), key, value, null);
            size++;
        } else if (table[tableIndex] != null && table[tableIndex].key.equals(key)) {
            getNode(key).setValue(value);
        } else {
            incrementTableCapacity(size + 1);
            getNode(key).next = new Node<>(key.hashCode(), key, value, null);
            size++;
        }
        return null;
    }

    @Override
    public V remove(K key) {
        V removedValue = getNode(key).value;
        table[getIndex(key)] = null;
        size--;
        return removedValue;
    }

    @Override
    public void clear() {
        if (table != null && table.length > 0) {
            for (int i = 0; i < table.length; i++) {
                table[i] = null;
            }
            size = 0;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public V get(K key) {
        return getNode(key).value;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                result.append(table[i])
                        .append(" ");
            }
        }
        return result.toString();
    }

    private static class Node<K, V> {
        private int hash;
        private K key;
        private V value;
        private Node<K, V> next;

        public Node(int hash, K key, V value, Node<K, V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Node<?, ?> node = (Node<?, ?>) o;
            return Objects.equals(getKey(), node.getKey()) &&
                    Objects.equals(getValue(), node.getValue());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getKey(), getValue());
        }

        @Override
        public String toString() {
            return key + "=" + value;
        }
    }
}
