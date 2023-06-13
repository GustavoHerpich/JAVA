package TabelaHash;

import java.util.LinkedList;

public class TableHash {
    private int tamanho; // Tamanho da tabela hash
    private LinkedList<Aluno>[] tabela; // Array para armazenar os alunos

    public TableHash(int tamanho) {
        this.tamanho = tamanho;
        tabela = new LinkedList[tamanho];
        for (int i = 0; i < tamanho; i++) {
            tabela[i] = new LinkedList<>();

        }
    }

    private int hash(int chave) {
        return chave % tamanho;
    }

    public void insere(Aluno aluno) {
        if (pesquisa(aluno.getMatricula()) == null) {
            int posicao = hash(aluno.getMatricula());
            tabela[posicao].add(aluno);
        }
    }

    public Aluno pesquisa(int chave) {
        int posicao = hash(chave);
        LinkedList<Aluno> alunos = tabela[posicao];

        for (Aluno aluno: alunos) {
            if(chave == aluno.getMatricula()) {
                return aluno;
            }
        }

        return null; // Aluno não encontrado
    }

    public void remove(int chave) {
        //TODO implementar
    }

    public void imprime() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println("(" + i + ")" + tabela[i]);

        }
    }

    private int hash(String chave) {
        return Math.abs(chave.hashCode() % tamanho);
    }
}
