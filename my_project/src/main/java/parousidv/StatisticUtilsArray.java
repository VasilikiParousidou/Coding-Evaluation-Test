package parousidv;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

/** This class provides a set of statistical values for an array of double values
*/
public class StatisticUtilsArray
{

    // @param my_array An array of double values

    public double[] my_array = {2.3, 4.5 ,1.2};
    DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics();
    // Constructor
    public StatisticUtilsArray(){

        for(int i=0; i<my_array.length; i++) {
            descriptiveStatistics.addValue(my_array[i]);
        }

    }
    public StatisticUtilsArray(double[] array){

        for(int i=0; i<array.length; i++) {
            descriptiveStatistics.addValue(array[i]);
        }

    }
    /** Gets the Minimum Value
     * @param descriptiveStatistics An object that contains the values of the array
     * @return The minimum double value
     */
    public static double min(DescriptiveStatistics descriptiveStatistics)
    {
        return descriptiveStatistics.getMin();
    }
    /** Gets the Maximum Value
     * @param descriptiveStatistics An object that contains the values of the array
     * @return The maximum double value
     */
    public static double max(DescriptiveStatistics descriptiveStatistics)
    {
        return descriptiveStatistics.getMax();
    }
    /** Gets the Median Value
     * @param descriptiveStatistics An object that contains the values of the array
     * @return The median double value
     */
    public static double median(DescriptiveStatistics descriptiveStatistics)
    {
        return descriptiveStatistics.getPercentile(50);
    }
    /** Gets the Mean Value
     * @param descriptiveStatistics An object that contains the values of the array
     * @return The mean double value
     */
    public static double mean(DescriptiveStatistics descriptiveStatistics)
    {
        return descriptiveStatistics.getMean();
    }
    /** Gets the Standard Deviation
     * @param descriptiveStatistics An object that contains the values of the array
     * @return The standard deviation double value
     */
    public static double standDev(DescriptiveStatistics descriptiveStatistics)
    {
        return descriptiveStatistics.getStandardDeviation();
    }
}
