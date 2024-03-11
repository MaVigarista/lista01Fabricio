//Desenvolva um programa que calcula a área de um círculo, onde o raio é fornecido pelo usuário.

import java.util.Scanner;

public class exer09 {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);

        float raio;
        double  area;

        System.out.print("Informe o raio do círculo (em centímetros): ");
        raio = input.nextFloat();
        
        area = Math.PI * (raio * raio);
        
        System.out.print("A área do círculo resulta em: " + area);

        input.close();
    }
}
