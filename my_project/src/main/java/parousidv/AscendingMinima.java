package parousidv;

import java.util.ArrayList;
import java.util.Arrays;

/** This class implements Ascending Minima Algorithm
 */
public class AscendingMinima {

    /** <p> It creates the ascending minima list of a window. </p>
     * @return An ArrayList which is the ascending minima list of the first window
     * @param window An array that consists of the first k elements of the array that we want to apply
     * Ascending Minima algorithm at
     * @param ama An empty ArrayList that we are going to return after editing
     */
    public ArrayList<Integer> ascending_minima(int[] window, ArrayList<Integer> ama)
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
        else
        {
            // First, we find the minimum element of the window and add it to the list. Let the index of this
            // element be i. Then it finds the minimum from i+1 to k element and add it to the list. It repeats
            // until the last element of the window is added to the list.
            int min = window[0];
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
            ama = ascending_minima(Arrays.copyOfRange(window, index+1,window.length),ama);
            return ama;
        }
    }

    /**
     * <p> It adjusts the ascending minima when a window shifts by an element</p>
     * @param prev_window The previous window that we have applied ascending minima
     * @param new_element The new integer that is added to the window
     * @param prev_ama The ascending minima ArrayList that is calculated for the previous window
     * @return An ArrayList which is the ascending minima list of the current window
     */
    public ArrayList<Integer> minima_adjusted_to_shift(int[] prev_window,int new_element,ArrayList<Integer> prev_ama)
    {
        if(prev_window[0]==prev_ama.get(0))
        {
            prev_ama.remove(0);
        }
        int i = prev_ama.size();
        while (prev_ama.get(i-1)>new_element)
        {
            prev_ama.remove(i-1);
            i--;
            if(i<1)
            {break;}
        }
        prev_ama.add(new_element);
        return prev_ama;
    }

    /**
     * <p> It implements ascending minima algorithm at an array using a sliding window of size k.</p>
     * @param array The array of integers that we apply ascending minima algorithm at
     * @param k The size of the sliding window
     * @return An ArrayList
     */

    public ArrayList<Integer> ascending_minima_algorithm(int[] array,int k)
    {
        int[] window = Arrays.copyOfRange(array, 0,k);
        ArrayList<Integer> ama = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        ama = ascending_minima(window,ama);
        result.add(ama.get(0));
        for(int i=k;i<array.length;i++)
        {
            int new_element = array[i];
            ama = minima_adjusted_to_shift(window,new_element,ama);
            window = Arrays.copyOfRange(array, i-(k-1),i+1);
            result.add(ama.get(0));
        }
        return result;
    }
}
