package reservation;

import java.util.Random;

public class Reservation implements Reservationy {
  /*Create a Reservation class by implementing all the features as required by the interface.
The booked reservations should look like the output below.
Please note that the reservation code should contain 8 characters randomly from 0-Z, all uppercase letters.
String.format acts similarly as System.out.printf(); in the previous exercise, however the string will not be automatically printed.
Also, the DOW is randomly ordered to the bookings from an array.
DOW stands for Day of the Week (MON, TUE, etc.)*/

  public static void main(String[] args) {
    Reservation reservation = new Reservation();
    reservation.print();
  }

  public void print() {
    for (int i = 0; i < 8; i++) {
      System.out.println("Booking# " + getCodeBooking() + " for " + getDowBooking());
    }

  }

  private String bookingId;
  private String days;
  Random random = new Random();

  public Reservation() {
    this.bookingId = getCodeBooking();
    this.days = getDowBooking();
  }

  @Override
  public String getDowBooking() {
    String[] randDays = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    return randDays[random.nextInt(7)];
  }

  @Override
  public String getCodeBooking() {
    String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345674890";
    for (int i = 0; i < 8; i++) {
      bookingId.replace(chars.charAt(random.nextInt(chars.length()))) ;
    }
    return bookingId;
  }


}
