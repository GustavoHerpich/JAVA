package Interfaces;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.offer("Joana");
        fila.offer("Gustavo");
        fila.offer("Felipe");
        fila.offer("Joao");
        //System.out.println(fila.peek());
        fila.offer("Carlos");

        while (!fila.isEmpty()) {
            System.out.println(fila.poll());
        }


    }
}
