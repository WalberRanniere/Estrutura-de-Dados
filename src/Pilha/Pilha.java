package Pilha;

public class Pilha implements PilhaInterface{
    private int topo, tamanho;
    private Object[] pilha;

    public Pilha(int tamanho){
        this.tamanho = tamanho;
        topo = -1;
        pilha = new Object[tamanho];
    }

    public int size(){
        return topo + 1;
    }
    public boolean isEmpty(){
        if (topo == -1) {
            return true;
        }else {
            return false;
        }
    }

    public Object top() throws PilhaException{
        if(isEmpty()){
            throw new PilhaException("A Pilha está Vazia"); 
        }
        return pilha[topo];
    }


    public Object pop() throws PilhaException{
        if(isEmpty()){
            throw new PilhaException("A Pilha está Vazia"); 
        }
        Object p = pilha[topo];
        pilha[topo--] = null;
        return p;
    }

    public void push(Object elemento){
        if(topo+1 == pilha.length){
            tamanho *= 2;
            Object[] a = new Object[tamanho];
            for(int i = 0; i <= topo; i++){
                a[i] = pilha[i];
            }
            pilha = a;
        }
        pilha[++topo] = elemento;
    }
}
