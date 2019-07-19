package parousidv;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

/**
 * This class provides a set of statistical values for an array of double values
 *
 * @author Vasiliki Parousidou
 * @version 1.1
 * @since 15.07.2019
*/
public class StatisticUtilsArray {

    /**
     * This variable is an object that contains the values of an array.
     */
    private static DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics();

    /**
     * This method is responsible for adding the values from an array to the DescriptiveStatistics object.
     *
     * @param array An array that contains double numbers.
     */
    static void fillDescriptiveStatistics(double[] array)
    {
        /* In case the input is null */
        if (array == null)
        {
            System.out.println("The array input is null.");
        }
        /* In case the array is empty. */
        else if (array.length == 0)
        {
            System.out.println("The array input is empty.");
        }
        /* Add the values to the descriptiveStatistics object */
        else
        {
            for (double v : array) {
                descriptiveStatistics.addValue(v);
            }
        }
    }

    /**
     * This method is responsible for estimating the minimum value from an array of double numbers.
     *
     * @param array An array of double numbers.
     *
     * @return The minimum value, as a double number
     */
    public static double min(double[]  array)
    {
        // First, it clears the descriptiveStatistics object.
        descriptiveStatistics.clear();

        // It adds the values of the array to the descriptiveStatistics object
        fillDescriptiveStatistics(array);

        return descriptiveStatistics.getMin();
    }

    /**
     * This method is responsible for estimating the maximum value from an array of double numbers.
     *
     * @param array An array of double numbers.
     *
     * @return The maximum value, as a double number
     */
    public static double max(double[]  array)
    {
        // First, it clears the descriptiveStatistics object.
        descriptiveStatistics.clear();

        // It adds the values of the array to the descriptiveStatistics object
        fillDescriptiveStatistics(array);

        return descriptiveStatistics.getMax();
    }

    /**
     * This method is responsible for estimating the median value from an array of double numbers.
     *
     * @param array An array of double numbers.
     *
     * @return The median value, as a double number
     */
    public static double median(double[]  array)
    {
        // First, it clears the descriptiveStatistics object.
        descriptiveStatistics.clear();

        // It adds the values of the array to the descriptiveStatistics object
        fillDescriptiveStatistics(array);

        return descriptiveStatistics.getPercentile(50);
    }

    /**
     * This method is responsible for estimating the mean value from an array of double numbers.
     *
     * @param array An array of double numbers.
     *
     * @return The mean value, as a double number
     */
    public static double mean(double[]  array)
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
    public static double standDev(double[]  array)
    {
        // First, it clears the descriptiveStatistics object.
        descriptiveStatistics.clear();

        // It adds the values of the array to the descriptiveStatistics object
        fillDescriptiveStatistics(array);

        return descriptiveStatistics.getStandardDeviation();
    }
}
