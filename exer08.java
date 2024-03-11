//Escreva um programa que converte uma quantidade de metros para centímetros.

import java.util.Scanner;

public class exer08 {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);
        
        double metros, centimetros;

        System.out.print("Escreva a quantidade de metros desejada para conversão: ");
        metros = input.nextDouble();

        centimetros = metros * 100;

        System.out.print("A quantidade de metros convertida em centímetros é igual a: " + centimetros);

        input.close();
    }
}
