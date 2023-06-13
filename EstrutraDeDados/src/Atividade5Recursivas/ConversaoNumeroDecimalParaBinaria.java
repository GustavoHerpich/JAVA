package Atividade5Recursivas;

public class ConversaoNumeroDecimalParaBinaria {
    public static void main(String[] args) {
        imprimeBinario(4);
    }

    public static void imprimeBinario(int dec) {
        if (dec > 0) {
            imprimeBinario(dec / 2);
            System.out.print(dec % 2);
        }
    }
}
