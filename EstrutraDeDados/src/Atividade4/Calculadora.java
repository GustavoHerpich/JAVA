package Atividade4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Calculadora {

    public static void main(String[] args) {
        Simbolo simbolo = new Simbolo();
        Scanner scan = new Scanner(System.in);
        String exp = scan.nextLine();
        String[] simbolos = exp.split(" ");

        Queue<String> filaInFixa = new LinkedList<>();
        for (String simb : simbolos) {
            filaInFixa.offer(simb);
        }

        Stack<String> pilhaConv = new Stack<>();
        Queue<String> filaPosFixa = new LinkedList<>();

        while (!filaInFixa.isEmpty()) {
            String simFila = filaInFixa.poll();
            if ((simbolo.isOperando(simFila))) {
                filaPosFixa.offer(simFila);
            } else if (simbolo.abreParentese(simFila)) {
                pilhaConv.push(simFila);
            } else if(simbolo.isOperador(simFila)) {
                while (!pilhaConv.isEmpty() && simbolo.verificaPrioridade(pilhaConv.peek()) >= simbolo.verificaPrioridade(simFila)) {
                    String simPilha = pilhaConv.pop();
                    filaPosFixa.offer(simPilha);
                }
                pilhaConv.push(simFila);
            } else if(simbolo.fechaParentese(simFila)) {
                while (!simbolo.abreParentese(pilhaConv.peek())) {
                    String simPilha = pilhaConv.pop();
                    filaPosFixa.offer(simPilha);
                }
                pilhaConv.pop();
            }
        }
        while (!pilhaConv.isEmpty()) {
           String simPilha = pilhaConv.pop();
           filaPosFixa.offer(simPilha);
        }
        System.out.println(filaPosFixa);
            
        Stack<String> pilhaCalc = new Stack<>();
            while(!filaPosFixa.isEmpty()) {
            String simFila = filaPosFixa.poll();
            if(simbolo.isOperando(simFila)) {
                pilhaCalc.push(simFila);
            } else if (simbolo.isOperador(simFila)) {
                String operandoA = pilhaCalc.pop();
                String operandoB = pilhaCalc.pop();
                String resultado = String.valueOf(calcular(operandoA, operandoB, simFila));
                pilhaCalc.push(resultado);
            }
        }
        System.out.println(pilhaCalc);
    }
    public static int calcular(String operandoA, String operandoB, String operador) {
        int operandorA = Integer.parseInt((operandoA));
        int operandorB = Integer.parseInt((operandoB));
        switch (operador) {
            case "*" -> {
                return operandorA * operandorB;
            }
            case "+" -> {
                return operandorA + operandorB;
            }
            case "-" -> {
                return operandorB - operandorA;
            }
            case "/" -> {
                return operandorB/operandorA;
            }
        }
        return -1;
    }
}

