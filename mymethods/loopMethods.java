/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mymethods;

import java.util.Scanner;

public class loopMethods {
    
    private static Scanner input = new Scanner(System.in);
    /**
         * 
         * A method which breaks a loop by using a boolean
         * @param loopbreaker This character is the sentinel
         * @param prompt The prompt which is displayed.
         * @return
         */
        public static boolean yee(char loopbreaker,String prompt){
            boolean returner;
            char checker;
            System.out.print(prompt);
            checker = input.next().trim().charAt(0);
            returner = checker == loopbreaker;
            return returner;
        }
        public static boolean yee(int loopbreaker,String prompt){
            return mymethods.GetMethods.getInt(prompt)==loopbreaker;
        }
        /**
         * Return true if the character is from a-z (lowercase)
         * @param letter
         * @return 
         */
        public static boolean within_az(char letter){
            int letterNum = (int) letter;
            return letterNum>=unicodeValues.smallA && letterNum <= 
                unicodeValues.smallZ;
        }
        /**
         * Return true if the character is from a-z (uppercase)
         * @param letter
         * @return 
         */
        public static boolean within_AZ(char letter){
            int letterNum = (int) letter;
            return letterNum>=unicodeValues.bigA && letterNum <=
                    unicodeValues.bigZ;
        }
        

}
