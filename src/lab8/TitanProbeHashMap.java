package lab8;

public class TitanProbeHashMap<K,V> extends LinearProbingHashTable<K,V> {
    
    /** 
     * Returns a String representation of this map as per the handout.
     * @return String A String representation of this map as per the handout.
     */
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

    
    /** 
     * Calculates the average search miss cost of this map based on the
     * actual values the map contains.
     * @return double The average search miss cost of this map.
     */
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
        return (double) searchMissSumTotal / (double) values.length;
    }

    
    /** 
     * Calculates the average search miss cost of this String based on the
     * actual characters the String contains.
     * @param str A series of "O"s and "E"s arranged as a String.
     * @return double The average search miss cost of the given String as a character array.
     */
    public static double empiricalAverageSearchMissCost(String str) {
        int searchMissSumTotal = 0;
        try {
            for (int i = 0; i < str.length(); i++) {
                if (Character.compare(str.charAt(i), 'E') != 0 && 
                    Character.compare(str.charAt(i), 'O') != 0) {
                    throw new Exception();
                }
            }
            for (int i = 0; i < str.length(); i++) {
                int searchMissSum = 1;
                for (int j = (i + 1) % str.length(); 
                    str.charAt(j) != 'E';
                    j = (j + 1) % str.length()) {
                    searchMissSum++;
                }
                searchMissSumTotal += searchMissSum;
            }
        }
        catch (Exception e) {
            System.out.printf("Exception: Not a valid input string.\n");
        }
        return (double) searchMissSumTotal / (double) str.length();
    }

    /**
     * Calls parent class's constructor with one argument given.
     * @param capacity The total capacity of the hash map.
     */
    public TitanProbeHashMap(int capacity) {
        super(capacity);
    }

    /**
     * Calls parent class's constructor with no arguments given.
     */
    public TitanProbeHashMap() {
        super();
    }
}
