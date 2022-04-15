package lab8;

public class TitanProbeHashMap<K,V> extends LinearProbingHashTable<K,V> {
    @Override
    public String toString() {
        String cellString = "";
        for (int i = 0; i < 80; i++) {
            if (values[i] != null) {
                cellString = cellString.concat("O");
            }
            else {
                cellString = cellString.concat("E");
            }
        }
        cellString = cellString.concat("\n");

        for (int j = 1; j < tableSize / 80; j++) {
            for (int k = 0; k < 80; k++) {
                if(values[j*k+80] != null) {
                    cellString = cellString.concat("O");
                }
                else {
                    cellString = cellString.concat("E");
                }
            }
            cellString = cellString.concat("\n");
        }
        return cellString;
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
        char[] values = str.toCharArray();
        int searchMissSumTotal = 0;
        for (int i = 0; i < values.length; i++) {
            int searchMissSum = 1;
            for (int j = (i + 1) % values.length; 
                 values[j] != 'E';
                 j = (j + 1) % values.length) {
                searchMissSum++;
            }
            searchMissSumTotal += searchMissSum;
        }
        return (double) searchMissSumTotal / (double) values.length;
    }

    public TitanProbeHashMap(int capacity) {
        super(capacity);
    }

    public TitanProbeHashMap() {
        super();
    }
}
