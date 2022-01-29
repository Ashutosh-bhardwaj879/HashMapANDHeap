import java.util.*;

class getCommonElem2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int[] a1 = new int[n1];
        int[] a2 = new int[n2];
        for (int i = 0; i < n1; i++) {
            a1[i] = scn.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            a2[i] = scn.nextInt();
        }
        // take it sa <key ,freq> map
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        // this for loop makes a key freq mapping of
        // all the intergers in the array1
        for (int key1 : a1) {
            if (map.containsKey(key1)) {
                int old_freq = map.get(key1);
                int new_freq = old_freq + 1;
                map.put(key1, new_freq);
            } else {
                map.put(key1, 1);
            }
        }

        // this will help to print results to
        for (int key2 : a2) {
            // if it contains the key which is present in array 1
            // and also the freq is greater than 0
            if (map.containsKey(key2) && map.get(key2) > 0) {
                System.out.print(key2 + " ");// print the key
                // decrease the count by 1
                int old_freq = map.get(key2);
                int new_freq = old_freq - 1;
                map.put(key2, new_freq);
            }
        }
        scn.close();
    }
}