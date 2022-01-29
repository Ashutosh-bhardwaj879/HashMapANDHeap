import java.util.*;

class medianPriorityQueue {

    public static class MedianPriorityQueue {

        PriorityQueue<Integer> left;
        PriorityQueue<Integer> right;

        public MedianPriorityQueue() {
            left = new PriorityQueue<Integer>(Collections.reverseOrder());
            right = new PriorityQueue<Integer>();
        }

        public void add(int val) {
            if (right.size() > 0 && val > right.peek()) {
                right.add(val);
            } else {
                left.add(val);
            }
            if (left.size() - right.size() == 2) {
                right.add(left.remove());
            } else if (right.size() - left.size() == 2) {
                left.add(right.remove());
            }
        }

        public int remove() {
            if (this.size() == 0) {
                System.out.println("UNDERFLOW");
                return -1;
            } else if (left.size() >= right.size()) {
                return left.remove();
            } else {
                return right.remove();
            }
        }

        public int peek() {
            if (this.size() == 0) {
                System.out.println("UNDERFLOW");
                return -1;
            } else if (left.size() >= right.size()) {
                return left.peek();
            } else {
                return right.peek();
            }
        }

        public int size() {
            return (left.size() + right.size());
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        MedianPriorityQueue mpq = new MedianPriorityQueue();
        mpq.add(10);
        mpq.add(20);
        mpq.add(30);
        mpq.add(40);
        mpq.add(50);
        System.out.println(mpq.peek());
        System.out.println(mpq.remove());
        System.out.println(mpq.peek());
        System.out.println(mpq.remove());
        System.out.println(mpq.peek());
        scn.close();
    }
}