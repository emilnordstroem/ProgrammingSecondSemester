package opgave02.models;

import java.util.Iterator;

public class SortedLinkedList <T extends Comparable<T>> implements SortedListEaaa<T> {
    Node<T> head;
    Node<T> tail;
    int size;

    @Override
    public void add(T t) {
        Node<T> newElement = new Node<>(t);
        if(head == tail){
            head = tail = newElement;
        }
        Node<T> currentElement = head;
        while(currentElement != null){
            if(currentElement.element.compareTo(newElement.element) == 0){
                Node<T> temp = currentElement.next;
                currentElement.next = newElement;
                newElement.next = temp;
                size++;
                break;
            }
            currentElement = currentElement.next;
        }

    }

    @Override
    public boolean remove(T t) {
        boolean found = false;
        Node<T> currentElement = head;
        Node<T> previousElement = null;

        while(currentElement != null){
            if(currentElement.element == t){
                found = true;
                if(currentElement == head && currentElement == tail){
                    clear();
                } else if(currentElement == head){
                    removeFirst();
                } else if (currentElement == tail) {
                    tail = previousElement;
                    previousElement.next = null;
                } else {
                    previousElement.next = currentElement.next;
                }
            }
            previousElement = currentElement;
            currentElement = currentElement.next;
        }

        return found;
    }

    @Override
    public boolean contains(T t) {
        Node<T> currentElement = head;
        while(currentElement.next != null){
            if(currentElement.element == t){
                return true;
            }
            currentElement = currentElement.next;
        }
        return false;
    }

    @Override
    public void clear() {
        head = tail = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public T getFirst() {
        return head.element;
    }

    @Override
    public void removeFirst() {
        if(head.next != null){
            head = head.next;
            size--;
        } else {
            clear();
        }
    }

    @Override
    public T getLast() {
        return tail.element;
    }

    @Override
    public void removeLast() {
        Node<T> currentElement = head;
        while(currentElement != null){
            if(head == tail){
                clear();
                break;
            } else if (currentElement.next == tail) {
                currentElement.next = null;
                tail = currentElement;
                size--;
            }
            currentElement = currentElement.next;
        }
    }

    @Override
    public Iterator<T> descendingIterator() {
        return new Iterator<T>() {
            Node<T> currentNode = tail;
            Node<T> previousNode = null;

            @Override
            public boolean hasNext() {
                Node<T> tempNode = head;
                Node<T> beforeTempNode = null;
                while (tempNode != null) {
                    if(tempNode.next == currentNode){
                        currentNode = tempNode;
                        previousNode = beforeTempNode;
                        return true;
                    }
                    beforeTempNode = tempNode;
                    tempNode = tempNode.next;
                }
                return false;
            }

            @Override
            public T next() {
                return previousNode.element;
            }

        };
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node<T> currentNode = head;

            @Override
            public boolean hasNext() {
                return currentNode.next != null;
            }

            @Override
            public T next() {
                currentNode = currentNode.next;
                return currentNode.element;
            }
        };
    }

}
