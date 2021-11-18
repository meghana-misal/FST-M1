package activities.activity9;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {
    public static void main(String[] args){
        List<String> myList =new ArrayList<>();
        System.out.println("Adding Five names in list");
        for(int i=1; i<=5;i++){
            myList.add("name"+i);
            System.out.println(i+" name added in list");
        }
        System.out.println("Printing Size off myList= "+ myList.size());
        System.out.println("Printing third name from myList="+ myList.get(3));
        System.out.println("Printing five names for each loop");
        for (String name:myList){
            System.out.println(name);
        }
        System.out.println("Printing five names using size() method");
        for(int i=0; i<myList.size();i++){
            if(myList.contains("name3")){
                System.out.println("name3 name available in myList");
                myList.remove(myList.get(i));
                System.out.println("name3 name removed from myList");
                break;
            }
        }
        System.out.println("Printing Size off myList After removing name3= "+ myList.size());
    }
}
