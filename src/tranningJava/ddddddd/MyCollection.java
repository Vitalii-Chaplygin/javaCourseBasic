package tranningJava.ddddddd;

public class MyCollection {
    private Object[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public MyCollection() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void add(Object element) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = element;
    }

    public void add(int index, Object element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        if (size == elements.length) {
            ensureCapacity();
        }
        // Shift elements to the right to make space for the new element
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        // Shift elements to the left to fill the gap
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[--size] = null; // Set the last element to null
    }

    public int size() {
        return size;
    }

    private void ensureCapacity() {
        int newCapacity = elements.length * 2;
        Object[] newArray = new Object[newCapacity];
        System.arraycopy(elements, 0, newArray, 0, size);
        elements = newArray;
    }

    public static void main(String[] args) {
        MyCollection collection = new MyCollection();
        collection.add("Element 1");
        collection.add("Element 2");
        collection.add("Element 3");

        System.out.println("Size before insertion: " + collection.size());
        collection.add(1, "Inserted Element");
        System.out.println("Size after insertion: " + collection.size());

        System.out.println("Elements:");
        for (int i = 0; i < collection.size(); i++) {
            System.out.println(collection.elements[i]);
        }

        collection.remove(2);
        System.out.println("Size after removal: " + collection.size());

        System.out.println("Elements after removal:");
        for (int i = 0; i < collection.size(); i++) {
            System.out.println(collection.elements[i]);
        }
    }
}
