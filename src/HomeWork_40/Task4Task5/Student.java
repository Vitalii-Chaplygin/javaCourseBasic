package HomeWork_40.Task4Task5;

public class Student {
   private String name;
   private int yearOfAdmission;
   private double grade;

    public Student(String name, int yearOfAdmission, double grade) {
        this.name = name;
        this.yearOfAdmission = yearOfAdmission;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getYearOfAdmission() {
        return yearOfAdmission;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", yearOfAdmission=" + yearOfAdmission +
                ", grade=" + grade +
                '}';
    }


}
