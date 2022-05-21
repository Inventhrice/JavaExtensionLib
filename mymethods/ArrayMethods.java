
package mymethods;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMethods {
        
        
        
        /**
         * Sorts the array, conducts an binary search and returns the first
         * occurrence of the search term
         * @param objectArray
         * @param searchTerm
         * @return 
         */
        public static int indexSearchFirst(String[] objectArray, String searchTerm){
            int middleindex;
            boolean found = false;
            int startIndex=0;
            
            
            Arrays.sort(objectArray);
            middleindex = Arrays.binarySearch(objectArray, searchTerm);
            for(int i = middleindex;i>-1 && i<objectArray.length && !found;i--){
                found = !(objectArray[middleindex].equals(objectArray[middleindex-1]));
                if(found)startIndex=i;
            }
            return startIndex;
        }
        /**
         * Sorts the array, conducts an binary search and returns the last
         * occurrence of the search term
         * @param objectArray
         * @param searchTerm
         * @return 
         */
        public static int indexSearchLast(String[] objectArray, String searchTerm){
            int middleindex;
            boolean found = false,inbound;
            int endIndex=objectArray.length-1;
            Arrays.sort(objectArray);
            middleindex = Arrays.binarySearch(objectArray, searchTerm);
            
            for(int i = middleindex;i>-1 && i<objectArray.length && !found;i++){
                inbound = middleindex+1 < objectArray.length;
                if(inbound)found = !(objectArray[middleindex]
                        .equals(objectArray[middleindex+1]));
                if(found)endIndex=i;
            }
            return endIndex;
        }
         /**
         * Sorts the array and then conducts an binary search on it.
         * Then it iterates through the array until the term does not match the
         * searchTerm. Returns an integer array where index 0 is the start
         * index and index 1 is the end index
         * @param objectArray
         * @param searchTerm
         * @return 
         */
        public static int[] indexSearch(String[] objectArray, String searchTerm){
            int[] indexarray = new int[2];
            indexarray[0]=indexSearchFirst(objectArray,searchTerm);
            indexarray[1]=indexSearchLast(objectArray,searchTerm);
            return indexarray;
        }
        
        
        public static String[] stringToArray(String object){
            String[] newString = new String[object.length()];
            int endIndex,counter=0;
            
            for(;!object.isEmpty();counter++){
                endIndex = object.indexOf(" ");
                newString[counter] = object.substring(0, endIndex+1);
                object = object.replaceFirst(object.substring(0, endIndex+1), "");
            }
            return Arrays.copyOfRange(newString,0,counter);
        }
        
        
        
        
        
        /**
         * Return an array which contains words which is populated from an file
         * @param array
         * @param fileReader
         * @return 
         */
        public static String[] populateFromFileWord(String[] array,Scanner fileReader){
            int counter = 0;
            String[] newArray;
            for(;(counter<array.length)&&(fileReader.hasNext());counter++){
                array[counter] = fileReader.next();
                
            }
            newArray = Arrays.copyOfRange(array, 0, counter);
            return newArray;
        }
        
        /**
         * Return an array which contains lines which is populated from an file
         * @param array
         * @param fileReader
         * @return 
         */
        public static String[] populateFromFileLine(String[] array,Scanner fileReader){
            int counter = 0;
            String[] newArray;
            for(;(counter<array.length)&&(fileReader.hasNextLine());counter++){
                array[counter] = fileReader.nextLine();
            }
            newArray = Arrays.copyOfRange(array, 0, counter);
            return newArray;
        }
        
        /**
         * Return an array which contains integers which is populated from an file
         * @param array
         * @param fileReader
         * @return 
         */
        public static int[] populateFromFile(int[] array,Scanner fileReader){
            int counter = 0;
            int[] newArray;
            for(;(counter<array.length)&&(fileReader.hasNextInt());counter++){
                array[counter] = fileReader.nextInt();
                fileReader.nextLine();
            }
            newArray = Arrays.copyOfRange(array, 0, counter);
            return newArray;
        }
        public static double[] populateFromFile(double[] array,Scanner fileReader){
            int counter = 0;
            double[] newArray;
            for(;(counter<array.length)&&(fileReader.hasNextDouble());counter++){
                array[counter] = fileReader.nextDouble();
                fileReader.nextLine();
            }
            newArray = Arrays.copyOfRange(array, 0, counter);
            return newArray;
        }
        
        public static int forloopsearch(String[] array,String searchterm,int counter){
            int index=0;
            boolean stop;
            stop = array[0].equals(searchterm);
            for(;index<counter && !stop;index++){
                stop = array[index].equals(searchterm);
            }
            if(!stop)index=-1;
            return index;
        }
}
