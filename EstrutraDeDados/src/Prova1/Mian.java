package Prova1;

public class Mian {
    public static void main(String[] args) {
        ListaTAD lista = new ListaTAD();
        lista.insereFinal(10);
        lista.insereFinal(25);
        lista.insereFinal(90);
        lista.insereFinal(85);
        lista.insereFinal(70);
        lista.insereFinal(150);
        lista.insereFinal(5);
        lista.insereFinal(45);
        lista.insereFinal(100);
        System.out.println(lista.fooMethod(2,5));
        lista.fooMethod(0,2);
        lista.fooMethod(4,8);
    }
}
