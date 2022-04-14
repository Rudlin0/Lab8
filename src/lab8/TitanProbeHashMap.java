package lab8;

public class TitanProbeHashMap<K,V> extends LinearProbingHashTable<K,V> {
    @Override
    public String toString() {
        return null;
    }

    public double empiricalAverageSearchMissCost() {
        int searchMissSumTotal = 0;
        for (int i = 0; i < values.length; i++) {
            int searchMissSum = 1;
            for (int j = (i + 1) % values.length; 
                 values[j] != null;
                 j = (j + 1) % values.length) {
                searchMissSum++;
            }
            searchMissSumTotal += searchMissSum;
        }
        return (double) searchMissSumTotal / (double) keys.length;
    }

    public static double empiricalAverageSearchMissCost(String str) {
        char[] keys = str.toCharArray();
        int searchMissSumTotal = 0;
        for (int i = 0; i < keys.length; i++) {
            int searchMissSum = 1;
            int j = (i + 1) % keys.length;
            while (keys[j] != 'E') {
                searchMissSum++;
                j++;
            }
            searchMissSumTotal += searchMissSum;
        }
        return (double) searchMissSumTotal / (double) keys.length;
    }

    public TitanProbeHashMap(int capacity) {
        super(capacity);
    }

    public TitanProbeHashMap() {
        super();
    }
}
