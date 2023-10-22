package arrays.linkedlist;

public class ElementLinkedList<TYPE> {

    private TYPE value;
    private ElementLinkedList<TYPE> nextElement;

    public ElementLinkedList(TYPE value) {
        this.value = value;
    }

    public TYPE getValue() {
        return value;
    }

    public void setValue(TYPE value) {
        this.value = value;
    }

    public ElementLinkedList<TYPE> getNextElement() {
        return nextElement;
    }

    public void setNextElement(ElementLinkedList<TYPE> nextElement) {
        this.nextElement = nextElement;
    }
}
