package homework_36.Task2colection.PriorityQueue;

import java.util.Objects;

public class ElementsPriority{
    String name;
    int priority;

    public ElementsPriority(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "ElementsPriority{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ElementsPriority that = (ElementsPriority) o;
        return priority == that.priority && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, priority);
    }
}
