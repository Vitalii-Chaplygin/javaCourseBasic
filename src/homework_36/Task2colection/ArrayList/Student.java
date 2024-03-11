package homework_36.Task2colection.ArrayList;

public class Student {
   private String name;
  private   Integer grade;

    public Student(String name, Integer grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public Integer getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
