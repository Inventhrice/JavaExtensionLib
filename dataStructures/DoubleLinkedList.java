
package dataStructures;

import java.util.NoSuchElementException;

public class DoubleLinkedList<E>
{
    private Nodes head;
    private Nodes tail;
    private int size;
     
    //constructor
    public DoubleLinkedList() 
    {
        head = null;
        tail = null;
        size = 0;
    }
    
    
    //Node is a nested class within the linked list
    //***********************************************
    private class Nodes 
    {
        private E element;
        private Nodes next;
        private Nodes prev;
 
        public Nodes(E element, Nodes next, Nodes prev) 
        {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
        public Nodes(E element){
            this.element = element;
            next = null;
            prev = null;
        }
        @Override
        public String toString(){
            return element.toString();
        }
        public boolean hasNext(){
            return next != null;
        }
        public boolean hasPrev(){
            return prev != null;
        }
    }
    //**********************************************
    
    
    
    public int size(){
        return size; 
    }

    public boolean isEmpty(){
        return size == 0; 
    }


    //adds an element to the front of the list
    public void addFront(E element) 
    {
        if(element!=null){
            Nodes temp = new Nodes(element);
            temp.next = head;

            head = temp;
            if(size == 0)tail = head;
            else{
                temp = tail;
                while(temp.hasPrev())temp = temp.prev;
                temp.prev = head;
            }
            size++;
            
        }
        else;
    }


    //adds an element to the rear of the list
    public void addLast(E element) 
    {
        if(element!= null){
            Nodes temp = new Nodes(element);
            temp.prev = tail;
            tail = temp;
            if(size == 0)head = tail;
            else{
                temp = head;
                while(temp.hasNext())temp = temp.next;
                temp.next = tail;
            }
            size++;
        }
        else;
    }


    //sequences through the list from front to rear
    //outputting each element to the screen
    //one line per element
    public String iterateForward()
    {
        String re="[";
        Nodes temp = head;
        for(int i=0;i<size && temp.hasNext();i++){
            re+= temp.toString() + ", ";
            temp = temp.next;
        }
        return re+= temp.toString() + "]";
    }


    //sequences through the list from rear to front
    //outputting each element to the screen
    //one line per element
    public String iterateBackward()
    {
        String re="[";
        Nodes temp = tail;
        for(int i=0;i<size && temp.hasPrev();i++){
            re+= temp.toString() + ", ";
            temp = temp.prev;
        }
        return re+= temp.toString() + "]";
    }

    //returns and removes first element
    public E removeFirst() 
    {
        if (isEmpty()) throw new NoSuchElementException();
        //fill in necessary code
        else{
            Nodes temp = head;
            head = head.next;
            Nodes tempR = tail;
            while(tempR.hasPrev())tempR = tempR.prev;
            tempR.next.prev = null;
            size--;
            return temp.element;
        }
    }

    //returns and removes last element
    public E removeLast() 
    {
        if (isEmpty()) throw new NoSuchElementException();
        //fill in necessary code
        else{
            Nodes temp = tail;
            tail = tail.prev;
            Nodes tempR = head;
            while(tempR.hasNext())tempR = tempR.next;
            tempR.prev.next = null;
            size--;
            return temp.element;
        }
    }
    /**
     * 
     * @param index1 first index to be switched
     * @param index2 second index to be switched
     */
    public void swap(int index1,int index2){
        index1--;index2--;
        if(index1>size || index1<0 || index2>size || index2<0)System.out.println("Out Of Bounds");
        else if(index1==index2)System.out.println("Same Data");
        else{
            Nodes sw1 = head;
            Nodes sw2 = head;
            E node;
            
            for(int i=0;i<index1;i++)sw1 = sw1.next;
            for(int i=0;i<index2;i++)sw2 = sw2.next;
            
            
            node = sw1.element;
            sw1.element = sw2.element;
            sw2.element = node;
        }
    }
    
    @Override
    public String toString(){
        String re="[";
        if(isEmpty())return "[]";
        else{
            Nodes temp = head;
            while(temp.hasNext()){
                re+= temp.toString() + ", ";
                temp = temp.next;
            }
            re+= temp.toString() + "]";
            return re;
        }
    }
}