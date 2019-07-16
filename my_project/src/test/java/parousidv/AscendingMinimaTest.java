package parousidv;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.util.ArrayList;

public class AscendingMinimaTest {

    @Test
    public void shouldAnswerTrue()
    {
        AscendingMinima tester = new AscendingMinima();
        int[] array = { 4, 3, 2, 1, 5, 7, 6, 8, 9};
        int k = 3;
        ArrayList<Integer> result = tester.ascending_minima_algorithm(array,k);
        int[] desiredResult = {2, 1, 1, 1, 5, 6, 6};
        int x;
        for(int i=0; i<result.size(); i++) {
            x = result.get(i);
            assertEquals(desiredResult[i],x);
        }
    }
}

