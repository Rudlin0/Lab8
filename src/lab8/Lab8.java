package lab8;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
 * Description: Lab 8 - Making a Hash of Things
 * Author: Rudy Liljeberg
 * Date: 4/11/22
 * Bugs: None that I know of.
 * Reflection: Relatively easy in comparison to previous labs/assignments. A welcome change of pace.
 */

public class Lab8 {
    
    /** 
     * Calls printExperimentalResultsTable() from the HashMapPlayground class.
     * @param args Not used.
     * @throws Exception Not used.
     */
    public static void main(String[] args) throws Exception {
        HashMapPlayground.printExperimentalResultsTable();
    }

    /**
     * Tests empiricalAverageSearchMissCost() with input string "OOEEOOOE".
     */
    @Test
    public void testASMC() {
        assertEquals(2.125, TitanProbeHashMap.empiricalAverageSearchMissCost("OOEEOOOE"), 0.0);
    }

    /**
     * Tests empiricalAverageSearchMissCost() with input string "OOEEEOEO".
     */
    @Test
    public void testASMC2() {
        assertEquals(1.875, TitanProbeHashMap.empiricalAverageSearchMissCost("OOEEEOEO"), 0.0);
    }

    /**
     * Tests empiricalAverageSearchMissCost() with input string "EOEEEOEO".
     */
    @Test
    public void testASMC3() {
        assertEquals(1.375, TitanProbeHashMap.empiricalAverageSearchMissCost("EOEEEOEO"), 0.0);
    }

    /**
     * Tests empiricalAverageSearchMissCost() with input string "EEOE".
     */
    @Test
    public void testASMC4() {
        assertEquals(1.25, TitanProbeHashMap.empiricalAverageSearchMissCost("EEOE"), 0.0);
    }

    /**
     * Tests empiricalAverageSearchMissCost() with input string "EEEEEEEE".
     */
    @Test
    public void testASMC5() {
        assertEquals(1.0, TitanProbeHashMap.empiricalAverageSearchMissCost("EEEEEEEE"), 0.0);
    }

    /**
     * Tests empiricalAverageSearchMissCost() with input string "OOOOOOE".
     */
    @Test
    public void testASMC6() {
        assertEquals(4.0, TitanProbeHashMap.empiricalAverageSearchMissCost("OOOOOOE"), 0.0);    
    }

    /**
     * Tests empiricalAverageSearchMissCost() with input string "OOOOOOO".
     * Test is supposed to timeout after 10 seconds due to infinite loop.
     */
    @Test(timeout = 10000)
    public void testASMC7() {
        assertEquals(8.0, TitanProbeHashMap.empiricalAverageSearchMissCost("OOOOOOO"), 0.0);    
    }
}
