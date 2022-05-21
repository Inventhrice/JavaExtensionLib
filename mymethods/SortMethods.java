package mymethods;
public class SortMethods 
{
    public static boolean checkSortedAscending(Comparable[] array){
        boolean sorted = true;
        for(int i=0;i<(array.length-1) && sorted;i++){
            sorted = array[i].compareTo(array[i+1]) <= 0;
        }
        return sorted;
    }
    public static boolean checkSortedDescending(Comparable[] array){
        boolean sorted = true;
        for(int i=0;i<(array.length-1) && sorted;i++){
            sorted = array[i].compareTo(array[i+1]) >= 0;
        }
        return sorted;
    }
    public static void bubbleSortAscend(Comparable[] array){
        Comparable swit;
        for(int length=array.length-1;length>0;length--){
            for(int index=0;index<length;index++){
                if(array[index].compareTo(array[index+1])>0){
                    swit = array[index];
                    array[index] = array[index+1];
                    array[index+1] = swit;
                }
            }
        }
    }
    public static void bubbleSortDescend(Comparable[] array){
        int index,length = array.length-1; Comparable swit;
        while(length>0){
            index = 0;
            while(index<length){
                if(array[index].compareTo(array[index+1])<0){
                    swit = array[index];
                    array[index] = array[index+1];
                    array[index+1] = swit;
                }
                index++;
            }
            length--;
        }
    }
    public static void selectionSortAscend(Comparable[] array){
        Comparable sw;
        while(!checkSortedAscending(array)){
            for(int i=0;i<array.length-1;i++){
                for(int j = i+1;j<array.length;j++){
                    if(array[i].compareTo(array[j])>0){
                        sw = array[i];
                        array[i] = array[j];
                        array[j] = sw;
                    }
                }
            }
        }
    }
    public static void selectionSortDescend(Comparable[] array){
        Comparable sw;
        while(!checkSortedDescending(array)){
            for(int i=0;i<array.length-1;i++){
                for(int j = i+1;j<array.length;j++){
                    if(array[i].compareTo(array[j])<0){
                        sw = array[i];
                        array[i] = array[j];
                        array[j] = sw;
                    }
                }
            }
        }
    }
    
    public static void insertionSortAscend(Comparable[] array){
        int j;
        Comparable key;
        for(int i=1;i<array.length; i++) { 
            key = array[i]; 
            j= i-1; 
            while (j >= 0 && (array[j].compareTo(key)>0)) { 
                array[j+1] = array[j--]; 
            } 
            array[j + 1] = key; 
        }
    }
    public static void insertionSortDescend(Comparable[] array){
        Comparable key;
        for(int i=1;i<array.length; i++) { 
            key = array[i]; 
            int j=i-1;
            for(;j >= 0 && (array[j].compareTo(key)<0);j--)array[j+1] = array[j];
            array[j + 1] = key; 
        }
    }
    private static void merge(Comparable[] array,int start,int mid,int end){
        Comparable[] temp = new Comparable[array.length];
        int pos1 = start,pos2 = mid+1;
        int spot = start;
        while(!(pos1>mid&& pos2>end)){
            if((pos1>mid)||(pos2<=end)&&(array[pos2].compareTo(array[pos1])<0)){
                temp[spot] = array[pos2++];
            }
            else temp[spot] = array[pos1++];
            spot++;
        }
        for(int i=start;i<=end;i++){
            array[i] = temp[i];
        }
    }
    private static void mergeSort(Comparable[] array,int start,int end){
        if(start<end){
            int mid = (start+end)/2;
            mergeSort(array,start,mid);
            mergeSort(array,mid+1,end);
            merge(array,start,mid,end);
        }
    }
    public static void mergeSort(Comparable[] array){
        if(array.length>1)mergeSort(array,0,array.length-1);
    }
}
