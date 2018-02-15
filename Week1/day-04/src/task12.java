public class task12 {

        public static void main(String[] args) {
            int currentHours = 14;
            int currentMinutes = 34;
            int currentSeconds = 42;
            // Write a program that prints the remaining seconds (as an integer) from a
            // day if the current time is represented by the variables

            int oneMinute = 60;
            int oneHour = 3600;
            int oneDay = 86400;

            System.out.println("second remaining from the day: " + (oneDay - ((currentHours * oneHour) + (currentMinutes * oneMinute) + currentSeconds)));

        }
    }
