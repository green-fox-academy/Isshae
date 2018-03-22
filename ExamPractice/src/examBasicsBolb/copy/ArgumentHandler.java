package examBasicsBolb.copy;

public class ArgumentHandler {
  String[] args;

  public ArgumentHandler(String[] args) {
    this.args = args;
  }

  public boolean noArgs() {
    return args.length == 0;
  }

  public boolean isCopy() {
    return args[0].equals("cp");
  }

  public void printUsage() {
    if (noArgs()) {
      System.out.println("copy [source] [destination]");
    }
  }

  public String getArg1() {
    return args[1];
  }

  public String getArg2() {
    return args[2];
  }
}
