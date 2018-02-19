package com.company;

public class appendArray {
    public static void main(String[] args){
        // - Create an array variable named `nimals`
//   with the following content: `["kuty", "macsk", "cic"]`
// - Add all elements an `"a"` at the end


        String[] nimals={"kuty","macsk","cic"};
        for (int i = 0; i <nimals.length ; i++) {
           nimals[i]= addingString(nimals[i]);
            System.out.println(nimals[i]+" ");
        }


    }
    public static String addingString(String a){
 String additional="a";
 String b=a+additional;
  return b;
    }
}
