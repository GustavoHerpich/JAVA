package Atividade5Recursivas;

public class MaiorElementoVetorValoresInteiros {
    public static void main(String[] args) {
        System.out.println(maximo(new int[]{0,1,2,3,4}));
    }
    public static int maximo(int[] vetor) {
        return maximo(vetor, 0, vetor.length-1);
    }
    public static int maximo(int[] vetor, int inic, int fim) {
        if (inic == fim) {
            return vetor[inic];
        }if (vetor[inic] > vetor[fim]) {
            return maximo(vetor, inic, fim - 1);
        } else {
            return maximo(vetor, inic + 1, fim);
        }
    }
}