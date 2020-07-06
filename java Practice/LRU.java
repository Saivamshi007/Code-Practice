import java.util.HashMap;

public class LRU {
    public static void main(final String[] args) {

        LRUCache lrucache = new LRUCache();

        lrucache.Storage(3);
        lrucache.put(1, 1);
        lrucache.put(2, 2);
        lrucache.put(3, 3);
        lrucache.put(4, 4);

        System.err.println(lrucache.get(1));
        System.out.println(lrucache.show());

    }

    static class LRUCache {

        private int capacity;
        HashMap<Integer, Integer> list = new HashMap<>();

        void Storage(final int capacity) {
            this.capacity = capacity;

        }

        void put(final int key, final int value) {

            if (this.capacity > list.size()) {

                this.list.put(key, value);

            } else {
                list.remove(list.entrySet().iterator().next().getKey());
                list.put(key, value);
            }

        }

        int get(final int key) {

            if (!(list.containsKey(key)))
                return -1;

            int v = this.list.get(key);
            list.remove(key);
            list.put(key, v);

            return list.get(key);

        }

        HashMap<Integer, Integer> show() {

            return list;

        }

    }

}
