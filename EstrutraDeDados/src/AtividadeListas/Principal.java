package AtividadeListas;

public class Principal {
    public static void main(String[] args) {
        ListaTAD lista = new ListaTAD();
        lista.insereFinal(7);
        lista.insereFinal(8);
        lista.insereFinal(9);
        lista.insereFinal(0);
        lista.insereInicio(5);
        //lista.pesquisa(7);
        //lista.insere(3,6);
        //lista.altera(2,3);
        //lista.removeInicio();
        //lista.removeFinal();
        //lista.remove(1);
        //System.out.println(lista.pesquisa(4));
        //lista.limpa();
        lista.imprime();
        lista.imprimeReverso();
        lista.tamanho();
        lista.toString();
        //System.out.println(lista.acesse(2));
    }
}
