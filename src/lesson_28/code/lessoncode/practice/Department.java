package lesson_28.code.lessoncode.practice;

public class Department {
  private  String nameDepartment;
  private EmploeeСотрудник emploeeСотрудник;

    public Department(String nameDepartment, EmploeeСотрудник emploeeСотрудник) {
        this.nameDepartment = nameDepartment;
        this.emploeeСотрудник = emploeeСотрудник;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public EmploeeСотрудник getEmploeeСотрудник() {
        return emploeeСотрудник;
    }

    @Override
    public String toString() {
        return "Department{" +
                "nameDepartment='" + nameDepartment + '\'' +
                ", emploeeСотрудник=" + emploeeСотрудник +
                '}';
    }
}
