package com.company;

public class printAll {
    public static void main(String[] args){
        // - Create an array variable named `af`
//   with the following content: `[4, 5, 6, 7]`
// - Print all the elements of `af`


        int[] af={4,5,6,7};
        for (int i = 0; i <af.length ; i++) {
            System.out.print(af[i]+", ");
        }
    }
}
