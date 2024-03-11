//Faça um programa que converta a temperatura dada em Fahrenheit para Celsius.  Para testar se a sua resposta está correta saiba que 100ºC = 212F. Considere C/5 = (F-32)/9

import java.util.Scanner;

public class exer10 {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);

        float temp1;
        double fahrenheit;

        fahrenheit = 2.12;

        System.out.print("Informe a temperatura em fahrenheit que deseja converter: ");
        temp1 = input.nextFloat();

        System.out.print("O valor convertido para Celcius é: " + (temp1 / fahrenheit));

        input.close();
    }
}
