import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Sample_hash_map {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        //Them cac gia tri tuong ung vao cac key
        hashMap.put("apple", "qua tao");
        hashMap.put("ball", "qua bong");
        hashMap.put("cat", "con meo");
        hashMap.put("do", "lam");

        // Hien thi gia tri ben trong hashmap
        Set set = hashMap.entrySet();
        Iterator iterator = set.iterator();
        System.out.println("English\tVietnamese");
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.print(mentry.getKey() + "\t");
            System.out.println(mentry.getValue());
        }

        // Lay gia tri dua vao key
        String s = hashMap.get("cat");
        System.out.print("Cat means: " + s);
    }
}
