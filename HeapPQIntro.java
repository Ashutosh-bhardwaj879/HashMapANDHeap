import java.util.*;

class HeapPQIntro {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());

        int[] arr = { 12, 45, 213, 1, 2, 67, 999 };
        for (int val : arr) {
            pq.add(val);
            pq1.add(val);
        }

        while (pq.size() > 0) {
            System.out.print(pq.peek()+" ");
            pq.remove();
        }
        System.out.println();
        while(pq1.size() > 0) {
            System.out.print(pq1.peek()+" ");
            pq1.remove();
        }
        scn.close();
    }
}
