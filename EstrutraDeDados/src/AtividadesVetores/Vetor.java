package AtividadesVetores;

public class Vetor {
    private int[] elementos;
    private int tamanhoMaximo;
    private int tamanhoAtual;

    public Vetor(int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
        this.elementos = new int[tamanhoMaximo];
        this.tamanhoAtual = 0;
    }

    public int getTamanho() {
        return tamanhoAtual;
    }

    public boolean estaVazio() {
        return tamanhoAtual == 0;
    }

    public boolean estaCheio() {
        return tamanhoAtual == tamanhoMaximo;
    }

    public void imprime() {
        //Percorre vetor
        for (int i = 0; i < tamanhoAtual; i++) {
            System.out.print(elementos[i] + " ");
        }
    }

    public String toString() {
        String resultado = "";
        for (int i = 0; i < tamanhoAtual; i++) {
            resultado += elementos[i] + " "; //Tranformar em String
        }
        return resultado;
    }

    public int acesse(int posicao) {
        //Verifica se a posição existe no vetor
        if (posicao < 0 || posicao >= tamanhoAtual) {
            throw new IndexOutOfBoundsException("Posição inválida!");
        }
        return elementos[posicao];
    }

    public void insereNoFinal(int elemento) {
        //Verifica se o vetor ja esta cheio
        if (estaCheio()) {
            throw new RuntimeException("A estrutura está cheia!");
        }
        //Aloca cada elemento na posição anterior
        for (int i = 1; i < tamanhoAtual; i++) {
            elementos[i - 1] = elementos[i];
        }
        elementos[tamanhoAtual] = elemento;
        tamanhoAtual++;
    }

    public void insereNoInicio(int elemento) {
        if (estaCheio()) {
            throw new RuntimeException("A estrutura está cheia!");
        }
        //Copia os elementos para a posição seguinte
        for (int i = tamanhoAtual - 1; i >= 0; i--) {
            elementos[i + 1] = elementos[i];
        }
        elementos[0] = elemento;
        tamanhoAtual++;
    }

    public void insereNaPosicao(int elemento, int posicao) {
        if (estaCheio()) {
            throw new RuntimeException("A estrutura está cheia!");
        }
        if (posicao < 0 || posicao > tamanhoMaximo) {
            throw new IndexOutOfBoundsException("Posição inválida!");
        }
        for (int i = tamanhoAtual - 1; i >= posicao; i--) {
            elementos[i + 1] = elementos[i];
        }
        elementos[posicao] = elemento;
        tamanhoAtual++;
    }

    public int removeDoFinal() {
        if (estaVazio()) {
            throw new RuntimeException("A estrutura está vazia!");
        }
        //Remove o ultimo elemento
        tamanhoAtual--;
        return elementos[tamanhoAtual];
    }

    public int removeDoInicio() {
        if (estaVazio()) {
            throw new RuntimeException("A estrutura está vazia!");
        }
        //Armaneza o primeiro elemento na variavel "elemento"
        int elemento = elementos[0];
        //Aloca cada elemento na posição anterior
        for (int i = 1; i < tamanhoAtual; i++) {
            elementos[i - 1] = elementos[i];
        }
        //Remove elemento
        tamanhoAtual--;
        //Retonar o elemento removido
        return elemento;
    }

    public int removeNaPosicao(int posicao) {
        if (estaVazio()) {
            throw new RuntimeException("A estrutura está vazia!");
        }
        if (posicao < 0 || posicao >= tamanhoAtual) {
            throw new IndexOutOfBoundsException("Posição inválida!");
        }
        int elemento = elementos[posicao];
        for (int i = posicao + 1; i < tamanhoAtual; i++) {
            elementos[i - 1] = elementos[i];
        }
        tamanhoAtual--;
        return elemento;
    }

    public int pesquisa(int elemento) {
        for (int i = 0; i < tamanhoAtual; i++) {
            if (elementos[i] == elemento) {
                return i;
            }
        }
        return -1;
    }

    public void alteraElemento(int elemento, int posicao) {
        if (posicao < 0 || posicao >= tamanhoAtual) {
            throw new IndexOutOfBoundsException("Posição inválida!");
        }
        elementos[posicao] = elemento;
    }

    public void limpa() {
        tamanhoAtual = 0;
    }
}


