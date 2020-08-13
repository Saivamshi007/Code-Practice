import java.util.ArrayList;
import java.util.Collections;

public class BinaryHeap {

    ArrayList<Integer> values = new ArrayList<>();

    void insert(int data) {

        values.add(data);

        bubbleUp();

    }

    private void bubbleUp() {

        int idx = values.size() - 1;
        int element = values.get(idx);

        while (idx > 0) {

            int parentidx = (int) Math.floor((idx - 1) / 2);

            int parrent = values.get(parentidx);

            if (element > parrent) {
                Collections.swap(values, parentidx, idx);
                idx = parentidx;

            } else {

                return;
            }

        }

    }

    void show() {
        for (int i : values) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        BinaryHeap heap = new BinaryHeap();

        heap.insert(27);
        heap.insert(33);
        heap.insert(41);
        heap.insert(39);
        heap.insert(18);
        heap.insert(22);
        heap.insert(12);
        heap.insert(11);
        heap.insert(55);
        heap.show();

    }

}
