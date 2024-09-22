package Day14HashMap;
import java.util.HashSet; 
import java.util.Iterator;
public class HashSett {
    public static void main(String[] args) {
        // creation of hashset
        HashSet<Integer> set = new HashSet<>();

        //insertion in set 
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(1);
        System.out.println(set);

        // searching -- contains 
        System.out.println(set.contains(1));

        // delete remove
        set.remove(1);
        System.out.println(set.contains(1));

        // size of set
        System.out.println(set.size());

        // Iterator
        Iterator it = set.iterator();

        // hasNext();... next
        System.out.println(it.next());

        // hasNext() returns either true or false
        System.out.println(it.hasNext());

        // loop 
        while(it.hasNext()){
            System.out.println(it.next());
        }

        
    }
}
