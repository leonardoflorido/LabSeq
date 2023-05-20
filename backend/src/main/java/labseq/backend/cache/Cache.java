package labseq.backend.cache;

import java.util.LinkedList;

public class Cache {
    private final LinkedList<Integer> cache;

    public Cache() {
        this.cache = new LinkedList<>();
    }

    public void add(int n) {
        this.cache.add(n);
    }

    public int get(int n) {
        return this.cache.get(n);
    }
}
