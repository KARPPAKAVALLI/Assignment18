package com.assignment18;

import java.util.Arrays;
import java.util.LinkedList;

public class Code1 {
    //1.Write a Java program that creates a `LinkedList` of integers.
    //Add the numbers 5, 10, 15, 20, and 25 to the list. Retrieve and print the first and last elements in the list.
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.addAll(Arrays.asList(5,10,15,20,25));
        System.out.println("First element: "+ll.getFirst());
        System.out.println("Last element: "+ll.getLast());
    }
}
