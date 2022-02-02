import java.util.*;

class PQ {
    public static class PriorityQueues {
        ArrayList<Integer> data;

        public PriorityQueues() {
            data = new ArrayList<Integer>();
        }

        public void add(int val) {
            data.add(val);
            upheapify(data.size() - 1);
        }

        private void upheapify(int i) {
            if (i == 0) {
                return;
            }
            int pi = (i - 1) / 2;
            if (data.get(i) < data.get(pi)) {
                swap(i, pi);
                upheapify(pi);
            }
        }

        private void swap(int i, int j) {
            int ith = data.get(i);
            int jth = data.get(j);
            data.set(i, jth);
            data.set(j, ith);
        }

        public int remove() {
            if (this.size() == 0) {
                System.out.println("UNDERFLOW");
                return -1;
            }
            swap(0, data.size() - 1);
            int val = data.remove(data.size() - 1);
            downheapify(0);
            return val;
        }

        private void downheapify(int pi) {
            int mini = pi;

            int li = 2 * pi + 1;

            if (li < data.size() && data.get(li) < data.get(mini)) {
                mini = li;
            }

            int ri = 2 * pi + 2;

            if (ri < data.size() && data.get(ri) < data.get(mini)) {
                mini = ri;
            }

            if (mini != pi) {
                swap(pi, mini);
                downheapify(mini);
            }

        }

        public int peek() {
            if (this.size() == 0) {
                System.out.println("UNDERFLOW");
                return -1;
            }
            return data.get(0);// returning the root
        }

        public int size() {
            return data.size();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        PriorityQueues pq = new PriorityQueues();
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);
        pq.add(5);
        pq.add(6);
        System.out.println(pq.peek());
        System.out.println(pq.size());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.peek());
        System.out.println(pq.size());
        scn.close();
    }
}