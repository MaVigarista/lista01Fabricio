//Crie um programa que solicita ao usuário dois números e, em seguida, mostra a soma desses números.

import java.util.Scanner;
public class exer01 {
    public static void main (String[]args) {

    Scanner input = new Scanner(System.in);
            int num1, num2;
       
        System.out.print("Insira o primeiro número: ");
            num1 = input.nextInt();

        System.out.print("Insira o segundo número: ");
            num2 = input.nextInt();

        System.out.print("A soma entre os dois números é: " + (num1 + num2));

    input.close();
    }
}