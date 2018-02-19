public class compareLength {
    public static void main(String[]args){
        // - Create an array variable named `p1`
//   with the following content: `[1, 2, 3]`
// - Create an array variable named `p2`
//   with the following content: `[4, 5]`
// - Print if `p2` has more elements than `p1`


        int[] p1={1,2,3};
        int[] p2={4,5};
        boolean statement = p1.length < p2.length;

        if (statement){
            System.out.println(p2);
        }
    }
}
