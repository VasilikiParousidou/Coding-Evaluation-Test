package parousidv;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

import java.util.ArrayList;

/**
 *  This class provides a set of statistical values for an ArrayList of double values
 *
 *  @author Vasiliki Parousidou
 *  @version 1.1
 *  @since 15.07.2019
 */
public class StatisticUtilsArrayList {

    /**
     * This variable is responsible for sending information to the log file.
     */

    /**
     * This variable is an object that contains the values of an array list.
     */
    private static DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics();

    /**
     * This method is responsible for adding the values from an array list to the DescriptiveStatistics object.
     *
     * @param arrayList An array list that contains double numbers.
     */
    static void fillDescriptiveStatistics(ArrayList<Double> arrayList)
    {
        /* In case the input is null */
        if (arrayList == null)
        {
            System.out.println("The array list input is null.");
        }
        /* In case the array is empty. */
        else if (arrayList.isEmpty())
        {
            System.out.println("The array list input is empty.");
        }
        /* Add the values to the descriptiveStatistics object */
        else
        {
            for (Double aDouble : arrayList) {
                descriptiveStatistics.addValue(aDouble);
            }
        }
    }


    /**
     * This method is responsible for estimating the minimum value from an array list of double numbers.
     *
     * @param array An array list of double numbers.
     *
     * @return The minimum value, as a double number
     */
    public static double min(ArrayList<Double> array)
    {
        // First, it clears the descriptiveStatistics object.
        descriptiveStatistics.clear();

        // It adds the values of the array to the descriptiveStatistics object
        fillDescriptiveStatistics(array);

        return descriptiveStatistics.getMin();
    }

    /**
     * This method is responsible for estimating the maximum value from an array list of double numbers.
     *
     * @param array An array list of double numbers.
     *
     * @return The maximum value, as a double number
     */
    public static double max(ArrayList<Double> array)
    {
        // First, it clears the descriptiveStatistics object.
        descriptiveStatistics.clear();

        // It adds the values of the array to the descriptiveStatistics object
        fillDescriptiveStatistics(array);

        return descriptiveStatistics.getMax();
    }

    /**
     * This method is responsible for estimating the median value from an array list of double numbers.
     *
     * @param array An array list of double numbers.
     *
     * @return The median value, as a double number
     */
    public static double median(ArrayList<Double> array)
    {
        // First, it clears the descriptiveStatistics object.
        descriptiveStatistics.clear();

        // It adds the values of the array to the descriptiveStatistics object
        fillDescriptiveStatistics(array);

        return descriptiveStatistics.getPercentile(50);
    }
    /**
     * This method is responsible for estimating the mean value from an array list of double numbers.
     *
     * @param array An array list of double numbers.
     *
     * @return The mean value, as a double number
     */
    public static double mean(ArrayList<Double> array)
    {
        // First, it clears the descriptiveStatistics object.
        descriptiveStatistics.clear();

        // It adds the values of the array to the descriptiveStatistics object
        fillDescriptiveStatistics(array);

        return descriptiveStatistics.getMean();
    }

    /**
     *  This method is responsible for estimating the standard deviation from an array of double numbers.
     *
     * @param array An array of double numbers.
     *
     * @return The standard deviation, as a double number
     */
    public static double standDev(ArrayList<Double> array)
    {
        // First, it clears the descriptiveStatistics object.
        descriptiveStatistics.clear();

        // It adds the values of the array to the descriptiveStatistics object
        fillDescriptiveStatistics(array);

        return descriptiveStatistics.getStandardDeviation();
    }
}
