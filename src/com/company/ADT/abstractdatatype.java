package com.company.ADT;

public interface abstractdatatype<E> {
     void add(E data);
     void add(int position,E data);
     void remove();
     void remove(int position);
     void print();
     int size();
}
