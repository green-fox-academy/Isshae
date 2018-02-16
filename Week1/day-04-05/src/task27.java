public class task27 {
    public static void main(String[] args) {
        // Write a program that prints the numbers from 1 to 100.
// But for multiples of three print “Fizz” instead of the number
// and for the multiples of five print “Buzz”.
// For numbers which are multiples of both three and five print “FizzBuzz”.

        int num=1;
        for (int i = 0; i <100 ; i++) {

            if (num%3==0 && num%5==0){
                System.out.print("FizzBuzz, ");
            }else if (num%5==0){
                System.out.print("buzz, ");

            }else if (num%3==0 ){
                System.out.print("fizz, ");
            }
            else{
                System.out.print(num+", ");
            }
            num++;
        }

    }
}
