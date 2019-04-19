package home.work5;

public class Main {

    public static void main(String[] args) {
        MyMap<String, Integer> myMap = new MyHashMap<>();

        myMap.put("BMV", 40000);
        myMap.put("Honda", 12000);
        myMap.put("Lada", 5000);
        myMap.put("Bentley", 100000);
        myMap.put("Lada", 7000);
        System.out.println(myMap.remove("Lada"));

        System.out.println(myMap.size());
        System.out.println(myMap.get("Bentley"));

        System.out.println(myMap);
        myMap.clear();

        MyMap<String, String> testMap = new MyHashMap<>();

        testMap.put("first", "Monday");
        testMap.put("second", "Tuesday");

        System.out.println();
        System.out.println(testMap);
        System.out.println(testMap.size());

    }
}
