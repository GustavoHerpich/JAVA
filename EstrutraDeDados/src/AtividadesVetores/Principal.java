package AtividadesVetores;

public class Principal {
    public static void main(String[] args) {
        TADVetores vet = new TADVetores();
        vet.insere(0,1);
        vet.insereFinal(3);
        vet.insereFinal(4);
        vet.insereInicio(2);
        vet.insereFinal(6);
        vet.insereFinal(7);

        //vet.limpa();
        //vet.removeInicio();
        //vet.removeFInal();
        //vet.remove(2);
        //vet.altera(0, 5);
        //System.out.println(vet.pesquisa(1));
        System.out.println(vet.toString());
        vet.imprime();

    }
}
