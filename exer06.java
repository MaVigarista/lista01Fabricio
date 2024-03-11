//Crie um algoritmo que leia a idade de uma pessoa e calcule quantos dias essa pessoa já viveu.

import java.util.Scanner;

public class exer06 {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);
        int anos, meses;

        System.out.print("Escreva quantos anos você tem: ");
        anos = input.nextInt();

        System.out.print("Escreva quantos meses você tem: ");
        meses = input.nextInt();

        System.out.print("Você tem " + ((anos * 365) + (meses * 30)) + " dias de vida!");

        input.close();
    }
}