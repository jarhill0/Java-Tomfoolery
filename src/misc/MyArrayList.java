package misc;

import java.util.AbstractList;

public class MyArrayList<AnyType> extends AbstractList<AnyType> {
    private int size;
    private AnyType[] data;

    MyArrayList(int startSize) {
        int numElements = 2;
        while (numElements < startSize) {
            numElements *= 2;
        }
        data = (AnyType[]) new Object[numElements];
        size = 0;
    }

    MyArrayList() {
        this(2);
    }

    private void resize() {
        AnyType[] newData = (AnyType[]) new Object[data.length * 2];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }

    public int size() {
        return size;
    }

    public void add(int index, AnyType element) {
        if (index > size) {
            throw new IndexOutOfBoundsException(index + " > " + size);
        }
        if (index >= data.length) {
            resize();
        }
        data[index] = element;
        size++;
    }

    public boolean add(AnyType element) {
        add(size, element);
        return true;
    }

    public AnyType get(int index) {
        if (index < size) {
            return data[index];
        }
        throw new IndexOutOfBoundsException(index + " < " + size);
    }

    public AnyType set(int index, AnyType element) {
        AnyType oldElement = get(index);
        add(index, element);
        return oldElement;
    }

    public AnyType remove(int index) {
        AnyType removedElement = get(index);
        System.arraycopy(data, index + 1, data, index, size - 1 - index);
        data[size - 1] = null;
        size--;
        return removedElement;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        size = 0;
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
    }

}
