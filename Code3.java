package com.assignment18;

import java.util.LinkedList;

public class Code3 {
    //3. Write a Java program that creates a `LinkedList` of integers.
    // Add the numbers 1 to 10 to the list.
    // Then, remove the third element (index 2) and the last element from the list. Print the resulting list.
    public static void main(String[] args) {
        LinkedList<Integer> nums=new LinkedList<>();
        for(int i=1;i<=10;i++)
            nums.add(i);
        nums.remove(2);
        nums.removeLast();
        System.out.println("Linked List: "+nums);
    }
}
