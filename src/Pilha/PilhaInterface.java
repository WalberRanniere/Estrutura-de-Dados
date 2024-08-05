package Pilha;

public interface PilhaInterface {
    public int size() ;

    public Object top() throws PilhaException;

    public boolean isEmpty();

    public void push(Object elemento);

    public Object pop() throws PilhaException;
}
