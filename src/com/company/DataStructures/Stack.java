package com.company.DataStructures;
import com.company.ADT.abstractdatatype;
public class Stack<E>  {
   private LinkedList<E> linkedList = new LinkedList<>();

    public void push(E data) {

      linkedList.add(data);
    }


public void peek(){

}

    public void pop() {
      linkedList.remove();
    }




    public void print() {
         linkedList.print();
    }


    public int size() {
        return linkedList.size();
    }
}
