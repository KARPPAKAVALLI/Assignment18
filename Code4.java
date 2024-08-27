package com.assignment18;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class Code4 {
    //4. Write a Java program that creates a `LinkedList` of characters with the values {'A', 'B', 'C', 'D', 'E'}.
    // Write a method to reverse the linked list and print the reversed list.
    public static void llReverse(LinkedList<Character> characters){
        LinkedList<Character> reversedList=new LinkedList<>();
        ListIterator<Character> listIterator=characters.listIterator();

        // Move iterator to the end of the list
        while (listIterator.hasNext()) {
            listIterator.next();
        }

        while (listIterator.hasPrevious())
            reversedList.add(listIterator.previous());
        characters.clear();
        characters.addAll(reversedList);
    }
    public static void main(String[] args) {
        LinkedList<Character> characters=new LinkedList<>(Arrays.asList('A', 'B', 'C', 'D', 'E'));
        System.out.println("Original list: "+characters);
        llReverse(characters);
        System.out.println("reversed list: "+characters);
    }
}
