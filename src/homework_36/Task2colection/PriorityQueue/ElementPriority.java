package homework_36.Task2colection.PriorityQueue;

public class ElementPriority {
  String  name;
  Integer priorityElements;

    public ElementPriority(String name, Integer priorityElements) {
        this.name = name;
        this.priorityElements = priorityElements;
    }

    public String getName() {
        return name;
    }

    public Integer getPriorityElements() {
        return priorityElements;
    }

    @Override
    public String toString() {
        return "ElementPriority{" +
                "name='" + name + '\'' +
                ", priorityElements=" + priorityElements +
                '}';
    }
}
