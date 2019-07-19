package parousidv;


import static java.lang.Double.NaN;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StatisticUtilsArrayTest {

    // Initializing auxiliary variables.
    private double[] arr1  = {2.5, 0.5, 1.0, 0.0};
    private double[] arr2  = {1.2, 4.5, 2.3};
    private double[] arr3  = null;
    private double[] arr4  = {};
    private int      tol   = 5; //The number of decimals which must be thw same (tolerance)

    /**
     * This method is used for testing the min method.
     */
    @Test
    public void minTest()
    {
        //assert statements
        assertEquals(0.0,StatisticUtilsArray.min(arr1),tol);
        assertEquals(1.2,StatisticUtilsArray.min(arr2),tol);
        assertEquals(NaN,StatisticUtilsArray.min(arr3),tol);
        assertEquals(NaN,StatisticUtilsArray.min(arr4),tol);
    }

    /**
     * This method is used for testing the max method.
     */
    @Test
    public void maxTest()
    {
        //assert statements
        assertEquals(2.5,StatisticUtilsArray.max(arr1),tol);
        assertEquals(4.5,StatisticUtilsArray.max(arr2),tol);
        assertEquals(NaN,StatisticUtilsArray.max(arr3),tol);
        assertEquals(NaN,StatisticUtilsArray.max(arr4),tol);
    }

    /**
     * This method is used for testing the median method.
     */
    @Test
    public void medianTest()
    {
        //assert statements
        assertEquals(0.75,StatisticUtilsArray.median(arr1),tol);
        assertEquals(2.3,StatisticUtilsArray.median(arr2),tol);
        assertEquals(NaN,StatisticUtilsArray.median(arr3),tol);
        assertEquals(NaN,StatisticUtilsArray.median(arr4),tol);
    }

    /**
     * This method is used for testing the mean method.
     */
    @Test
    public void meanTest()
    {
        //assert statements
        assertEquals(2.0,StatisticUtilsArray.mean(arr1),tol);
        assertEquals(2.666666666,StatisticUtilsArray.mean(arr2),tol);
        assertEquals(NaN,StatisticUtilsArray.mean(arr3),tol);
        assertEquals(NaN,StatisticUtilsArray.mean(arr4),tol);
    }

    /**
     * This method is used for testing the standard Deviation method.
     */
    @Test
    public void standardDeviationTest()
    {
        //assert statements
        assertEquals(1.0801234497,StatisticUtilsArray.standDev(arr1),tol);
        assertEquals(1.680277754,StatisticUtilsArray.standDev(arr2),tol);
        assertEquals(NaN,StatisticUtilsArray.standDev(arr3),tol);
        assertEquals(NaN,StatisticUtilsArray.standDev(arr4),tol);


    }

}
