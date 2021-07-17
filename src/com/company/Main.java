package com.company;

import com.company.DataStructures.LinkedList;
import com.company.DataStructures.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Stack<Integer> ab = new Stack<>();
        ab.push(1);
        ab.push(2);
        ab.push(3);
        ab.pop();
        ab.push(3);
        ab.print();
        System.out.println();
        System.out.println(ab.size());
    }
}
