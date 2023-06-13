package Atividade3;

import java.util.Scanner;

public class EsquerdaVolver {
    public static void main(String[] args) {
        direcao();
    }

    public static void direcao() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            int countNumber = scanner.nextInt();
            int movimentos = 0;

            if (countNumber == 0) {
                return;
            }
            String s = scanner.next();
            for (int i = 0; i < countNumber; i++) {
                char b = s.charAt(i);
                if (b == 'D') {
                    movimentos++;
                } else if (b == 'E') {
                    movimentos--;
                }
            }
            if (movimentos % 4 == 0) { // 4, 8, 12 ou -4, -8, -12
                System.out.println("N");
            } else if (movimentos % 4 == 1 || movimentos % 4 == -3) { // 1, 5, 9 ou -3, -7, -11
                System.out.println("L");
            } else if (movimentos % 2 == 0) { // 2, 6, 10 ou -2, -6, -10
                System.out.println("S");
            } else if (movimentos % 4 == 3 || movimentos % 4 == -1) { // 3, 7, 11 ou -1, -5, -9
                System.out.println("O");
            }
        }
    }
}
