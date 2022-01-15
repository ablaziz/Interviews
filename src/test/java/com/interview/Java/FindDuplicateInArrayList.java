package com.interview.Java;

import java.util.*;

public class FindDuplicateInArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,6,5,4,6,9,0,4,0));

        Map<Integer, Integer> frequency = new HashMap<>();

        for (int eachList: list){
            if (frequency.containsKey(eachList)) {
                frequency.put(eachList, frequency.get(eachList)+1);
            }else
                frequency.put(eachList,1);

        }
        System.out.println("frequency = " + frequency);
      for (Map.Entry<Integer, Integer> duplicate :frequency.entrySet()){
          if (duplicate.getValue()>1){
              System.out.println("duplicate = " + duplicate.getKey());
          }
       }
     }

}
