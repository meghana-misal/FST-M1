package activities.activity11;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
    public static void main(String[] args) {
        Map<Integer, String> hm = new HashMap<>();
        hm.put(1, "Green");
        hm.put(2, "Red");
        hm.put(3, "Yellow");
        hm.put(4, "Black");
        hm.put(5, "Orange");
        System.out.println("Map: " + hm);
        hm.remove(5);
        System.out.println("Remove Orange: " + hm);
        if(hm.containsValue("Yellow")) {
            System.out.println("Yellow available");
        } else {
            System.out.println("Yellow not available");
        }
        System.out.println("Size of Map = " + hm.size());
    }
}
