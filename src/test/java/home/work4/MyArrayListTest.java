package home.work4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyArrayListTest {
    private MyList<String> testArrayList;

    @Before
    public void setUp() {
        testArrayList = new MyArrayList<>();
        testArrayList.add("Monday");
        testArrayList.add("Tuesday");
    }

    @Test
    public void addByValue() {
        testArrayList.add("Wednesday");
        String actual = testArrayList.get(2);
        String expected = "Wednesday";
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void addIndex() {
        testArrayList.add("newTuesday", 1);
        String actual = testArrayList.get(1);
        String expected = "newTuesday";
        Assert.assertEquals(expected,actual);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void addIndexException() {
        testArrayList.add("newValue", 15);
    }

    @Test
    public void addAll() {
        MyList<String> addingList = new MyArrayList<>();
        addingList.add("Wednesday");
        addingList.add("Thursday");
        addingList.add("Friday");
        testArrayList.addAll(addingList);
        Assert.assertEquals(testArrayList.size(), 5);
        String actual = testArrayList.get(2);
        String expected = "Wednesday";
        Assert.assertEquals(expected,actual);
        actual = testArrayList.get(testArrayList.size() - 1);
        expected = "Friday";
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void get() {
        String actual = testArrayList.get(1);
        String expected = "Tuesday";
        Assert.assertEquals(expected,actual);

    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void getException() {
        String actual = testArrayList.get(15);

    }

    @Test
    public void set() {
        testArrayList.set("newTuesday", 1);
        String actual = testArrayList.get(1);
        String expected = "newTuesday";
        Assert.assertEquals(expected,actual);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void setException() {
        testArrayList.set("newTuesday", 15);
    }

    @Test
    public void removeByIndex() {
        testArrayList.remove(1);
        Assert.assertEquals(1, testArrayList.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void removeByIndexException() {
        testArrayList.remove(15);
    }

    @Test
    public void removeByValue() {
        testArrayList.remove("Tuesday");
        Assert.assertEquals(1, testArrayList.size());
    }

    @Test
    public void size() {
        Assert.assertEquals(2, testArrayList.size());
    }

    @Test
    public void isEmpty() {
        testArrayList.remove(0);
        testArrayList.remove(0);
        Assert.assertEquals(0, testArrayList.size());
    }
}