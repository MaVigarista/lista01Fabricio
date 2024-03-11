//Crie um algoritmo que lê dois números, X e Y, e mostra o resto da divisão entre eles.

import java.util.Scanner;
public class exer02 {
    public static void main (String[]args) {

        Scanner input = new Scanner(System.in);

        int nx, ny;

        System.out.print("Insira o número X: ");
            nx = input.nextInt();

        System.out.print("Insira o número Y: ");
            ny = input.nextInt();

        System.out.print("O número X divido pelo número Y resulta em: " + (nx / ny));

        input.close();
    }
}