public class Node {
    private PresentComponent presentComponent;
    private Node next;

    public Node(PresentComponent presentComponent, Node next) {
        this.presentComponent = presentComponent;
        this.next = next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public PresentComponent getPresentComponent() {
        return presentComponent;
    }

    public Node getNext() {
        return next;
    }
}
