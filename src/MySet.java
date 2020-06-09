import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class MySet<E> implements Set<PresentComponent> {
    private Node head;
    private int size;

    public MySet(){ }

    public MySet(PresentComponent presentComponent){
        add(presentComponent);
    }

    public MySet(PresentComponent[] presentComponents){
        for (PresentComponent presentComponent : presentComponents){
            add(presentComponent);
        }
    }

    public MySet(Collection<? extends PresentComponent> collection){
        addAll(collection);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (PresentComponent presentComponent : this) {
            if (presentComponent.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<PresentComponent> iterator() {
        return new Iterator<PresentComponent>() {
            private Node currentNode = head;
            @Override
            public boolean hasNext() {
                return currentNode != null;
            }

            @Override
            public PresentComponent next() {
                PresentComponent presentComponent = currentNode.getPresentComponent();
                currentNode = currentNode.getNext();
                return presentComponent;
            }
        };
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        return null;
    }

    @Override
    public boolean add(PresentComponent presentComponent) {
        if (this.contains(presentComponent)){
            return false;
        }
        Node node = new Node(presentComponent, null);
        if (head == null){
            head = node;
            size++;
            return true;
        }
        Node tail = tail();
        tail.setNext(node);
        return true;
    }

    public Node tail(){
        Node tail = head;
        while(tail.getNext() != null){
            tail = tail.getNext();
        }

        return tail;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends PresentComponent> collection) {
        boolean isCollectionChanged = false;
        for (PresentComponent presentComponent : collection){
            isCollectionChanged |= add(presentComponent);
        }
        return isCollectionChanged;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    @Override
    public void clear() {

    }
}
