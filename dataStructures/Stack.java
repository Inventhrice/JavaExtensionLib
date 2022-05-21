package dataStructures;

import java.util.*;

public class Stack<T> {

    private Object[] data;
    private int top;

    public Stack() {
        data = new Object[10];
        top = -1;
    }

    /**
     * Return the upper most value in the Stack
     *
     * @return the uppermost value of the Stack.
     */
    public T top() {
        if (!isEmpty()) {
            return ((T) data[top]);
        } else {
            System.err.println("STACK EMPTY. IntegerNotFoundException");
            return null;
        }
    }

    private void expandSize() {
        data = Arrays.copyOf(data, (data.length + 10));
    }

    /**
     * Takes out the integer from a Stack and returns to the user. Completely
     * removes the value from the Stack.
     *
     * @return
     */
    public T pop() {
        if (!isEmpty()) {
            T ree = ((T) data[top]);
            data[top--] = null;
            return ree;
        } else {
            return null;
        }
    }

    /**
     * Returns the size of the array
     *
     * @return
     */
    public int size() {
        return data.length;

    }

    /**
     * Inserts an object into the Stack.
     *
     * @param obj
     */
    public void push(T obj) {
        if (top == (data.length - 1)) {
            expandSize();
        }
        data[++top] = obj;
    }

    /**
     * Clears everything.
     */
    public void clear() {
        top = -1;
    }

    /**
     * Checks whether it is empty;
     *
     * @return
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * Returns a string representation of the Stack.
     *
     * @return
     */
    @Override
    public String toString() {
        String re = "[";
        if (top > -1) {
            for (int i = 0; i < top; i++) {
                re += data[i].toString() + ", ";
            }
            re += data[top].toString();
        }
        re += "]";
        return re;
    }
}
