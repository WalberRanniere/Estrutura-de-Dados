package Fila;

public interface FilaInterface {
    public int size();

    public boolean isEmpty();

    public Object first() throws FilaException;

    public void queue(Object elemento);

    public Object dequeue() throws FilaException;

}
