package lab8;
import java.util.Random;

public class HashMapPlayground {

    /**
     * Generates maps and fills them with pseudorandom values, 
     * then runs and prints the results of the lab's experiment.
     */
    public static void printExperimentalResultsTable() {
        Random random = new Random(42);
        System.out.printf(" L       Theoretical   Empirical\n");
        System.out.printf("            ASMC         ASMC\n");
        for (double j = 0.1; j <= 0.9; j += 0.1) {
            double empiricalASMC = 0.0;
            for (int i = 0; i < 1000; i++) {
                TitanProbeHashMap<Integer,Character> map = new TitanProbeHashMap<>(8192);
                int numElements = (int) ((int) map.tableSize*j);
                for (int n = 0; n < numElements; n++) {
                    map.put(random.nextInt(), 'O');
                }
                empiricalASMC += map.empiricalAverageSearchMissCost();
            }
            empiricalASMC /= 1000.0;
            double theoreticalASMC = (1.0 + (1.0/Math.pow(1-j, 2))) / 2.0;
            System.out.printf("%.1f        %6.3f      %6.3f\n", j, theoreticalASMC, empiricalASMC);
        }
    }
}