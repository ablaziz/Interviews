package com.interview.Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwappingWithoutTemp {
    public static void main(String[] args) {
        //Swap a && b values

        int a = 3;
        int b = 4;

        a = a + b;  //3 + 4 = 7
        b = a - b;  //7 - 4 = 3;
        a = a - b;  //7 - 3 = 4;

        System.out.println("b = " + b);
        System.out.println("a = " + a);

        int[] arr = {2,5,8,9,45,8,6};
        //Arrays.sort(arr);
       // ArraySorter.sort(arr);
        System.out.println("arr[arr.length-3] = " + arr[arr.length-3]);
        List<Integer> list = new ArrayList<>();
        for (int each: arr) {
            list.add(each);
        }
        System.out.println("list = " + list);

        Collections.sort(list);
        System.out.println("list = " + list);
        list.size();
        System.out.println("list.get(list.size()-3) = " + list.get(list.size() - 3));


    }
}
