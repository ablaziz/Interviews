package com.interview.Java;

import java.util.*;

public class FindDuplicateUsingSet {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,6,8,7,9,78,3,2,5,6,7));
        //Find duplicate and

        Set<Integer> set = new LinkedHashSet<>();
        list.removeIf(t->set.add(t));
        System.out.println("list " +list);
        System.out.println("set = " + set);
        removeDuplicates();

        for(int each : list) {
            if (set.add(each)==false) {
                System.out.println("Duplicates are = " + each);
            }
        }
    }
    public static void removeDuplicates(){
    List<Integer> list = new ArrayList<>(Arrays.asList(6,8,7,9,78,3,2,5,6,7,11,1,8,7));
    Set<Integer> nonDuplicates = new LinkedHashSet<>(list);
        System.out.println("list = " + list.size());
        System.out.println("nonDuplicates = " + nonDuplicates.size());

    }

        }


