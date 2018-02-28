package teachersAndStudents;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Student {
  /*Create Student and Teacher classes
Student
learn()
question(teacher) -> calls the teachers answer method
Teacher
teach(student) -> calls the students learn method
answer()*/

  public void learn() {

  }
  public void qustion(Teacher teacher){
    teacher.answer();
  }


}
