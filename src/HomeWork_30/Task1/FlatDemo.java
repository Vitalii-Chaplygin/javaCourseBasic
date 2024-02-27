package HomeWork_30.Task1;

import java.util.Set;
import java.util.TreeSet;

public class FlatDemo {
    public static void main(String[] args) {
        Set<Flat> flatSet = new TreeSet<>();
        flatSet.add(new Flat(2,46.3));
        flatSet.add(new Flat(2,12.3));
        flatSet.add(new Flat(1,50.7));
        flatSet.add(new Flat(3,20.0));
        System.out.println(flatSet);
    }
}
