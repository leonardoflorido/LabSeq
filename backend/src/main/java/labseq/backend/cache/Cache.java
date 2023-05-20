package labseq.backend.cache;

import java.util.HashMap;

public class Cache {
    private final HashMap<Integer, Integer> cache;

    public Cache() {
        this.cache = new HashMap<>();
    }

    public boolean containsKey(Integer key) {
        return this.cache.containsKey(key);
    }

    public Integer get(Integer key) {
        return this.cache.get(key);
    }

    public void put(Integer key, Integer value) {
        this.cache.put(key, value);
    }
}
