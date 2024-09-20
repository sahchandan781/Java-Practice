package Day14HashMap;
import java.util.*;

public class Hashing {
    public static void main(String[] args) {
        // country (key) , population(value)
        HashMap<String , Integer> map = new HashMap<>();

        //Insertion
        map.put("India", 120);
        map.put("china", 30);
        map.put("Nepal", 10);

        System.out.println(map);

        // this will update if key already exist if not it will put a key
        map.put("china", 180);

        System.out.println(map);

        //lookup or search to find the key exist or not
        if(map.containsKey("china")){
            System.out.println("Key is present in the map");
        }
        else {
            System.out.println("key is not present in the map");
        }

        // to get the value associated with key if the key vale exit the it will get printed otherwise will print null 
        System.out.println(map.get("china"));

        //inhanced for loop
        int[] arr = { 12, 123, 111};
        // this loop will directly get you the value not the index
        for( int val : arr){
            System.out.print(val+" ");
        }

        // iteration in Hashmap
        for( Map.Entry<String, Integer> e : map.entrySet()){
            System.out.print(e.getKey() + " ");
            System.out.print(e.getValue());
            System.out.println();
        }

        // iteration using set
        Set<String> keys = map.keySet();
        for( String key : keys){
            System.out.println(key);
        }

        // remove key balue pair

        map.remove("china");
        System.out.println(map);
    }
}
