package ArvoreBinaria;

import java.util.ArrayList;
import java.util.List;

public class ArvoreTAD {
    Nodo raiz;

    public ArvoreTAD() {
        raiz = null;

    }

    public boolean estaVazia() {
        return raiz == null;
    }

    public int tamanho() {
        return tamanhoRec(this.raiz);
    }

    private int tamanhoRec(Nodo n) {
        if (n == null) return 0;

        if (n.esq == null && n.dir == null) {
            return 1;
        } else if (n.esq == null) {
            return 1 + tamanhoRec(n.dir);
        } else if (n.dir == null) {
            return 1 + tamanhoRec(n.esq);
        } else {
            return 1 + tamanhoRec(n.esq) + tamanhoRec(n.dir);
        }

    }

    public void limpa() {
        if (estaVazia()) {
            throw new IndexOutOfBoundsException("Arvore vazia!");
        }
        raiz = null;
    }

    public void insere(int elem) {
        if (estaVazia()) {
            this.raiz = new Nodo();
            this.raiz.elem = elem;
            this.raiz.dir = null;
            this.raiz.esq = null;
        } else {
            insereRec(elem, this.raiz);
        }
    }

    private void insereRec(int elem, Nodo n) {
        if (elem == n.elem) {
            throw new RuntimeException("O elemento ja foi inserido na arvore!");
        } else if (elem > n.elem) {
            if (n.dir == null) {
                Nodo nodo = new Nodo();
                nodo.elem = elem;
                n.dir = nodo;
            } else {
                insereRec(elem, n.dir);
            }
        } else {
            if (n.esq == null) {
                Nodo nodo = new Nodo();
                nodo.elem = elem;
                n.esq = nodo;
            } else {
                insereRec(elem, n.esq);
            }
        }
    }

    public boolean pesquisa(int elem) {
        return pesquisaRec(elem, this.raiz);
    }

    private boolean pesquisaRec(int elem, Nodo n) {
        if (n == null) {
            return false;
        }else if (elem == n.elem) {
            return true;
        } else if (elem > n.elem) {
            return  pesquisaRec(elem, n.dir);
        } else {
            return pesquisaRec(elem, n.esq);
        }
    }

    public void imprimeEmOrdem() {
        imprimeEmOrdemRec(this.raiz);

    }

    private void imprimeEmOrdemRec(Nodo n) {
        if (n != null) {
            imprimeEmOrdemRec(n.esq);
            System.out.print(n.elem + " ");
            imprimeEmOrdemRec(n.dir);
        }
    }

   public void imprimePosOrdem() {
        imprimePosOrdemRec(this.raiz);

    }

    private void imprimePosOrdemRec(Nodo n) {
        if (n != null) {
            imprimeEmOrdemRec(n.esq);
            imprimeEmOrdemRec(n.dir);
            System.out.print(n.elem + " ");
        }

    }

    public void imprimePreOrdem() {
        imprimePreOrdemRec(this.raiz);

    }

    private void imprimePreOrdemRec(Nodo n) {
        if (n != null) {
            System.out.print(n.elem + " ");
            imprimeEmOrdemRec(n.esq);
            imprimeEmOrdemRec(n.dir);

        }

    }

    public int acessaMaior() {
        return acessaMaiorRec(this.raiz);
    }

    private int acessaMaiorRec(Nodo n) {
        if (estaVazia()) {
            return 0;
        }
        if (n.dir == null) {
            return n.elem;
        } else {
            return acessaMaiorRec(n.dir);

        }
    }

    public int acessaMenor() {
        return acessaMenorRec(this.raiz);

    }

    private int acessaMenorRec(Nodo n) {
        if (estaVazia()) {
            return 0;
        }
        if (n.esq == null) {
            return n.elem;
        } else {
            return acessaMenorRec(n.esq);
        }
    }

    public ArrayList<Integer> criaVetorEmOrdem() {
        ArrayList<Integer> vetor = new ArrayList<>();
        criaVetorEmOrdemRec(this.raiz, vetor);
        return vetor;
    }

    private void criaVetorEmOrdemRec(Nodo n, ArrayList<Integer> vetor) {
        if (n == null) {
            System.out.println("Vetor vazio");
            return;
        }
        criaVetorEmOrdemRec(n.esq, vetor);
        vetor.add(n.elem);
        criaVetorEmOrdemRec(n.dir, vetor);

    }
    public void imprimeArvore() {
        this.imprimeArvoreRec(this.raiz, 0);
    }

    private void imprimeArvoreRec(Nodo n, int depth) {
        if (n == null) {
            return;
        }
        this.imprimeArvoreRec(n.dir, depth + 1);
        for (int i = 0; i < depth; i++) {
            System.out.print("  ");
        }
        System.out.println(n.elem);
        this.imprimeArvoreRec(n.esq, depth + 1);
    }

    public void remove(int elem) {
        this.raiz = this.removeRec(elem, this.raiz);
    }

    private Nodo removeRec(int elem, Nodo n) {
        if (n == null) {
            return null;
        } else if (elem == n.elem) {
            if (n.esq == null && n.dir == null) {
                return null;
            } else if (n.esq == null) {
                return n.dir;
            } else if (n.dir == null) {
                return n.esq;
            } else {
                Nodo aux = n.dir;
                while (aux.esq != null) {
                    aux = aux.esq;
                }
                n.elem = aux.elem;
                n.dir = this.removeRec(aux.elem, n.dir);
            }
        } else if (elem < n.elem) {
            n.esq = removeRec(elem, n.esq);
        } else {
            n.dir = removeRec(elem, n.dir);
        }
        return n;
    }

}


