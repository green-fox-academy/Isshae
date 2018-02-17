public class task9BmiTask12Cuboid {
    public static void main(String[] args) {
        double massInKg = 91.2;
        double heightInM = 1.78;
        double bmi = massInKg / Math.pow(heightInM, 2.0);
        System.out.println(bmi);
        // Print the Body mass index (BMI) based on these values

        //Cuboid task 12
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000
//	Volume = xyz
//Surface area = 2xy + 2xz + 2yz

        double a = 50.4;
        double b = 30.6;
        double c = 60.3;

        double volume = a*b*c;
        double surface = 2*(a*b)+2*(a*c)+2*(b*c);

        System.out.println("Volume: "+volume);
        System.out.println("Surface Area: "+ surface);


    }
}
