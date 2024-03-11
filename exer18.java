//Cada degrau de uma escada tem X de altura. Faça um programa que receba essa altura e a altura que o usuário deseja alcançar subindo a escada, calcule e mostre quantos degraus ele deverá subir para atingir seu objetivo, sem se preocupar com a altura do usuário. Todas as medidas fornecidas devem estar em metros.     

import java.util.Scanner;

public class exer18 {
    public static void main (String[]args) {
        Scanner input = new Scanner (System.in);

        float alturaDegrau, alturaDesejada, quantidadeDegrau;

        System.out.print("Qual a altura desejada para o degrau? (Em metros) ");
        alturaDegrau = input.nextFloat();

        System.out.print("Qual a altura desejada para a escada alcançar? (Em metros) ");
        alturaDesejada = input.nextFloat();

        quantidadeDegrau = alturaDesejada / alturaDegrau;

        System.out.print("A quantidade necessárias de degraus para atingir a altura de " + alturaDesejada + "m é de: " + quantidadeDegrau + ". Cada degrau  deverá ter " + alturaDegrau + "m de altura.");
    
        input.close();
    }
}
