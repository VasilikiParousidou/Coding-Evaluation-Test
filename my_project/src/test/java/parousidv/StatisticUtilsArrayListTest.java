package parousidv;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.util.ArrayList;

public class StatisticUtilsArrayListTest {

    @Test
    public void shouldAnswerTrue()
    {
        ArrayList<Double> arrayList1 = new ArrayList<>();
        arrayList1.add(2.5);
        arrayList1.add(0.5);
        arrayList1.add(1.0);
        arrayList1.add(0.0);

        ArrayList<Double> arrayList2 = new ArrayList<>();
        arrayList2.add(1.2);
        arrayList2.add(4.5);
        arrayList2.add(2.3);

        //@param tol The number of decimals which must be thw same (tolerance)
        int tol = 5;

        //assert statements
        assertEquals(1.2,StatisticUtilsArrayList.min(arrayList1),tol);
        assertEquals(4.5,StatisticUtilsArrayList.max(arrayList1),tol);
        assertEquals(2.3,StatisticUtilsArrayList.median(arrayList1),tol);
        assertEquals(2.666666666,StatisticUtilsArrayList.mean(arrayList1),tol);
        assertEquals(1.680277754,StatisticUtilsArrayList.standDev(arrayList1),tol);

        assertEquals(0.0,StatisticUtilsArrayList.min(arrayList1),tol);
        assertEquals(2.5,StatisticUtilsArrayList.max(arrayList1),tol);
        assertEquals(0.75,StatisticUtilsArrayList.median(arrayList1),tol);
        assertEquals(2.0,StatisticUtilsArrayList.mean(arrayList1),tol);
        assertEquals(1.0801234497,StatisticUtilsArrayList.standDev(arrayList1),tol);


    }
}
