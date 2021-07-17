package com.company.DataStructures;

import com.company.ADT.abstractdatatype;

public class LinkedList<E> implements abstractdatatype<E> {

private Node<E> head;


    @Override
    public void add(E data) {
        Node<E> temp;
      if(head == null){
          temp = new Node<>(data,null);
          head = temp;
      }
      else{
          temp = head;
          while(temp.next!=null){
              temp = temp.next;
          }
          temp.next = new Node<>(data,null);
      }
    }
    @Override
    public void add(int position,E data){
         if((position > (size()+1))||(position < 1)){
            System.out.println("IndexOutOfBound");
        }
       else if(position == (size()+1)){
           add(data);
       }
       else if(position == 1){
           Node<E> newNode = new Node<>(data,head);
           head = newNode;
       }
       else{
           Node<E> temp = head;
           for (int i = 1; i < size()+1; i++) {
               if((position-1) == i){
                   Node<E> temp_node = new Node<>(data,temp);
                   temp.next = new Node<>(data,temp.next);
                   break;
               }
               else{
                   temp = temp.next;
               }
           }
       }
    }

    @Override
    public void remove() {
       remove(size());
    }

    @Override
    public void remove(int position) {

        if(position > size()){
            System.out.println("IndexOutOfBoundsException");
        }
        else if(position == 1){
            Node<E> temporary = head.next;
            head.next = null;
            head = temporary;
        }
        else{
            Node<E> temp = head;
            for (int i = 2; i <= size() ; i++) {
                if(position == i){
                    Node<E> temporary = temp.next.next;
                    temp.next.next = null;
                    temp.next = temporary;
                }
                temp = temp.next;
            }
        }
    }

    @Override
    public int size(){
        Node<E> temp =head;
        int count =0;
        if(temp == null)
            return 0;
        else{
            while(temp.next!=null){
                count++;
                temp = temp.next;
            }
        }
        return count+1;
    }
@Override
public void print(){
        Node<E> temp = head;
        if(temp.next==null)
            System.out.print(temp.getData());
        while(temp.next!=null){
            System.out.print(" "+temp.getData());
            temp = temp.next;
        }
    System.out.print(" "+temp.getData());
   }


    private static class Node<E>{
        private E data;
        private Node<E> next;

        //constructors


        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public Node<E> getNext() {
            return next;
        }
    }
}
