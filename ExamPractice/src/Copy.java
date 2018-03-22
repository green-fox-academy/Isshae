import examBasicsBolb.copy.ArgumentHandler;
import examBasicsBolb.copy.FileHandler;

public class Copy {
  public static void main(String[] args) {
    // This should be the basic replica of the 'cp' command
    // If ran from the command line without arguments
    // It should print out the usage:
    // copy [source] [destination]
    // When just one argument is provided print out
    // No destination provided
    // When both arguments provided and the source is a file
    // Read all contents from it and write it to the destination
    ArgumentHandler argumentHandler = new ArgumentHandler(args);
    FileHandler fileHandler = new FileHandler();

    if (argumentHandler.noArgs()) {
      argumentHandler.printUsage();
    } else if (argumentHandler.isCopy()) {
      String arg1 = argumentHandler.getArg1();
      String arg2 = argumentHandler.getArg2();
      fileHandler.copy(arg1,arg2);
    }

  }
}