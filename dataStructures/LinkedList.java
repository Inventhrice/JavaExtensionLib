package dataStructures;
public class LinkedList<T> {
    private Node head;
    private class Node<T>{
        private T data;
        private Node next;

        public Node(T data){
            this.data = data;
            next = null;
        }
        public Node(){
            next = null;
            data = null;
        }
        public T getData(){
            return data;
        }
        public void setData(T a){
            data = a;
        }
        public boolean equals(Node a){
            return this.data.equals(a.getData());
        }
        public boolean equals(Integer a){
            return this.data.equals(a);
        }
        @Override
        public String toString(){
            return ""+ data;
        }
        public Node getNext() {
            return next;
        }
        public void setNext(Node next) {
            this.next = next;
        }
    }
    public LinkedList(){
        head=null;
    }
    public void addToFront(T data){
        Node temp = new Node(data);
        temp.setNext(head);
        head = temp;
    }
    public void remove(T s){
        Node temp = head;
        if(!temp.equals(s)){
            while(temp.getNext() != null && !temp.getNext().equals(s)){
                temp = temp.getNext();
            }
            temp.setNext(temp.getNext().getNext());
        }
        else{
            head = head.getNext();
        }
    }
    @Override
    public String toString(){
        String re = "[";
        Node temp = head;
        if(temp != null){
            while(temp.getNext() != null){
                re+= temp.toString() + ", ";
                temp = temp.getNext();
            }
            re+= temp.toString();
        }
        if(re.equals("["))return "empty"; 
        else return re + "]";
    }
    public LinkedList reverse(){
        Node temp = head;
        LinkedList<T> reverse = new LinkedList();
        
        while(temp.getNext() != null){
            reverse.addToFront((T)(temp.getData()));
            temp = temp.getNext();
        }
        reverse.addToFront((T)(temp.getData()));
        return reverse;
    }
}
