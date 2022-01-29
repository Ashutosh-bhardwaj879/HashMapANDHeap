import java.util.*;

class longestConsecutiveSequence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();

        for (int val : arr) {
            map.put(val, true);
        }

        for (int val : arr) {
            if (map.containsKey(val - 1)) {
                map.put(val, false);
            }
        }
        int max_start_point = 0;
        int max_len = 0;
        for (int val : arr) {
            if (map.get(val) == true) {
                int temp_length = 1;
                int temp_start_point = val;

                while (map.containsKey(temp_start_point + temp_length)) {
                    temp_length++;
                }

                if (temp_length > max_len) {
                    max_len = temp_length;
                    max_start_point = temp_start_point;
                }
            }
        }

        for (int i = 0; i < max_len; i++) {
            System.out.print((max_start_point + i) + " ");
        }
        scn.close();
    }
}