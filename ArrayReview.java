public class ArrayReview
{

    /**
     * Write a method that will return a String with the name 
     * of each employee from a given array (separated by a space) 
     * who has been with the company for over 20 years.   
     * Assume there are no null employees in the array.
     * IMPORTANT:  Use a regular for loop. 
     */
    public static String getNames(Employee[] employees)
    {
        String names = "";
        for (int i = 0; i < employees.length; i++) {
          if (employees[i].getYears() > 20) {
            names += employees[i].getName() + " ";
          }
        }
        return names.trim();
    }

    /**
     * Suppose that nums is an array of doubles.  
     * Write a method that will find the average of 
     * only the positive numbers in the array.   
     * IMPORTANT:  Use an enhanced for loop.
     */
    public static double average(double[] nums)
    {
        double sum = 0.0;
        int number = 0;
        for (double a : nums) {
          if (a > 0) {
            sum += a;
            number++;
          }
        }
        double average = 0.0;
        if (number > 0) {
          average = sum/number;
        }
        return average;
    }
}
