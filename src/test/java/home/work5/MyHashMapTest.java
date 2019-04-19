package home.work5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyHashMapTest {
    private MyMap<String, String> testMap;

    @Before
    public void setUp() throws Exception {
        testMap = new MyHashMap<>();
        testMap.put("first", "Monday");
        testMap.put("second", "Tuesday");
    }

    @Test
    public void put() {
        String actual = testMap.get("first");
        String expected = "Monday";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remove() {
        testMap.remove("first");
        Assert.assertEquals(1, testMap.size());
        String actual = testMap.get("second");
        Assert.assertEquals("Tuesday", actual);
    }

    @Test
    public void clear() {
        testMap.clear();
        Assert.assertEquals(0, testMap.size());
    }

    @Test
    public void size() {
        Assert.assertEquals(2, testMap.size());
    }

    @Test
    public void get() {
        String actual = testMap.get("second");
        String expected = "Tuesday";
        Assert.assertEquals(expected,actual);
    }


}