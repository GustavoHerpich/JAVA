package ArvoreBinaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ArvoreTAD arvore = new ArvoreTAD();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 13) {
            System.out.println("MENU DE OPERAÇÕES:");
            System.out.println("1 - Imprimir elementos da árvore (em ordem)");
            System.out.println("2 - Imprimir elementos da árvore (em pré-ordem)");
            System.out.println("3 - Imprimir elementos da árvore (em pós-ordem)");
            System.out.println("4 - Imprimir elementos da árvore (formato de árvore)");
            System.out.println("5 - Inserir elemento na árvore");
            System.out.println("6 - Remover elemento da árvore");
            System.out.println("7 - Pesquisar elemento na árvore");
            System.out.println("8 - Acessar o menor elemento da árvore");
            System.out.println("9 - Acessar o maior elemento da árvore");
            System.out.println("10 - Criar vetor com elementos em ordem crescente");
            System.out.println("11 - Calcular o tamanho da árvore");
            System.out.println("12 - Limpar a árvore");
            System.out.println("13 - Sair");

            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Elementos da árvore em ordem:");
                    arvore.imprimeEmOrdem();
                }
                case 2 -> {
                    System.out.println("Elementos da árvore em pré-ordem:");
                    arvore.imprimePreOrdem();
                }
                case 3 -> {
                    System.out.println("Elementos da árvore em pós-ordem:");
                    arvore.imprimePosOrdem();
                }
                case 4 -> {
                    System.out.println("Elementos da árvore no formato de árvore:");
                    arvore.imprimeArvore();
                }
                case 5 -> {
                    System.out.print("Digite o elemento a ser inserido: ");
                    int elemInserir = scanner.nextInt();
                    arvore.insere(elemInserir);
                }
                case 6 -> {
                    System.out.print("Digite o elemento a ser removido: ");
                    int elemRemover = scanner.nextInt();
                    arvore.remove(elemRemover);
                    System.out.println("Elemento removido com sucesso!");
                }
                case 7 -> {
                    System.out.print("Digite o elemento a ser pesquisado: ");
                    int elemPesquisar = scanner.nextInt();
                    if (arvore.pesquisa(elemPesquisar)) {
                        System.out.println("O elemento está presente na árvore.");
                    } else {
                        System.out.println("O elemento não está presente na árvore.");
                    }
                }
                case 8 -> {
                    int menorElemento = arvore.acessaMenor();
                    System.out.println("Menor elemento da árvore: " + menorElemento);
                }
                case 9 -> {
                    int maiorElemento = arvore.acessaMaior();
                    System.out.println("Maior elemento da árvore: " + maiorElemento);
                }
                case 10 -> {
                    ArrayList<Integer> vetorEmOrdem = arvore.criaVetorEmOrdem();
                    System.out.println("Elementos da árvore em ordem crescente:");
                        for (int elem : vetorEmOrdem) {
                        System.out.print(elem + " ");
                    }
                    System.out.println();
                }
                case 11 -> {
                    int tamanho = arvore.tamanho();
                    System.out.println("Tamanho da árvore: " + tamanho);
                }
                case 12 -> {
                    arvore.limpa();
                    System.out.println("Árvore limpa!");
                }
                case 13 -> System.out.println("Encerrando o programa...");
                default -> System.out.println("Opção inválida! Digite novamente.");
            }

            System.out.println();
        }

        scanner.close();
    }
}


