import java.util.*;

class intro {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        System.out.println(map);
        map.put(4, "D");
        map.put(3, "c");
        System.out.println(map);
        System.out.println(map.get(1));// A
        System.out.println(map.get(6));// null
        System.out.println(map.containsKey(1));
        System.out.println(map.containsKey(2));
        System.out.println(map.containsKey(6));

        Set<Integer> keys = map.keySet();
        System.out.println(keys);
        for (Integer key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " " + value);
        }
        scn.close();
    }
}