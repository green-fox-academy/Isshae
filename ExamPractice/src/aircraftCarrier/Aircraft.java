package aircraftCarrier;

public class Aircraft {

  private int maxAmmo;
  private int baseDamage;
  private int currentAmmo;
  private String type;

  public Aircraft(int maxAmmo, int baseDamage, int currentAmmo, String type) {
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
    this.currentAmmo = currentAmmo;
    this.type = type;
  }

  public int fight() {
    return currentAmmo * baseDamage;
  }

  public int refill(int amountInAmmoStorage) {
    if (amountInAmmoStorage <= maxAmmo - currentAmmo) {
      currentAmmo += amountInAmmoStorage;
      amountInAmmoStorage = 0;
    } else{
      amountInAmmoStorage = amountInAmmoStorage - (maxAmmo - currentAmmo);
      setCurrentAmmo(maxAmmo);
    }
    return amountInAmmoStorage;
  }

  public String getType() {
    return type;
  }

  public String getStatus() {
    return "Type: " + type + " Current ammo: " + currentAmmo + " Base damage: " + baseDamage + " All damage: " +
            baseDamage * currentAmmo;
  }

  public boolean isPriority(){
    return type.equals("F35");
  }

  public int getMaxAmmo() {
    return maxAmmo;
  }

  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }

  public int getCurrentAmmo() {
    return currentAmmo;
  }

  public void setCurrentAmmo(int currentAmmo) {
    this.currentAmmo = currentAmmo;
  }


  public void setType(String type) {
    this.type = type;
  }
}
