//Crie um algoritmo que lê o salário de um funcionário, reajusta o salário em 7% e mostra o resultado.

import java.util.Scanner;

public class exer07 {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);
        double salario, reajuste;

        System.out.print("Insira seu salário: ");
        salario = input.nextDouble();

        reajuste = salario + (salario * 0.07);
        
        System.out.print("Seu salário reajustado com 7% de aumento resulta em: " + reajuste);
        
        input.close();
    }
}
