package activities.activity10;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {
    public static void main(String[] args){
        Set<String> hs= new HashSet<>();
        hs.add("Object1");
        hs.add("Object2");
        hs.add("Object3");
        hs.add("Object4");
        hs.add("Object5");
        hs.add("Object6");
        System.out.println("Hashset size="+hs.size());
        System.out.println("Original hashset="+hs);
        System.out.println("removed Object6 from hashset="+hs.remove("Object6"));
        System.out.println("hashset after removing object6="+hs);
        if(hs.remove("Object6")) {
            System.out.println("Object6 available in set");
        } else {
            System.out.println("Object6 not available in set to remove");
        }
        System.out.println("Object3 available in hashset="+hs.contains("Object3"));
    }
}
