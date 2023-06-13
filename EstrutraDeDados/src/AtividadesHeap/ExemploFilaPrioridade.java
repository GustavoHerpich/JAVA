package AtividadesHeap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ExemploFilaPrioridade {
    public static void main(String[] args) {
        PriorityQueue<Integer> filaInteiros = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        filaInteiros.offer(10);
        filaInteiros.offer(90);
        filaInteiros.offer(30);
        filaInteiros.offer(5);
        filaInteiros.offer(100);
        filaInteiros.offer(40);
        System.out.println(filaInteiros); //Retonar o HEAP

        while (!filaInteiros.isEmpty()) {
            System.out.println(filaInteiros.poll());
        }

        PriorityQueue<String> filaString = new PriorityQueue<>();
        System.out.println(" ");
        filaString.offer("F");
        filaString.offer("C");
        filaString.offer("D");
        filaString.offer("A");
        filaString.offer("B");

        while (!filaString.isEmpty()) {
            System.out.println(filaString.poll());
        }
    }
}
