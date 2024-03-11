//Desenvolva um programa que, dados dois valores A e B, troque os valores de forma que A passe a ter o valor de B e vice-versa. Exiba os valores após a troca..

import java.util.Scanner;

public class exer14 {
    public static void main (String[]args) {
        Scanner input = new Scanner (System.in);

        double num1, num2, temp;

        System.out.print("Insira o valor 1: ");
        num1 = input.nextDouble();

        System.out.print("Insira o valor 2: ");
        num2 = input.nextDouble();

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.print("Valores após a troca:");
        System.out.print("\nValor 1: " + num1);
        System.out.print("\nValor 2: " + num2);

        input.close();
    }
}
