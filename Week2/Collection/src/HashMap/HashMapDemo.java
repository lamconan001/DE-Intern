package HashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Iterator;
public class HashMapDemo {

    public static void main(String args[]) {

        Map<String, Integer> stockPrice = new HashMap<>();

        stockPrice.put("Oracle", 56);
        stockPrice.put("Fiserv", 117);
        stockPrice.put("BMW", 73);
        stockPrice.put("Microsoft", 213);
        stockPrice.put("Google", 421);
        stockPrice.put("Ford", 456);
        stockPrice.put("Novartis", 43);
        stockPrice.put("TCS", 23);

        Set<Entry<String, Integer>> entrySet = stockPrice.entrySet();
        Iterator<Entry<String, Integer>> itr = entrySet.iterator();

        while (itr.hasNext()){
            Entry<String, Integer> entry = itr.next();
            if (entry.getValue()<50)
                itr.remove();
        }
        System.out.println(stockPrice);
    }
}
