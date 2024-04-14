package seminar3.task1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.stream.Collectors;

/*
Внедрить итератор из задания 2 в коллекцию, написанную в задании 3 таким образом,
чтобы итератор был внутренним классом и, соответственно, объектом в коллекции.
*/

public class MyCollection<T> implements Iterable<T> {
    Object[] value;
    private int size = 0;
    private int currentIndex = 0;

    public MyCollection() {
        value = new Object[5];
    }

    public void addElement(T element) {
        if (size >= value.length) {
            value = Arrays.copyOf(value, value.length * 2);
        }
        value[size++] = element;
    }

    public void deleteElement(T element) {
        if (size == 0) System.out.println("Array is empty");
        for (int i = 0; i < size; i++) {
            if (value[i] == element) {
                System.arraycopy(value, i + 1, value, i, value.length - 1 - i);
                size--;
                return;
            }
        }
    }

    public Object[] getValue() {
        return value;
    }

    public boolean hasNext() {
        if (value[currentIndex] != null && currentIndex < size) {
            return true;
        }
        return false;
    }

    public T next() {
        if (!hasNext()) throw new NoSuchElementException();
        return (T) value[currentIndex++];


    }

    @Override
    public String toString() {
        return Arrays.stream(value).map(Objects::toString).collect(Collectors.joining(", ", "[", "]"));
    }


    /* Iterable */
    @Override
    public Iterator<T> iterator() {
        return this.new MyCollectionIterator();
    }

    /* Iterator */
    private class MyCollectionIterator implements Iterator<T> {
        int index = 0;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T item = (T) value[index];
            ++index;
            return item;
        }
    }
}

