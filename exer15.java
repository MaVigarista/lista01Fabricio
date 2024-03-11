//Construa um programa que calcule as raízes de uma equação de 2º grau (Ax2+Bx+C). Sendo que os valores A,B e C são fornecidos pelo usuário. Considere que tem duas raízes.

import java.util.Scanner;

public class exer15 {
    public static void main (String[]args) {
        Scanner input = new Scanner (System.in);

        double numA, numB, numC, raizP, raizN;

        System.out.print("Lembrando que a fórmula é Ax^2+Bx+C, escreva primeiro o valor de A: ");
        numA = input.nextDouble();

        System.out.print("Escreva agora o valor de B: ");
        numB = input.nextDouble();

        System.out.print("Por fim, escreva o valor de C: ");
        numC = input.nextDouble();

        raizN = (-(numB) - Math.sqrt((Math.pow(numB, 2)) - (4 * numA * numC))) / (2 * numA);

        raizP = (-(numB) + Math.sqrt((Math.pow(numB, 2)) - (4 * numA * numC))) / (2 * numA);

        System.out.print("As raízes dessa esquação de segundo grau são representadas pelos valores: " + raizN + " e " + raizP);

        input.close();
    }
}
