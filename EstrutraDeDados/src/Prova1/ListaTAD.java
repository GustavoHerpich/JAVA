package Prova1;

public class ListaTAD {
    private Nodo inicio, fim;
    private int numElemento;

    public ListaTAD fooMethod(int pos1, int pos2) {
        ListaTAD retorno = new ListaTAD();

        Nodo aux = this.inicio;
        int pos = 0;
        while (aux != null) {
            if (pos >= pos1 && pos < pos2) {
                retorno.insereFinal (aux.elem);
            }
            pos++;
            aux = aux.prox;
        }
        return retorno;
    }
    public boolean ehVazia() {
        return numElemento == 0;
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
        numElemento++;
    }
    public int tamanho() {
        return numElemento;
    }
    public void insere(int pos, int elem) {
        Nodo novoNodo = new Nodo();
        if (pos == 0) {
            insereInicio(elem);
        } else {
            if (pos >= numElemento) {
                insereFinal(elem);
            } else {
                Nodo nodoAtual = inicio;
                for (int i = 0; i < pos - 1; i++) {
                    nodoAtual = nodoAtual.prox;
                }
                novoNodo.prox = nodoAtual.prox;
                nodoAtual.prox = novoNodo;
                novoNodo.elem = elem;
            }
        }
        numElemento++;
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
        numElemento++;
    }

    @Override
    public String toString() {
        return "ListaTAD{" +
                "inicio=" + inicio +
                ", fim=" + fim +
                ", numElemento=" + numElemento +
                '}';
    }
}
