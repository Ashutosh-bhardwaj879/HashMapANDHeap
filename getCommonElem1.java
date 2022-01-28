import java.util.*;

class getCommonElem1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] a1 = new int[n1];
        int n2 = scn.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < n1; i++) {
            a1[i] = scn.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            a2[i] = scn.nextInt();
        }
        //hashmap of key,freq  OR arrayElem,freq
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        //setting frequencies of the keys of array 1
        for (int key1 : a1) {
            if (map.containsKey(key1)) {
                int old_freq = map.get(key1);
                int new_freq = old_freq + 1;
                map.put(key1, new_freq);//key with increased frequency
            } else {
                map.put(key1, 1);//latest key till now added
            }
        }
        //if the same key exist in arrray 2 print it and then remove it asap
        // so that it doent repeat
        for (int key2 : a2) {
            if (map.containsKey(key2)) {
                System.out.print(key2+ " ");//printing
                map.remove(key2);//removing
            }
        }
        scn.close();
    }
}
