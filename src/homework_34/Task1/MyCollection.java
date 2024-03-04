package homework_34.Task1;

import java.util.Arrays;

public class MyCollection {
    Object[] arrayObject;
    int size;

    public MyCollection(int capacity) {
        this.arrayObject = new Object[capacity];
        size = 0;
    }

    public Object[] getArrayObject() {
        return arrayObject;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyCollection{" +
                "arrayObject=" + Arrays.toString(arrayObject) +
                ", size=" + size +
                '}';
    }

    public void addObject(Object element) {
        if (size==arrayObject.length) {
            uvelicenieAraay();
        }
        if (size < arrayObject.length) {
            arrayObject[size] = element;
            size = size + 1; // size++

        }


    }

    public void removeObject(int index) {
        for (int i = 0; i < arrayObject.length; i++) {
            if (arrayObject[i].equals(index)) {
                arrayObject[i] = arrayObject[size - 1];
                size--;
            }

        }
    }

    public void uvelicenieAraay() {
        int newCapacity = arrayObject.length * 2;
        Object[] newArrayOb = new Object[newCapacity];
        for (int i = 0; i < arrayObject.length; i++) {
            newArrayOb[i] = arrayObject[i];
        }
    }

        public static void main (String[]args){
            MyCollection myCollection = new MyCollection(2);
            myCollection.addObject(1);
            myCollection.addObject(4);
            myCollection.addObject(7);
            System.out.println(myCollection);


        }

}



