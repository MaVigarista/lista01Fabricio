//Faça um programa que receba de entrada a distância total (em km) percorrida por um automóvel e a quantidade de combustível (em litros) consumida para percorrê-la, calcule e imprima o consumo médio de combustível. Fórmula: distância/litro.

import java.util.Scanner;

public class exer16 {
    public static void main (String[]args) {
        Scanner input = new Scanner (System.in);

        double distancia, litros, media;
        
        System.out.print("Insira a distância total percorrida (em KM): ");
        distancia = input.nextDouble();

        System.out.print("Insira os litros de gasolina gastos nessa distância: ");
        litros = input.nextDouble();

        media = distancia / litros;

        System.out.print("A média de consumo desse veículo é: " + media + " Km/L");

        input.close();
    }
}
