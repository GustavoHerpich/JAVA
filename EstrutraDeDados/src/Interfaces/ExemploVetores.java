package Interfaces;

import java.util.ArrayList;

public class ExemploVetores {
    public static void main(String[] args) {
        ArrayList<Integer> vetorInteiros = new ArrayList<>();
        ArrayList<String> vetorStrings = new ArrayList<>();
        vetorInteiros.add(0, 10);
        vetorInteiros.add(20);
        vetorInteiros.get(0);
        System.out.println(vetorInteiros.get(0));
        System.out.println(vetorInteiros);
        System.out.println(vetorInteiros.contains(1));
        System.out.println(vetorInteiros.isEmpty());
        vetorInteiros.remove(1);
        System.out.println(vetorInteiros);
        vetorInteiros.set(0,100);
        System.out.println(vetorInteiros);

    }
}
