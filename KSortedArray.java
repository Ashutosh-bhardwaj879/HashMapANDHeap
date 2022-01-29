import java.util.*;

class KSortedArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (int i = 0; i <= k; i++) {
            pq.add(arr[i]);
        }
        for (int i = k + 1; i < n; i++) {
            System.out.print(pq.remove() + " ");
            pq.add(arr[i]);
        }
        while (pq.size() > 0) {
            System.out.print(pq.remove() + " ");
        }
        scn.close();
    }
}
