package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class unique {
  public static void main(String[] args) {
    //  Create a function that takes a list of numbers as a parameter
    //  Returns a list of numbers where every number in the list occurs only once

    //  Example
    int[] array = new int[]{1, 11, 34, 11, 52, 61, 1, 34};

    System.out.println(unique(array));
    //  should print: `[1, 11, 34, 52, 61]`

  }

  public static List<Integer> unique(int[] array) {
   List<Integer> list=new ArrayList<Integer>();

    int temp;
    for( int i = 0; i < array.length-1; i++ )
    {
      for( int j = i+1; j < array.length; j++ )
      {
        if( array[i] > array[j] )
        {
          temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
    }
    for (int i = 0; i <array.length ; i++) {
      if (list.contains(array[i])){

      }else{
        list.add(array[i]);
      }

    }


    return list;
    }
 



  }

