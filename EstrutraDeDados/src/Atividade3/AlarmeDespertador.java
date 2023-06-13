package Atividade3;

import java.util.Scanner;

public class AlarmeDespertador {
    public static void main(String[] args) {
        calculaHora();

    }
    public static void calculaHora() {
        Scanner scanner = new Scanner(System.in);

        int H1, M1, H2, M2;

        while (true) {
            H1 = scanner.nextInt();
            M1 = scanner.nextInt();
            H2 = scanner.nextInt();
            M2 = scanner.nextInt();

            if (H1 == 0 && M1 == 0 && H2 == 0 && M2 == 0) {
                return;
            }

            if (H1 > 23 || M1 > 59 || H2 > 23 || M2 > 59) {
                continue;
            }

            int totalHoras1 = H1 * 60 + M1;
            int totalHoras2 = H2 * 60 + M2;

            if (totalHoras2 >= totalHoras1) {
                int totalDiferenca = totalHoras2 - totalHoras1;
                System.out.println(totalDiferenca);
            } else {
                totalHoras2 += 24 * 60;
                int totalDiferenca = totalHoras2 - totalHoras1;
                System.out.println(totalDiferenca);
            }
        }
    }
}

