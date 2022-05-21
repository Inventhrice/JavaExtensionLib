/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mymethods;

import java.util.Arrays;

/**
 *
 * @author avbha2207
 */
public class arrayPrint {
        public static void arrayprint(String[] array){
            System.out.println(Arrays.toString(array));
        }
        public static void arrayprint(boolean[] array){
            System.out.println(Arrays.toString(array));
        }
        public static void arrayprint(int[] array){
            System.out.println(Arrays.toString(array));
        }
        
        
        
        public static void arrayPrintNum(int[] array){
            for(int i=0;i<array.length;i++)System.out.print(array[i]);
        }
        
        
        
        public static void arrayprint(String[] array, String prompt){
            System.out.println(prompt);
            System.out.println(Arrays.toString(array));
        }
        public static void arrayprint(boolean[] array, String prompt){
            System.out.println(prompt);
            System.out.println(Arrays.toString(array));
        }
        public static void arrayprint(int[] array, String prompt){
            System.out.println(prompt);
            System.out.println(Arrays.toString(array));
        }
        public static void arrayPrintNum(int[] array, String prompt){
            for(int i=0;i<array.length;i++)System.out.print(array[i]);
        }
        
        
        
        /**
         * returns a printed string without the [... , ... , ...] format
         * @param array 
        * @return  
         */
        public static String arrayPrintString(char[] array){
            String word = "";
            for(int i=0;i<array.length;i++)word+=array[i];
            return word;
        }
        
        /**
         * returns a printed string without the [... , ... , ...] format
         * @param array 
        * @return  
         */
        public static String arrayPrintString(String[] array){
            String word = "";
            for(int i=0;i<array.length;i++){
                word+=array[i]+", ";
                if(i==(array.length-1))word+=array[i];
            }
            return word;
        }
        
        /**
         * print a sorted array from an range.
         * @param array
         * @param from
         * @param to 
         */
        public static void toStringRange(String[] array,int from,int to){
            String[] nArray = Arrays.copyOfRange(array,from,to);
            Arrays.sort(nArray);
            System.out.println(Arrays.toString(nArray));
        }
}
