package ArvoreBinaria;

public class Nodo {
    int elem;
    Nodo esq, dir;

    public int getElem() {
        return elem;
    }

    public void setElem(int elem) {
        this.elem = elem;
    }

    public Nodo getEsq() {
        return esq;
    }

    public void setEsq(Nodo esq) {
        this.esq = esq;
    }

    public Nodo getDir() {
        return dir;
    }

    public void setDir(Nodo dir) {
        this.dir = dir;
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "elem=" + elem +
                ", esq=" + esq +
                ", dir=" + dir +
                '}';
    }
}
