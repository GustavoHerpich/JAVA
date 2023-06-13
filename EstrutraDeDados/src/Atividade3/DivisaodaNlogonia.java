package Atividade3;

import java.util.Scanner;

public class DivisaodaNlogonia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countQueries = scanner.nextInt();

        while (countQueries != 0) {
            int coordN = scanner.nextInt();
            int coordM = scanner.nextInt();

            for (int i = 0; i < countQueries; i++) {
                int coordX = scanner.nextInt();
                int coordY = scanner.nextInt();

                if (coordX == coordN || coordY == coordM) {
                    System.out.println("divisa");
                } else if (coordX < coordN && coordY > coordM) { // NW / NO
                    System.out.println("NO");
                } else if (coordX > coordN && coordY > coordM) { // NE
                    System.out.println("NE");
                } else if (coordX > coordN && coordY < coordM) { // SE
                    System.out.println("SE");
                } else if (coordX < coordN && coordY < coordM) { // SO
                    System.out.println("SO");
                }
            }

            countQueries = scanner.nextInt();
        }
    }

}
