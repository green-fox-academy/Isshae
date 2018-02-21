public class ASCIItest {
    public static void main(String[] args) {


        String test = "ABCD";
        for (int i = 0; i < test.length(); ++i) {
            char c = test.charAt(i);
            int b = (int) c;
            System.out.println(b);
        }

       int a = 99999;
        short b = (short) a;
        System.out.println(b);
    }
}