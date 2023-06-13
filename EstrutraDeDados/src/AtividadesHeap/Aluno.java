package AtividadesHeap;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Aluno implements Comparable<Aluno>{
    private final String nome;
    private final Double nota;

    public Aluno(String nome, Double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return
                "nome = '" + nome + '\'' +
                ", nota = " + nota;

    }

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Gustavo", 10.0);
        Aluno a2 = new Aluno("Felipe", 0.0);

        ArrayList<Aluno> vetorAlunos = new ArrayList<>();
        vetorAlunos.add(a1);
        vetorAlunos.add(a2);

        PriorityQueue<Aluno> filaAlunos = new PriorityQueue<>();
        PriorityQueue<Aluno> fila1Alunos = new PriorityQueue<>();

        filaAlunos.offer(new Aluno("Ana", 10.0));
        filaAlunos.offer(new Aluno("Julia", 0.0));
        filaAlunos.offer(new Aluno("Mateus", 8.0));
        filaAlunos.offer(new Aluno("Felipe", 7.0));
        filaAlunos.offer(new Aluno("Tiago", 6.0));

        while (!filaAlunos.isEmpty()) {
            System.out.println(filaAlunos.poll());
        }
    }

    @Override
    public int compareTo(Aluno o) {
        return - this.nota.compareTo(o.nota);
        //return this.nome.compareTo(o.nome);
    }
}
