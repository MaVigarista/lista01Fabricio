//Crie um algoritmo que lê um valor real em dólar, e converte o valor para reais. Considere que a cotação é US$ 1 = R$ 4,95.

import java.util.Scanner;

public class exer05 {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);

        double real, dolar;

        dolar = 4.95;

        System.out.print("Insira quantos dólares você deseja convertar para reais: ");
        real = input.nextDouble();

        System.out.print("Com a cotação do dólar a U$4,95 a sua convsão resulta em: R$" + (real * dolar) + " reais!");

        input.close();
    }
}
