package parousidv;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StatisticUtilsArrayTest {

    @Test
    public void shouldAnswerTrue()
    {
        // we test a case with an empty constructor
        StatisticUtilsArray tester1 = new StatisticUtilsArray();
        double[] arr = {2.5, 0.5, 1.0, 0.0};
        StatisticUtilsArray tester2 = new StatisticUtilsArray(arr);
        //@tol : The number of decimals which must be thw same (tolerance)
        int tol = 5;

        //assert statements
        assertEquals(1.2,tester1.min(tester1.descriptiveStatistics),tol);
        assertEquals(4.5,tester1.max(tester1.descriptiveStatistics),tol);
        assertEquals(2.3,tester1.median(tester1.descriptiveStatistics),tol);
        assertEquals(2.666666666,tester1.mean(tester1.descriptiveStatistics),tol);
        assertEquals(1.680277754,tester1.standDev(tester1.descriptiveStatistics),tol);

        assertEquals(0.0,tester2.min(tester2.descriptiveStatistics),tol);
        assertEquals(2.5,tester2.max(tester2.descriptiveStatistics),tol);
        assertEquals(0.75,tester2.median(tester2.descriptiveStatistics),tol);
        assertEquals(2.0,tester2.mean(tester2.descriptiveStatistics),tol);
        assertEquals(1.0801234497,tester2.standDev(tester2.descriptiveStatistics),tol);

    }

}
