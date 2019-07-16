package parousidv;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import java.util.ArrayList;

/** This class provides a set of statistical values for an ArrayList of double values
 */
public class StatisticUtilsArrayList {

    //@param my_ArrayList An ArrayList that contains double values

    ArrayList<Double> my_ArrayList = new ArrayList<>();
    DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics();

    // Constructor
    public StatisticUtilsArrayList(){
        my_ArrayList.add(2.3);
        my_ArrayList.add(4.5);
        my_ArrayList.add(1.2);
        for(int i=0; i<my_ArrayList.size(); i++) {
            descriptiveStatistics.addValue(my_ArrayList.get(i));
        }
    }
    public StatisticUtilsArrayList(ArrayList<Double> arrayList){

        for(int i=0; i<arrayList.size(); i++) {
            descriptiveStatistics.addValue(arrayList.get(i));
        }
    }

    /** Gets the Minimum Value
     * @param descriptiveStatistics An object that contains the values of the Arraylist
     * @return The minimum double value
     */
    public static double min(DescriptiveStatistics descriptiveStatistics)
    {
        return descriptiveStatistics.getMin();
    }
    /** Gets the Maximum Value
     * @param descriptiveStatistics An object that contains the values of the Arraylist
     * @return The maximum double value
     */
    public static double max(DescriptiveStatistics descriptiveStatistics)
    {
        return descriptiveStatistics.getMax();
    }
    /** Gets the Median Value
     * @param descriptiveStatistics An object that contains the values of the Arraylist
     * @return The median double value
     */
    public static double median(DescriptiveStatistics descriptiveStatistics)
    {
        return descriptiveStatistics.getPercentile(50);
    }
    /** Gets the Mean Value
     * @param descriptiveStatistics An object that contains the values of the Arraylist
     * @return The mean double value
     */
    public static double mean(DescriptiveStatistics descriptiveStatistics)
    {
        return descriptiveStatistics.getMean();
    }
    /** Gets the Standard Deviation
     * @param descriptiveStatistics An object that contains the values of the Arraylist
     * @return The standard deviation double value
     */
    public static double standDev(DescriptiveStatistics descriptiveStatistics)
    {
        return descriptiveStatistics.getStandardDeviation();
    }
}
