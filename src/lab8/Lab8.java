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

    @Test
    public void testASMC2() {
        assertEquals(1.875, TitanProbeHashMap.empiricalAverageSearchMissCost("OOEEEOEO"), 0.0);
    }

    @Test
    public void testASMC3() {
        assertEquals(1.375, TitanProbeHashMap.empiricalAverageSearchMissCost("EOEEEOEO"), 0.0);
    }

    @Test
    public void testASMC4() {
        assertEquals(1.25, TitanProbeHashMap.empiricalAverageSearchMissCost("EEOE"), 0.0);
    }

    @Test
    public void testASMC5() {
        assertEquals(1.0, TitanProbeHashMap.empiricalAverageSearchMissCost("EEEEEEEE"), 0.0);
    }

    @Test
    public void testASMC6() {
        assertEquals(4.0, TitanProbeHashMap.empiricalAverageSearchMissCost("OOOOOOE"), 0.0);    
    }

    @Test(timeout = 10000)
    public void testASMC7() {
        assertEquals(8.0, TitanProbeHashMap.empiricalAverageSearchMissCost("OOOOOOO"), 0.0);    
    }
}
