package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class reverseList {
  public static void main(String[] args) {
    // - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`

    int[] aj = {3, 4, 5, 6, 7};

    List<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < aj.length; i++) {
      list.add(aj[i]);
      Collections.reverse(list);
    }
    for (int i = 0; i <list.size() ; i++) {

      System.out.print(list.get(i));
    }

  }

}
