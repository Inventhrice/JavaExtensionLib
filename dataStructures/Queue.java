package dataStructures;

public class Queue<T> {
    private T[] array;
    private int n;
    private int first;
    private int last;
    public Queue(int size){
        array = (T[])new Object[size];
        first = last = -1;
    }
    public Queue(){
        array = (T[])new Object[10];
        first = last = -1;
    }
    private void expandSize(){
        T[] temp = (T[])new Object[array.length*2];
        for(int i=0;i<n;i++){
            temp[i] = array[(first+i)%array.length];
        }
        array = temp;
        first=0;
        last = n;
    }
    public void enqueue(T obj){
        if(n==array.length)expandSize();
        if(isEmpty()){
            first++;
            last++;
        }
        array[last++]=obj;
        if(last==array.length)last=0;
        n++;
    }
    public T dequeue(){
        if(isEmpty())return null;
        T item = array[first];
        array[first] = null;
        n--;first++;
        if(first==array.length)first=0;
        return item;
    }
    public T front(){
        if(isEmpty())return null;
        else return (T)(array[first]);
    }
    public boolean isEmpty(){
        return n==0;
    }
    public int size(){
        return n;
    }
    @Override
    public String toString(){
        if(isEmpty())return "[]";
        else{
            String re = "[";
            if(first<=last){
                for(int i=first;i<array.length && i<=last;i++){
                    if(i==last)re+=array[i].toString();
                    else re+=array[i].toString() + ", ";
                }
                return (re+"]");
            }
            else{
                for(int i=first;i<array.length;i++)re+=array[i].toString() + ", ";
                for(int i=0;i<=last;i++){
                    if(i==last)re+=array[i].toString();
                    else re+=array[i].toString() + ", ";
                }
                return (re+"]");
            }
        }
    }
    
    public void clear(){
        first = last = -1;
    }
}
