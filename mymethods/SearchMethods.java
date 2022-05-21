package mymethods;
public class SearchMethods {
    public static int binarySearch(Comparable[] array,Comparable key){
        int result = -1,index=0,min=0,max=array.length-1;
        boolean exit = false;
        while(!exit && max>=min){
            index = (min+max)/2;
            if(array[index].compareTo(key)<0)min = index+1;
            else if(array[index].compareTo(key)>0)max = index-1;
            else{
                exit = true;
                result = index;
            }
        }
        return result;
    }
    public static int recurBinarySearch(Comparable[] array,Comparable key){
        if(array.length==0)return -1;
        else return binarySearchRecur(array,key,0,array.length-1);
    }
    private static int binarySearchRecur(Comparable[] array,Comparable key,int min,int max){
        if(min>max)return -1;
        int index = (min+max)/2;
        if(array[index].compareTo(key)<0) return binarySearchRecur(array,key,min,index-1);
        else if(array[index].compareTo(key)>0) return binarySearchRecur(array,key,index+1,max);
        else return index;
    }
}
