package Prova2;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/* A entrada é composta por vários casos de teste. A primeira linha de um caso de teste contém um inteiro
N (0 < N ≤ 10), que é o número de peças de carne do churrasco de hoje. Em seguida virão N linhas,
cada uma com uma cadeia de no máximo 20 caracteres, com apenas caracteres de ‘a’ a ‘z’, e um
inteiro Di (0 ≤ Di ≤ 50) que representa a data de validade da i-ésima peça.
Yuri resolveu colaborar e calcular ao menos este número Di de dias até a data de validade, a partir de hoje,
de cada peça de carne. É garantido que se i != j, então Di != Dj. O fim dos casos de entrada é dado quando N=0.
 */
public class Churras_no_Yuri {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int numeroPecas = scanner.nextInt();

            if (numeroPecas == 0) {
                break;
            }

            if (numeroPecas < 0 || numeroPecas >= 10) {
                System.out.println("Numero de carnes tem que ser de 1 à 10");
                continue;
            }
            PriorityQueue<Carne> numero = new PriorityQueue<>();

            for (int i = 0; i < numeroPecas; i++) {
                String carne = scanner.next();

                if(carne.length() > 20) {
                    continue;
                }

                Integer validade = scanner.nextInt();

                if(validade < 0 || validade > 50) {
                    continue;
                }
                numero.add(new Carne(
                        carne,
                        validade
                ));
            }
            while (!numero.isEmpty()) {
                System.out.print(numero.poll().nome + " ");
            }
            System.out.println();
        }

    }

    static class Carne implements Comparable {
        private String nome;
        private Integer validade;

        public Carne(String nome, Integer validade) {
            this.nome = nome;
            this.validade = validade;
        }

        @Override
        public int compareTo(Object o) {
            return this.validade.compareTo(((Carne) o).validade);
        }

    }
}
