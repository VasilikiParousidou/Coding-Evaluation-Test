package parousidv;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class implements Ascending Minima Algorithm
 *
 *  @author Vasiliki Parousidou
 *  @version 1.1
 *  @since 15.07.2019
 */
public class AscendingMinima {

    /** <p> It creates the ascending minima list of a window. </p>
     *
     * @param window An array that consists of the first k elements of the array that we want to apply
     * Ascending Minima algorithm at
     * @param ama    An empty ArrayList that we are going to return after editing
     *
     * @return An ArrayList which is the ascending minima list of the first window
     */
    public static ArrayList<Integer> ascendingMinima(int[] window, ArrayList<Integer> ama)
    {
        if (window.length == 0)
        {
            return ama;
        }
        else if(window.length == 1)
        {
            ama.add(window[0]);
            return ama;
        }

        // First, we find the minimum element of the window and add it to the list.
        int min   = window[0];
        int index = 0;
        for(int k=1; k<window.length; k++)
        {
            if(window[k]<=min)
            {
                min = window[k];
                index = k;
            }
        }
        ama.add(min);

        // Then we find the minimum element from index+1 to the last element and add it to the list. We repeat
        // until the last element of the window is added to the list.
        ama = ascendingMinima(Arrays.copyOfRange(window, index+1,window.length),ama);
        return ama;
    }

    /**
     * <p> It adjusts the ascending minima when a window shifts by an element</p>
     *
     * @param prevWindow The previous window that we have applied ascending minima
     * @param newElement The new integer that is added to the window
     * @param prevAma    The ascending minima ArrayList that is calculated for the previous window
     *
     * @return An ArrayList which is the ascending minima list of the current window
     */
    public static ArrayList<Integer> minimaAdjustedToShift(int[] prevWindow,int newElement,ArrayList<Integer> prevAma)
    {
        if(prevWindow[0]==prevAma.get(0))
        {
            prevAma.remove(0);
        }
        int i = prevAma.size();
        while (true)
        {
            if (prevAma.get(i - 1) <= newElement) break;
            prevAma.remove(i-1);
            i--;
            if(i<1)
            {break;}
        }
        prevAma.add(newElement);
        return prevAma;
    }

    /**
     * <p> It implements ascending minima algorithm at an array using a sliding window of size k.</p>
     *
     * @param array The array of integers that we apply ascending minima algorithm at
     * @param k     The size of the sliding window
     *
     * @return An ArrayList
     */

    public static ArrayList<Integer> ascendingMinimaAlgorithm(int[] array,int k)
    {
        // window consists of the first k elements of the array
        int[] window = Arrays.copyOfRange(array, 0,k);

        // we initialize the array lists
        ArrayList<Integer> ama    = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        // First, we call ascendingMinima for the first window
        ama = ascendingMinima(window,ama);

        // we add the first element of thw array list that is returned to the result array list
        // because this element is the minimum of thw window
        result.add(ama.get(0));

        // we adjust ascending minima to shift of the window until the last element of the
        // array is examined
        for(int i=k;i<array.length;i++)
        {
            int new_element = array[i];
            ama = minimaAdjustedToShift(window,new_element,ama);
            window = Arrays.copyOfRange(array, i-(k-1),i+1);
            result.add(ama.get(0));
        }
        return result;
    }

}
