package Interfaces;

import java.util.ArrayList;
import java.util.LinkedList;

public class ExemploListas {
    public static void main(String[] args) {
        LinkedList<Integer> listaInteiros = new LinkedList<>();
        LinkedList<String> listaStrings = new LinkedList<>();

        listaInteiros.add(0, 10);
        listaInteiros.add(20);
        listaInteiros.get(0);
        System.out.println(listaInteiros.get(0));
        System.out.println(listaInteiros);
        System.out.println(listaInteiros.contains(1));
        System.out.println(listaInteiros.isEmpty());
        listaInteiros.remove(1);
        System.out.println(listaInteiros);
        listaInteiros.set(0,100);
        System.out.println(listaInteiros);

    }
}
