package arrays.linkedlist;

public class LinkedList<TYPE> {

    private ElementLinkedList<TYPE> first;
    private ElementLinkedList<TYPE> last;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public void add(TYPE newValue) {
        ElementLinkedList<TYPE> newElement = new ElementLinkedList<>(newValue);

        if (this.first == null && this.last == null) {
            this.first = newElement;
            this.last = newElement;
        } else {
            this.last.setNextElement(newElement);
            this.last = newElement;
        }
        this.size++;
    }

    public void remove(TYPE valueToRemove) {
        ElementLinkedList<TYPE> previous = null;
        ElementLinkedList<TYPE> actual = this.getFirst();

        for (int i = 0; i < this.getSize(); i++) {
            if (actual.getValue().equals(valueToRemove)) {
                if (this.size == 1) {
                    this.first = null;
                    this.last = null;
                }else if (actual == this.first) {
                    this.first = actual.getNextElement();
                    actual.setNextElement(null);
                } else if (actual == this.last) {
                    this.last = previous;
                    previous.setNextElement(null);
                } else {
                    previous.setNextElement(actual.getNextElement());
                    actual = null;
                }
                this.size--;
                break;
            }
            previous = actual;
            actual = actual.getNextElement();
        }
    }

    public ElementLinkedList get(int position) {
        ElementLinkedList actual = this.first;

        for (int i = 0; i < position; i++) {
            if (actual.getNextElement() != null) {
                actual = actual.getNextElement();
            }
        }
        return actual;
    }

    public IteratorLinkedList<TYPE> getIterator() {
        return new IteratorLinkedList<>(this.first);
    }

    public ElementLinkedList<TYPE> getFirst() {
        return first;
    }

    public void setFirst(ElementLinkedList<TYPE> first) {
        this.first = first;
    }

    public ElementLinkedList<TYPE> getLast() {
        return last;
    }

    public void setLast(ElementLinkedList<TYPE> last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
