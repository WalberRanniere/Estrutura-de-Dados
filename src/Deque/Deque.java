package Deque;

public class Deque {
    private int tamanho, primeiro, ultimo, qtd;
    private Object[] deque;

    public Deque(int tamanho) {
        this.tamanho = tamanho;
        primeiro = -1;
        ultimo = -1;
        qtd = 0;
        deque = new Object[tamanho];
    }

    public int size(){
        return qtd;
    }
}
