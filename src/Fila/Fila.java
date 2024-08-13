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
        System.err.println("O índice do primeiro é: " + primeiro);
        System.err.println("O índice do ultimo é: " + ultimo);
        System.out.println("O elemento do último é: " + fila[ultimo]);

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
            System.err.println("Entrei aqui e deveria");
            ultimo = -1;
            fila[++ultimo] = elemento;
            qtd++;
        } 
        else if( ultimo + 1 == size() && primeiro == 0){
            System.err.println("Tentamos Duplicar");
            tamanho = tamanho*2;
            Object[] nova_fila = new Object[tamanho];
            for(int i = 0; i <= size()-1; i++){
                nova_fila[i] = fila[i];
            }
            fila =  nova_fila;
            fila[++ultimo] = elemento;
            qtd++;
        }
        /* else if( primeiro > ultimo && primeiro-1 == ultimo){
            
        } */
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
            System.err.println("O elemento que vai ser retirado é: " + elemento_retirado);
            fila[primeiro] = null;
            primeiro++;
            qtd--;
            System.err.println("O indície do primeiro se tornou: " + primeiro);
            return elemento_retirado;
        }
    }
}
