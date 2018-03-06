package greenFoxInheritance;

import java.util.ArrayList;
import java.util.List;

public class Cohort {
  /*Create a Cohort class that has the following

fields:
name: the name of the cohort
students: a list of Students
mentors: a list of Mentors
methods:
addStudent(Student): adds the given Student to students list
addMentor(Mentor): adds the given Mentor to mentors list
info(): prints out "The name cohort has students.size() students and mentors.size() mentors."
The Cohort class has the following constructors:

Cohort(name): beside the given parameter, it sets students and mentors as empty lists*/

  private static String cohortName;
  private static List<Student> studentList;
  private static List<Mentor> mentorList;

  public Cohort(String cohortName) {
    this.cohortName = cohortName;
    studentList = new ArrayList<>();
    mentorList = new ArrayList<>();
  }

  public static void addStudent(Student student) {
    studentList.add(student);
  }

  public static void addMentor(Mentor mentor) {
    mentorList.add(mentor);
  }

  public static void info() {
    System.out.println("The " + cohortName + " cohort has " + studentList.size() + " students and " + mentorList.size() + " mentors.");
  }

}
