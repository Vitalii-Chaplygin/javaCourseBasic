package tranningJava.practicLesson30.comparatorTask;

import java.util.Comparator;
import java.util.Objects;

public class Pair  {
   private String string;
   private Integer integer;

    public Pair(String string, Integer integer) {
        this.string = string;
        this.integer = integer;
    }

    public String getString() {
        return string;
    }

    public Integer getInteger() {
        return integer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return Objects.equals(string, pair.string) && Objects.equals(integer, pair.integer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(string, integer);
    }

    @Override
    public String toString() {
        return "Pair{" +
                "string='" + string + '\'' +
                ", integer=" + integer +
                '}';
    }
}
