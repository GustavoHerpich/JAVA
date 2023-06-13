package Atividade3;

import java.util.Scanner;

public class Sudoku {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int MATRIX_SIZE = 9;
        int SUBGRID_SIZE = 3;
        int actualInstance = 1;
        int instancesCount = scanner.nextInt();

        if (instancesCount <= 0) {
            return;
        }

        while (actualInstance <= instancesCount) {
            int[][] matrix = new int[MATRIX_SIZE][MATRIX_SIZE];

            X_LOOP:
            for (int y = 0; y < 9; y++) {
                for (int x = 0; x < 9; x++) {
                    int number = scanner.nextInt();

                    if (number < 1 || number > 9) {
                        continue X_LOOP;
                    }

                    matrix[y][x] = number;
                }

            }

            boolean valid = true;

            // Verificar se todas as linhas são válidas
            for (int i = 0; i < MATRIX_SIZE; i++) {
                if (!isValidRow(matrix, i)) {
                    valid = false;
                    break;
                }
            }

            // Verificar se todas as colunas são válidas
            for (int j = 0; j < MATRIX_SIZE; j++) {
                if (!isValidColumn(matrix, j)) {
                    valid = false;
                    break;
                }
            }

            // Verificar se todas as subgrades são válidas
            for (int i = 0; i < MATRIX_SIZE; i += SUBGRID_SIZE) {
                for (int j = 0; j < MATRIX_SIZE; j += SUBGRID_SIZE) {
                    if (!isValidSubgrid(matrix, i, j, SUBGRID_SIZE)) {
                        valid = false;
                        break;
                    }
                }
            }

            System.out.println("Instancia " + actualInstance);
            System.out.println(valid ? "SIM" : "NAO");
            System.out.println();

            actualInstance++;
        }
    }

    private static boolean isValidRow(int[][] board, int row) {
        boolean[] used = new boolean[board.length];
        for (int j = 0; j < board.length; j++) {
            int val = board[row][j];
            if (val != 0) {
                if (used[val - 1]) {
                    return false;
                }
                used[val - 1] = true;
            }
        }
        return true;
    }

    private static boolean isValidColumn(int[][] board, int col) {
        boolean[] used = new boolean[board.length];
        for (int i = 0; i < board.length; i++) {
            int val = board[i][col];
            if (val != 0) {
                if (used[val - 1]) {
                    return false;
                }
                used[val - 1] = true;
            }
        }
        return true;
    }

    private static boolean isValidSubgrid(int[][] board, int row, int col, int size) {
        boolean[] used = new boolean[board.length];

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                int val = board[i][j];

                if (used[val - 1]) {
                    return false;
                }

                used[val - 1] = true;
            }
        }
        return true;
    }
}
