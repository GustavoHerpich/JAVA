package Prova2;

import java.util.*;

public class JOGANDO_CARTAS_FORA {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int cartasContadas = scanner.nextInt();
            if (cartasContadas == 0) {
                return;
            }

            if (cartasContadas < 1 || cartasContadas > 50) {
                System.out.println("O numero de cartas deve ir de 1 à 50");
                continue;
            }

            ArrayDeque<Integer> ListaPilha = new ArrayDeque<>();
            LinkedList<Integer> ListaCartaDescartadas = new LinkedList<>();

            for (int i = 1; i < cartasContadas + 1; i++) {
                ListaPilha.add(i);
            }


            while (ListaPilha.size() >= 2) {
                int cartaDescartadas = ListaPilha.removeFirst();
                int cartaAuxilio = ListaPilha.removeFirst();
                ListaCartaDescartadas.add(cartaDescartadas);
                ListaPilha.addLast(cartaAuxilio);
            }

            System.out.println(ListaCartaDescartadas);
            System.out.println(ListaPilha);

        }


    }
}




