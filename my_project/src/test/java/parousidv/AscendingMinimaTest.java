package parousidv;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.util.ArrayList;

/**
 * This is a test set for the Ascending Minima class
 *
 *  @author Vasiliki Parousidou
 *  @version 1.1
 *  @since 15.07.2019
 */

public class AscendingMinimaTest {

    // Initializing variables
    private int[] window1        = { 8, 9, 5, 3, 6, 5, 1, 1, 0};
    private int[] window2        = { 7, 4, 8, 6, 3, 4, 2, 1, 2};
    private int[] window3        = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private int[] window4        = { 9, 8, 7, 6, 5, 4, 3, 2, 1};
    private int[] window5        = { 9, 1, 1, 3, 4, 2, 6, 8, 9};
    private int[] des1           = { 0};
    private int[] des2           = { 1, 2};
    private int[] des3           = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private int[] des4           = { 1};
    private int[] des5           = { 1, 2, 6, 8, 9};
    private int[] prevWindow     = { 1, 3, 3, 2, 5, 8, 7, 8, 9};
    private int   newElement     = 6;
    private int[] desRes         = { 2, 5, 6};
    private int   k              = 3;
    private int[] array1         = { 4, 3, 2, 1, 5, 7, 6, 8, 9};
    private int[] array2         = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private int[] array3         = { 5, 1, 3, 2, 6, 8, 4, 6};
    private int[] desiredResult1 = { 2, 1, 1, 1, 5, 6, 6};
    private int[] desiredResult2 = { 1, 2, 3, 4, 5, 6, 7};
    private int[] desiredResult3 = { 1, 1, 2, 2, 4, 4};

    /**
     * This method is used for testing the ascendingMinima method.
     */
    @Test
    public void ascendingMinimaTest()
    {
        ArrayList<Integer> ama1 = new ArrayList<>();
        ArrayList<Integer> ama2 = new ArrayList<>();
        ArrayList<Integer> ama3 = new ArrayList<>();
        ArrayList<Integer> ama4 = new ArrayList<>();
        ArrayList<Integer> ama5 = new ArrayList<>();

        // We call the method for three cases
        ArrayList<Integer> result1 = AscendingMinima.ascendingMinima(window1,ama1);
        ArrayList<Integer> result2 = AscendingMinima.ascendingMinima(window2,ama2);
        ArrayList<Integer> result3 = AscendingMinima.ascendingMinima(window3,ama3);
        ArrayList<Integer> result4 = AscendingMinima.ascendingMinima(window4,ama4);
        ArrayList<Integer> result5 = AscendingMinima.ascendingMinima(window5,ama5);

        // Assert statements
        // We test if each element of the result ArrayList is equal to the desired.
        int res;
        for(int i=0; i<des1.length; i++) {
            res = result1.get(i);
            assertEquals(des1[i],res);
        }

        for(int i=0; i<des2.length; i++) {
            res = result2.get(i);
            assertEquals(des2[i],res);
        }

        for(int i=0; i<result3.size(); i++) {
            res = result3.get(i);
            assertEquals(des3[i],res);
        }

        for(int i=0; i<result4.size(); i++) {
            res = result4.get(i);
            assertEquals(des4[i],res);
        }

        for(int i=0; i<result5.size(); i++) {
            res = result5.get(i);
            assertEquals(des5[i],res);
        }

    }
    /**
     * This method is used for testing the minimaAdjustedToShift method.
     */
    @Test
    public void minimaAdjustedToShiftTest()
    {
        // Initialize the previous ama
        ArrayList<Integer> prevAma = new ArrayList<>();
        prevAma.add(1);
        prevAma.add(2);
        prevAma.add(5);
        prevAma.add(7);
        prevAma.add(8);
        prevAma.add(9);

        ArrayList<Integer> result = AscendingMinima.minimaAdjustedToShift(prevWindow,newElement,prevAma);

        // Assert statements
        // We test if each element of the result ArrayList is equal to the desired.
        int res;
        for(int i=0; i<result.size(); i++) {
            res = result.get(i);
            assertEquals(desRes[i],res);
        }
    }

    /**
     * This method is used for testing the ascendingMinimaAlgorithm method.
     */
    @Test
    public void ascendingMinimaAlgorithmTest()
    {
        // We call the method for three cases
        ArrayList<Integer> result1 = AscendingMinima.ascendingMinimaAlgorithm(array1,k);
        ArrayList<Integer> result2 = AscendingMinima.ascendingMinimaAlgorithm(array2,k);
        ArrayList<Integer> result3 = AscendingMinima.ascendingMinimaAlgorithm(array3,k);

        // Assert statements
        // We test if each element of the result ArrayList is equal to the desired.
        int res;
        for(int i=0; i<result1.size(); i++) {
            res = result1.get(i);
            assertEquals(desiredResult1[i],res);
        }

        for(int i=0; i<result2.size(); i++) {
            res = result2.get(i);
            assertEquals(desiredResult2[i],res);
        }

        for(int i=0; i<result3.size(); i++) {
            res = result3.get(i);
            assertEquals(desiredResult3[i],res);
        }
    }
}

