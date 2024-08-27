package com.assignment18;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class Code2 {
    //2. Create a Java program that initializes a `LinkedList` of strings with the values {"one", "two", "three", "four", "five"}.
    // Use a `ListIterator` to iterate through the list and replace every occurrence of the word "three" with "THREE".
    // Print the modified list.
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<>(Arrays.asList("one", "two", "three", "four", "five"));
        ListIterator<String> listIterator= ll.listIterator();
        while (listIterator.hasNext()){
            String current = listIterator.next();
            if (current.equals("three")) {
                listIterator.set("THREE");
            }
        }
        System.out.println(ll);
    }
}
