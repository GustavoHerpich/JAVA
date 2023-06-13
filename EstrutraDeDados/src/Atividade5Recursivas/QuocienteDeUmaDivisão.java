package Atividade5Recursivas;
/*Implemente uma função recursiva para calcular o quociente de uma divisão (DIV) de x por y,
dois números inteiros positivos, usando-se da seguinte definição:
DIV(x,y)=
            1+DIV(x-y , y), se x>y
            0,se x<y
            1,se x=y
 */

import java.util.Scanner;

public class QuocienteDeUmaDivisão {
    public static void main(String[] args) {
        System.out.println(div(1, 2));
    }

    public static int div(int x, int y) {
        if(x > y ) {
            return 1 + div(x - y, y);
        } else if (x < y) {
            return 0;
        } else {
            return 1;
        }
    }
}