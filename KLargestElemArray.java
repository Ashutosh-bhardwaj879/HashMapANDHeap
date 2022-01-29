import java.util.*;

class KLargestElemArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();

        // PriorityQueue<Integer> pq = new
        // PriorityQueue<Integer>(Collections.reverseOrder());

        PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();

        for (int i = 0; i < n; i++) {
            if (i < k) {
                pq1.add(arr[i]);
            } else {
                if (arr[i] > pq1.peek()) {
                    pq1.remove();
                    pq1.add(arr[i]);
                }
            }
        }
        while (pq1.size() > 0) {
            System.out.print(pq1.remove() + " ");
        }
        /*
         * for (int val : arr) {
         * pq.add(val);
         * }
         * 
         * for (int i = 0; i < k; i++) {
         * System.out.print(pq.peek() + " ");
         * pq.remove();
         * }
         */
        scn.close();
    }
}
