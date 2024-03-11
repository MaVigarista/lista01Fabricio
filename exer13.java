//Escreva um programa que calcula o salário líquido de um funcionário. O programa deve solicitar o valor da hora de trabalho, o número de horas trabalhadas no mês e o percentual de desconto do INSS.

import java.util.Scanner;

public class exer13 {
    public static void main (String[]args) {
        Scanner input =  new Scanner (System.in);
        
        double valorHoras, horasTrabalhadas, desconto, calculado;

        System.out.print("Insira o valor da hora trabalhada: ");
        valorHoras = input.nextDouble();

        System.out.print("Insira a quantidade de horas trabalhadas no mês: ");
        horasTrabalhadas = input.nextDouble();

        System.out.print("Insira a porcentagem de desconto do INSS aplicada ao seu salário: ");
        desconto = input.nextDouble();

        calculado = (valorHoras * horasTrabalhadas) - ((valorHoras * horasTrabalhadas) * (desconto / 100));
        
        System.out.print("Seu salário liquido considerando as informações fornecidas resultará em: " + calculado);

        input.close();
    }
    
}
