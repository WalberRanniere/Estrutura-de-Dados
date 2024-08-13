package Fila;

public class Teste {
    public static void main(String[] args) throws Exception {

        //Inicianco a Fila e chamando o isEmpty
        Fila fila = new Fila(4);
        System.err.println("A Fila está Vazia: " + fila.isEmpty());

        //Adicionando Elementos na Fila
        /* fila.queue(4);
        fila.queue(8);
        fila.queue(12);
        fila.queue(16);
        System.err.println("A Fila está Vazia: " + fila.first());
        System.err.println("A Qauntidade de Elementos: " + fila.size()); */


        //Retirando Elementos na Fila
        /* fila.dequeue();
        fila.dequeue();
        fila.dequeue();
        System.err.println("O Primeiro da fila é: " + fila.first());
        System.err.println("A Quantidade de Elementos: " + fila.size());

        System.err.println("A Fila está Vazia: " + fila.isEmpty()); */

        //Deixando a fila Vazia
        /* fila.dequeue();

        System.err.println("A Quantidade de Elementos: " + fila.size());

        System.err.println("A Fila está Vazia: " + fila.isEmpty()); */

        fila.queue(4);
        System.out.println("Coloquei o primeiro.");

        fila.queue(8);
        System.out.println("Coloquei o segundo.");


        fila.queue(12);
        System.out.println("Coloquei o terceiro");

        fila.queue(16);
        System.out.println("Coloquei o quarto.");


        fila.dequeue();
        
        fila.queue(20);
        System.out.println("Coloquei o quinto.");

        fila.queue(24);
        System.err.println("Coloquei o sexto.");

        System.err.println("A Quantidade de Elementos: " + fila.size());
        System.err.println("O primeiro elemento é: " + fila.first());


    }
}
