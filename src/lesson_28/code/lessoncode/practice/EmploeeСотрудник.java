package lesson_28.code.lessoncode.practice;

public class EmploeeСотрудник {
    private int id;
    private String name;

    public EmploeeСотрудник(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "EmploeeСотрудник{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
