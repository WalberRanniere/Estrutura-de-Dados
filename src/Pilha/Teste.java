package Pilha;

public class Teste {
    public static void main(String[] args) throws Exception {

        Pilha p = new Pilha( 5);
        System.out.println("A Pilha está vazia: " + p.isEmpty());

        p.push(4);
        System.out.println("A Pilha está vazia: " + p.isEmpty());
        System.out.println("O Topo da pilha é: " + p.top());


        p.push(8);
        p.push(12);
        p.push(16);
        p.push(20);
        System.out.println("O Topo da pilha é: " + p.top());


        System.out.println("A quantidade de elemntos é: " + p.size());

        p.push(20);

    }
}
