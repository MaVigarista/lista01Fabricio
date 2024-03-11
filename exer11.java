//Crie um programa que calcula a média simples de três notas fornecidas pelo usuário.

import java.util.Scanner;

public class exer11 {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);

        Double nota1, nota2, nota3;
        Double media;

        System.out.print("Insira a primeira nota: ");
            nota1 = input.nextDouble();

        System.out.print("Insira a segunda nota: ");
            nota2 = input.nextDouble();

        System.out.print("Insira a terceira nota: ");
            nota3 = input.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.print("A média dessas três notas é: " + media);

        input.close();
    }
}
