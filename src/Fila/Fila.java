package Fila;

public class Fila {
    private int tamanho, primeiro, qtd, ultimo;
    private Object[] fila;

    public Fila(int tamamho){
        this.tamanho = tamamho;
        primeiro = -1;
        ultimo = -1;
        qtd = 0;
        fila =  new Object[tamamho];
    }

    public int size(){
        return qtd;
    }

    public boolean isEmpty(){
        if(qtd == 0){
            return true;
        } else {
            return false;
        }
    }

    public Object first() throws FilaException{
        if (isEmpty()){
            throw new FilaException("A Fila está Vazia");
        }
        return fila[primeiro];
    }

    public void queue(Object elemento){
        if(isEmpty()) {
            fila[++ultimo] = elemento;
            qtd++;
            primeiro = 0;
        } 
        else if(ultimo == tamanho-1){
            ultimo = -1;
            fila[++ultimo] = elemento;
            qtd++;
        } 
        else if(ultimo + 1 == tamanho && primeiro == 0){
            tamanho = tamanho*2;
            Object[] nova_fila = new Object[tamanho];
            for(int i = 0; i <= size()-1; i++){
                nova_fila[i] = fila[i];
            }
            fila =  nova_fila;
            fila[++ultimo] = elemento;
            qtd++;
        }
        else if( primeiro-1 == ultimo){
            tamanho = tamanho*2;
            Object[] nova_fila = new Object[tamanho];
            for(int i = 0; i <=size()-1; i++){
                if(primeiro == size()-1){
                    primeiro = 0;
                }
                nova_fila[i] = fila[primeiro++];
            }
            fila = nova_fila;
            ultimo = size()-1;
            primeiro = 0;
            fila[++ultimo] = elemento;
            qtd++;
        }
        else{
            fila[++ultimo] = elemento;
            qtd++;
        }
    }

    public Object dequeue() throws FilaException{
        if (isEmpty()){
            throw new FilaException("A Fila está Vazia");
        }
        else {
            Object elemento_retirado =  fila[primeiro];
            fila[primeiro] = null;
            primeiro++;
            qtd--;
            return elemento_retirado;
        }
    }
}
