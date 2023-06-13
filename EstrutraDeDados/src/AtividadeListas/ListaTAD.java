package AtividadeListas;

public class ListaTAD {
    private Nodo inicio, fim;
    private int numElementos;

    public ListaTAD() {
        inicio = null;
        fim = null;
        numElementos = 0;
    }

    public int tamanho() {
        return numElementos;
    }

    public boolean ehVazia() {
        return numElementos == 0;
    }

    public void imprime() {
        Nodo aux = inicio;
        while (aux != null) {
            System.out.print(aux.elem + " ");
            aux = aux.prox;
        }
        System.out.println();
    }

    public void imprimeReverso() {
        Nodo aux = fim;
        while (aux != null) {
            System.out.print(aux.elem + " ");
            aux = aux.ant;
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "ListaTAD{" +
                "inicio=" + inicio +
                ", fim=" + fim +
                ", numElementos=" + numElementos +
                '}';
    }

    public void insereFinal(int valor) {
        Nodo novoNodo = new Nodo();
        novoNodo.elem = valor;
        novoNodo.prox = null;

        if (ehVazia()) {
            novoNodo.ant = null;
            inicio = novoNodo;

        } else {
            novoNodo.ant = fim;
            fim.prox = novoNodo;

        }
        fim = novoNodo;
        numElementos++;
    }

    public void insereInicio(int valor) {
        Nodo novoNodo = new Nodo();
        novoNodo.elem = valor;
        novoNodo.ant = null;

        if (ehVazia()) {
            novoNodo.prox = null;
            fim = novoNodo;
        } else {
            novoNodo.prox = inicio;
            inicio.ant = novoNodo;

        }
        inicio = novoNodo;
        numElementos++;
    }

    public void insere(int pos, int valor) {
        if (pos < 0 || pos > tamanho()) {
            throw new IndexOutOfBoundsException("Posição Invalida!");
        }
        Nodo novoNodo = new Nodo();
        if (pos == 0) {
            insereInicio(valor);
        } else {
            if (pos >= numElementos) {
                insereFinal(valor);
            } else {
                Nodo nodoAtual = inicio;
                for (int i = 0; i < pos - 1; i++) {
                    nodoAtual = nodoAtual.prox;
                }
                novoNodo.prox = nodoAtual.prox;
                nodoAtual.prox = novoNodo;
                novoNodo.elem = valor;
            }
        }
        numElementos++;
    }

    public int acesse(int pos) {
        Nodo novoNodo = new Nodo();
        if (pos < 0 || pos >= tamanho()) {
            throw new IndexOutOfBoundsException("Posição invalida!");
        }
        novoNodo = inicio;
        for (int i = 0; i < pos; i++) {
            novoNodo = novoNodo.prox;
        }
        return novoNodo.elem;
    }

    public void removeFinal() {
        if (ehVazia()) {
            throw new IndexOutOfBoundsException("Posição invalida!");
        }
        if (numElementos == 1) {
            fim = null;
            inicio = null;
        } else {
            fim = fim.ant;
            fim.prox = null;
        }
        numElementos--;
    }

    public void removeInicio() {
        if (ehVazia()) {
            throw new IndexOutOfBoundsException("Posição invalida!");
        }
        if (numElementos == 1) {
            fim = null;
            inicio = null;
        } else {
            inicio = inicio.prox;
            inicio.ant = null;
        }
        numElementos--;
    }
    public void remove(int pos) {
        if (ehVazia()) {
            throw new IndexOutOfBoundsException("Posição invalida!");
        }
        if (pos < 0 || pos >tamanho()) {
            throw new IndexOutOfBoundsException("Posição invalida!");
        }
        if (pos == 0) {
            removeInicio();
            return;
        }
        if (pos == numElementos - 1) {
            removeFinal();
            return;
        }
        else {
            Nodo nodoAtual = inicio;
            for (int i = 0; i < pos; i++) {
                nodoAtual = nodoAtual.prox;
            }
            nodoAtual.ant.prox = nodoAtual.prox;
            nodoAtual.prox.ant = nodoAtual.ant;
        }
        numElementos--;
    }

    public boolean pesquisa(int valor) {
        if (ehVazia()) {
            throw new IndexOutOfBoundsException("Lista vazia!");
        }
        Nodo nodoAtual = inicio;
        for (int i = 0; i < numElementos; i++) {
            if(nodoAtual.elem == valor) {
                return true;
            }
            nodoAtual = nodoAtual.prox;
        }
        return false;
    }

    public void altera(int pos, int valor) {
        if (ehVazia()) {
            throw new IndexOutOfBoundsException("Lista vazia!");
        }
        if (pos < 0 || pos >tamanho()) {
            throw new IndexOutOfBoundsException("Posição invalida!");
        }
        else {
            Nodo nodoAtual = inicio;
            for (int i = 0; i < pos; i++) {
                nodoAtual = nodoAtual.prox;
            }
            nodoAtual.elem = valor;
        }
    }

    public void limpa() {
        if (ehVazia()) {
            throw new IndexOutOfBoundsException("Lista vazia!");
        }
        fim = null;
        inicio = null;
        numElementos = 0;
    }
}