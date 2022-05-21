/*
* Monique Klaassen
* Oct 2015
* GCVI
*
*this class contains methods that involve number manipulation
*/
package mymethods;


public class NumberMethods {
    /**
     * Returns a random number between the two parameters.
     * @param low - The lower number
     * @param high - The higher number
     * @return a random number between low and high
     */
    public static int random(int low, int high)
    {
        int num=low;
        low = Math.min(low,high);
        high = Math.max(num, high);
        return ((int) (low+Math.random()*(high-low+1)));
    }
    
    //rounds num to the number of decimal places determined by decPlaces
    // if decPlaces is < 0 then 0 is returned
    
    public static double round(double num, int decPlaces)
    {
        if(decPlaces<0) return 0;
        else return (int)(num*Math.pow(10,decPlaces)+(Math.signum(num)*.5))/Math.pow(10,decPlaces);
    }
    public static double[] calcQuad(double a,double b, double c){
        double[] array = new double[2];
        array[0] = ((b*-1) + (Math.sqrt((b*b)-(4*a*c))))/(2*a);
        array[1] = ((b*-1) - (Math.sqrt((b*b)-(4*a*c))))/(2*a);
        return array;
    }
    
    
}
