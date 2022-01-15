package com.interview.Java;

import java.util.*;

public class FinDuplicateBis {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 6, 0, 1, 6, 8, 9, 2));
        Set<Integer> set = new HashSet<>();
        list.removeIf(t->set.add(t));
        System.out.println("list = " + list);
        synchronizationTest();
     }
     public static void synchronizationTest() {
        int num =5;
        try {
            num= num/0;
        }catch (Exception e){
            System.out.println("e.getMessage() = " + e.getMessage());
         }
         System.out.println("it didnot break");
     }

    }


