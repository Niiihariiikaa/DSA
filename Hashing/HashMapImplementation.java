import java.util.*;

public class HashMapImplementation {

    static class HashMap<K, V> {
        class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node>[] buckets;

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[N];
            for (int i = 0; i < N; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashfunc(K key) {
            int hash = key.hashCode();
            return Math.abs(hash) % N;
        }

        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key.equals(key)) {
                    return i;
                }
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node>[] oldBuckets = buckets;
            N = N * 2;
            buckets = new LinkedList[N];
            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }

            n = 0;
            for (LinkedList<Node> ll : oldBuckets) {
                for (Node node : ll) {
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            int bi = hashfunc(key);
            int di = searchInLL(key, bi);

            if (di == -1) {
                buckets[bi].add(new Node(key, value));
                n++;
            } else {
                Node data = buckets[bi].get(di);
                data.value = value;
            }

            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        public V get(K key) {
            int bi = hashfunc(key);
            int di = searchInLL(key, bi);

            if (di == -1) return null;

            return buckets[bi].get(di).value;
        }

        public boolean containsKey(K key) {
            return searchInLL(key, hashfunc(key)) != -1;
        }

        public V remove(K key) {
            int bi = hashfunc(key);
            int di = searchInLL(key, bi);

            if (di == -1) return null;

            Node removed = buckets[bi].remove(di);
            n--;
            return removed.value;
        }

        public boolean isEmpty() {
            return n == 0;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> h = new HashMap<>();
        h.put("INDIA", 100);
        h.put("CHINA", 200);
        h.put("US", 190);

        System.out.println(h.get("INDIA"));
        System.out.println(h.remove("INDIA"));
        System.out.println(h.containsKey("INDIA"));
        System.out.println(h.isEmpty());
    }
}
