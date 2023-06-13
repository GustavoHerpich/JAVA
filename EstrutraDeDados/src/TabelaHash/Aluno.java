package TabelaHash;

public class Aluno {
    private final int matricula;
    private final String nome;
    private final String email;

    public Aluno(int matricula, String nome, String email) {
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return "(" + getMatricula() + ") " + getNome() + " - " + getEmail();
    }
}
