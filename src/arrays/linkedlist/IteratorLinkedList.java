package arrays.linkedlist;

public class IteratorLinkedList<TYPE> {

    private ElementLinkedList<TYPE> element;

    public IteratorLinkedList(ElementLinkedList<TYPE> actual) {
        this.element = actual;
    }

    public boolean haveNext() {
        if (element.getNextElement() == null) {
            return false;
        }
        return true;
    }

    public ElementLinkedList<TYPE> getNext() {
        element = element.getNextElement();
        return element;
    }
}
