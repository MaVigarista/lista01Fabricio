//Escreva um algoritmo para ler um valor e escrever o seu antecessor e o seu sucessor.

import java.util.Scanner;

public class exer12 {
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);

        double num, ant, suc;

        System.out.print("Escreva um número para saber seu antecessor e sucessor: ");
        num = input.nextDouble();

        ant = num - 1;
        suc = num + 1;

        System.out.print("O antecessor de " + num + " é " + ant + " e o sucessor é " + suc);

        input.close();
    }
}
