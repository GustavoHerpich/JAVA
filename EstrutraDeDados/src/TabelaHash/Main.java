package TabelaHash;

public class Main {
    public static void main(String[] args) {
        TableHash tabelahash = new TableHash(10);
        tabelahash.insere(new Aluno(321,"Gustavo", "Turno@gmail.com" ));
        tabelahash.insere(new Aluno(322,"Augusto", "Turbo@gmail.com" ));
        tabelahash.insere(new Aluno(111,"Eduardo", "Turo@gmail.com" ));
        tabelahash.insere(new Aluno(221,"jaoo", "Turco@gmail.com" ));
        tabelahash.insere(new Aluno(441,"Camila", "Tucano@gmail.com" ));
        tabelahash.insere(new Aluno(342,"Julia", "Tinta@gmail.com" ));
        tabelahash.insere(new Aluno(632,"Bianca", "jamaica@gmail.com" ));

        tabelahash.imprime();

    }
}
