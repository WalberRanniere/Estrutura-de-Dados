package Pilha;

public class Teste {
    public static void main(String[] args) throws Exception {

        // Início da Pilha com validações do isEmpty e como topo
        Pilha p = new Pilha( 5);
        System.out.println("A Pilha está vazia: " + p.isEmpty());

        p.push(4);
        System.out.println("A Pilha está vazia: " + p.isEmpty());
        System.out.println("O Topo da pilha é: " + p.top());

        // Adicionando primeiros elementos na pilha
        p.push(8);
        p.push(12);
        p.push(16);
        p.push(20);
        System.out.println("O Topo da pilha é: " + p.top());


        //Duplicando a pilha
        System.out.println("A quantidade de elemntos é: " + p.size());

        p.push(24);
        System.out.println("O Topo é: " + p.top());

        // Dividindo a pilha/2
        p.pop();
        System.out.println("O Topo é: " + p.top());


    }
}
