package parousidv;

import static java.lang.Double.NaN;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

/**
 * This is a test set for the StatisticUtilsArray class.
 *
 *  @author Vasiliki Parousidou
 *  @version 1.1
 *  @since 15.07.2019
 */
public class StatisticUtilsArrayListTest {

    // Initializing auxiliary variables.
    private ArrayList<Double> arrayList1 = new ArrayList<>();
    private ArrayList<Double> arrayList2 = new ArrayList<>();
    private ArrayList<Double> arrayList3 = null;
    private ArrayList<Double> arrayList4 = new ArrayList<>();
    private int               tol        = 5; //The number of decimals which must be thw same (tolerance)

    /**
     * This method is used for setting the test variables before starting the test process.
     */
    @Before
    public void setUp()
    {
        arrayList1.add(2.5);
        arrayList1.add(0.5);
        arrayList1.add(1.0);
        arrayList1.add(0.0);

        arrayList2.add(1.2);
        arrayList2.add(4.5);
        arrayList2.add(2.3);

    }

    /**
     * This method is used for testing the min method.
     */
    @Test
    public void minTest()
    {
        //assert statements
        assertEquals(0.0,StatisticUtilsArrayList.min(arrayList1),tol);
        assertEquals(1.2,StatisticUtilsArrayList.min(arrayList2),tol);
        assertEquals(NaN,StatisticUtilsArrayList.min(arrayList3),tol);
        assertEquals(NaN,StatisticUtilsArrayList.min(arrayList4),tol);
    }

    /**
     * This method is used for testing the max method.
     */
    @Test
    public void maxTest()
    {
        //assert statements
        assertEquals(2.5,StatisticUtilsArrayList.max(arrayList1),tol);
        assertEquals(4.5,StatisticUtilsArrayList.max(arrayList2),tol);
        assertEquals(NaN,StatisticUtilsArrayList.max(arrayList3),tol);
        assertEquals(NaN,StatisticUtilsArrayList.max(arrayList4),tol);
    }

    /**
     * This method is used for testing the median method.
     */
    @Test
    public void medianTest()
    {
        //assert statements
        assertEquals(0.75,StatisticUtilsArrayList.median(arrayList1),tol);
        assertEquals(2.3,StatisticUtilsArrayList.median(arrayList2),tol);
        assertEquals(NaN,StatisticUtilsArrayList.median(arrayList3),tol);
        assertEquals(NaN,StatisticUtilsArrayList.median(arrayList4),tol);
    }

    /**
     * This method is used for testing the mean method.
     */
    @Test
    public void meanTest()
    {
        //assert statements
        assertEquals(2.0,StatisticUtilsArrayList.mean(arrayList1),tol);
        assertEquals(2.666666666,StatisticUtilsArrayList.mean(arrayList2),tol);
        assertEquals(NaN,StatisticUtilsArrayList.mean(arrayList3),tol);
        assertEquals(NaN,StatisticUtilsArrayList.mean(arrayList4),tol);
    }

    /**
     * This method is used for testing the standard Deviation method.
     */
    @Test
    public void standardDeviationTest()
    {
        //assert statements
        assertEquals(1.0801234497,StatisticUtilsArrayList.standDev(arrayList1),tol);
        assertEquals(1.680277754,StatisticUtilsArrayList.standDev(arrayList2),tol);
        assertEquals(NaN,StatisticUtilsArrayList.standDev(arrayList3),tol);
        assertEquals(NaN,StatisticUtilsArrayList.standDev(arrayList4),tol);


    }
}
