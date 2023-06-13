package AtividadesVetores;

/* Consegue acessar qualquer elemento dentro do vetor independente do tamanho dele no mesmo tempo,
pois os dados estão contidos na memoria
 */

import java.util.Arrays;

public class TADVetores {

    //Atributos da classe
    private int[] vetor;
    private int numElementos;

    public TADVetores() {
        this.vetor = new int[5];
        this.numElementos = 0;
    }

    public void duplicarTamanho() {
        int[] novoVetor = new int[vetor.length * 2];
        System.arraycopy(vetor, 0, novoVetor, 0,vetor.length);
        vetor = novoVetor;
    }
    public boolean estaCheio() {
        return numElementos == vetor.length;
       /*
        if(numElementos == vetor.length) {
        *
            return true;
        }
        else {
            return false;
        } */
    }

    public boolean estaVazia() {
        return numElementos == 0;
    }
    public void insereFinal(int elem) {
        if (estaCheio()) {
            duplicarTamanho();
        }
        vetor[numElementos] = elem;
        numElementos++; //numElementos = numElementos + 1

    }

    public void insereInicio(int elem) {
        if (estaCheio()) {
            duplicarTamanho();
        }
        for (int i = numElementos; i > 0; i--) {
            vetor[i] = vetor[i - 1];
        }
        vetor[0] = elem;
        numElementos++;
    }

    public void insere(int pos, int elem) {
        if (estaCheio()) {
            duplicarTamanho();
        }
        if (pos < 0 || pos > numElementos) {
            System.out.println("Posição invalida!");
            return;
        }
        for (int i = numElementos; i > pos; i--) {
            vetor[i] = vetor[i - 1];
        }
        vetor[pos] = elem;
        numElementos++;
    }

    public void imprime() {
        for (int i = 0; i < numElementos; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "vetor=" + Arrays.toString(vetor) +
                ", numElementos=" + numElementos;
    }

    public int acessa(int pos) {
        if (pos < 0 || pos > numElementos) {
            System.out.println("Posição invalida!");
            return -1;
        }
        return vetor[pos];
    }

    public void removeFInal() {
        if (estaVazia()) {
            System.out.println("Elemento nao removido - Vetor vazio!");
        }
        vetor[numElementos - 1] = 0;
        numElementos--;
    }

    public void removeInicio() {
        if (estaVazia()) {
            System.out.println("Elemento nao removido - Vetor vazio!");
            return;
        }
        for (int i = 1; i < numElementos; i++) {
            vetor[i - 1] = vetor[i];
        }
        vetor[numElementos - 1] = 0;
        numElementos--;
    }

    public void remove(int pos) {
        if (estaVazia()) {
            System.out.println("Elemento nao removido - Vetor vazio!");
            return;
        }
        if (pos < 0 || pos > numElementos) {
            System.out.println("Posição invalida!");
            return;
        }
        for (int i = pos + 1; i < numElementos; i++) {
            vetor[i - 1] = vetor[i];
        }
        vetor[numElementos - 1] = 0;
        numElementos--;
    }

    public boolean pesquisa(int valor) {
        for (int i = 0; i < numElementos; i++) {
            if (vetor[i] == valor) {
                return true;
            }
        }
        return false;
    }

    public void altera(int pos, int valor) {
        if (pos < 0 || pos > numElementos) {
            System.out.println("Posição invalida!");
            return;
        }
        vetor[pos] = valor;
    }

    public void limpa() {
        if (estaVazia()) {
            System.out.println("Esta vazio");
            return;
        }
        Arrays.fill(vetor,0);
        numElementos = 0;
    }
}
