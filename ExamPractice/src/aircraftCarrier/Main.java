package aircraftCarrier;

public class Main {
  public static void main(String[] args) {
    F16 f16 = new F16();

    Carrier carrier = new Carrier("USS Missouri", 5000);
    carrier.addAircraft(new F16());
    carrier.addAircraft(new F16());
    carrier.addAircraft(new F16());
    carrier.addAircraft(new F35());
    carrier.addAircraft(new F35());
    carrier.addAircraft(new F35());

    carrier.fillAllAircraftWithAmmo();
    System.out.println(carrier.getAmountInAmmoStorage());

    System.out.println(f16.getCurrentAmmo());
    System.out.println(f16.refill(50));
    System.out.println(f16.getCurrentAmmo());
  }

}
