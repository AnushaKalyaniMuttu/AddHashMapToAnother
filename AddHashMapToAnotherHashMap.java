import java.util.HashMap;
import java.util.Map;
 
class AddHashMapToAnotherHashMap {
    public static <K, V> Map<K, V>
    copyMap(Map<K, V> original)
    {
 
        Map<K, V> second_map = new HashMap<>();
 
        // using putAll method to copy from original Map to
        // second_map
        second_map.putAll(original);
 
        return second_map;
    }
 
    public static void main(String[] args)
    {
 
        Map<String, Integer> hashMap = new HashMap<>();
 
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        hashMap.put("C", 3);
 
        // copyMap method would copy the original
        // hashMap to second_Map
        Map<String, Integer> second_map = copyMap(hashMap);
       
        System.out.println(second_map);
    }
}
