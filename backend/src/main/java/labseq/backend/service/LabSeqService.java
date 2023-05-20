package labseq.backend.service;

import labseq.backend.cache.Cache;
import org.springframework.stereotype.Service;

@Service
public class LabSeqService {
    private final Cache cache;

    public LabSeqService() {
        this.cache = new Cache();
    }

    public int getValue(int n) {
        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        if (n == 0 || n == 2) {
            return 0;
        } else if (n == 1 || n == 3) {
            return 1;
        } else {
            int result = getValue(n - 4) + getValue(n - 3);
            cache.put(n, result);
            return result;
        }
    }
}
