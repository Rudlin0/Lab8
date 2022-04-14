package lab8;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
 * Description: Lab 8 - Making a Hash of Things
 * Author: Rudy Liljeberg
 * Date: 4/11/22
 * Bugs: None that I know of, or provide a description
 * Reflection: Discuss any problems you had with the lab, and how you
 * would rate it (e.g., easy, hard, insanely difficult, etc.)
 */

public class Lab8 {
    public static void main(String[] args) throws Exception {
        HashMapPlayground.printExperimentalResultsTable();
    }

    @Test
    public void testASMC() {
        assertEquals(2.125, TitanProbeHashMap.empiricalAverageSearchMissCost("OOEEOOOE"), 0.0);
    }
}
