package cloneable;
import cloneable.Person;
import cloneable.Student;

public class Main {
  public static void main(String[] args) throws CloneNotSupportedException {
    /*Make the Student implement the Cloneable interface
Implement the method, so it clones the student
Instantiate John, a 20 years old male from BME
Clone him*/

    Student john = new Student("John",20,"Male", "BME");
    Student john2 =(Student) john.clone();

    System.out.println(john2.age);
  }


}
