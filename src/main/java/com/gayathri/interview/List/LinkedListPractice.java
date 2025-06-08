package com.gayathri.interview.List;

import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("First");
        list.add("Middle");
        list.addLast("Last");

        System.out.println(list);
        list.removeLast();
        System.out.println(list);

        for(String item: list)
            System.out.println(item);
    }
}
