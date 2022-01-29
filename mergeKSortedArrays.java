import java.util.*;

class MergeKSortedArrays {
    public static class Pair implements Comparable<Pair> {
        int li;
        int di;
        int val;

        Pair(int li, int di, int val) {
            this.li = li;
            this.di = di;
            this.val = val;
        }

        public int compareTo(Pair other) {
            return this.val - other.val;
        }
    }

    public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> lists) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for (int i = 0; i < lists.size(); i++) {
            Pair p = new Pair(i, 0, lists.get(i).get(0));
            pq.add(p);
        }

        while (pq.size() > 0) {
            Pair p = pq.remove();
            res.add(p.val);
            p.di++;

            if (p.di < lists.get(p.li).size()) {
                p.val = lists.get(p.li).get(p.di);
                pq.add(p);
            }
        }

        return res;
    }

    public static void print(ArrayList<Integer> res) {
        System.out.print(res + " ");
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
        int k = scn.nextInt();
        for (int i = 0; i < k; i++) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            int n = scn.nextInt();
            for (int j = 0; j < n; j++) {
                int l = scn.nextInt();
                list.add(l);
            }
            lists.add(list);
        }
        ArrayList<Integer> res = mergeKSortedArrays(lists);
        print(res);
        scn.close();
    }
}
