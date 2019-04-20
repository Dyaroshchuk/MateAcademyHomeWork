package home.work4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyLinkedListTest {
    private MyList<String> testLinkedList;

    @Before
    public void setUp() {
        testLinkedList = new MyLinkedList<>();
        testLinkedList.add("Monday");
        testLinkedList.add("Tuesday");
    }

    @Test
    public void addByValue() {
        testLinkedList.add("Wednesday");
        String actual = testLinkedList.get(2);
        String expected = "Wednesday";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void addByIndex() {
        testLinkedList.add("newTuesday", 1);
        String actual = testLinkedList.get(1);
        String expected = "newTuesday";
        Assert.assertEquals(actual, expected);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void addByIndexException() {
        testLinkedList.add("newTuesday", 15);
    }

    @Test
    public void addAll() {
        MyList<String> addingList = new MyArrayList<>();
        addingList.add("Wednesday");
        addingList.add("Thursday");
        addingList.add("Friday");
        testLinkedList.addAll(addingList);
        Assert.assertEquals(testLinkedList.size(), 5);
        String actual = testLinkedList.get(2);
        String expected = "Wednesday";
        Assert.assertEquals(actual, expected);
        actual = testLinkedList.get(testLinkedList.size() - 1);
        expected = "Friday";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void get() {
        String actual = testLinkedList.get(1);
        String expected = "Tuesday";
        Assert.assertEquals(actual, expected);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void getException() {
        String actual = testLinkedList.get(15);
    }

    @Test
    public void set() {
        testLinkedList.set("newTuesday", 1);
        String actual = testLinkedList.get(1);
        String expected = "newTuesday";
        Assert.assertEquals(actual, expected);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void setException() {
        testLinkedList.set("newTuesday", 15);
    }

    @Test
    public void removeByIndex() {
        testLinkedList.remove(1);
        Assert.assertEquals(testLinkedList.size(), 1);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void removeByIndexException() {
        testLinkedList.remove(15);
    }

    @Test
    public void removeByValue() {
        testLinkedList.remove("Tuesday");
        Assert.assertEquals(testLinkedList.size(), 1);
    }

    @Test
    public void size() {
        Assert.assertEquals(testLinkedList.size(), 2);
    }

    @Test
    public void isEmpty() {
        testLinkedList.remove(0);
        testLinkedList.remove(0);
        Assert.assertEquals(testLinkedList.size(), 0);
    }
}