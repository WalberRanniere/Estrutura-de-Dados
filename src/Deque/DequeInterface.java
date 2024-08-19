package Deque;

public interface DequeInterface {
    public void queueInsertFirst();

    public Object queueRemoveFirst() throws DequeException;

    public void queueInsertLast();

    public Object queueRemoveLast() throws DequeException;

    public int size();

    public boolean isEmpty();

    public Object first() throws DequeException;

    public Object last() throws DequeException;
}
