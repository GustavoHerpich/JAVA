package Interfaces;

import java.util.Stack;

public class ExemploPilhas {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();

        pilha.push("P");
        pilha.push("E");
        pilha.push("D");
        pilha.push("R");
        pilha.push("O");
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        pilha.push("S");
        pilha.push("O");
        pilha.push("L");
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println(pilha);

    }
}
