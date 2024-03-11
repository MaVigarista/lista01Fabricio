//Crie um algoritmo que leia o primeiro nome do usuário e escreva uma saudação para ele.

import java.util.Scanner;

public class exer03 {
    public static void main (String[]args) {
        
        Scanner input = new Scanner(System.in);
            String nome;

            System.out.print("Escreva o seu primeiro nome: ");
            nome = input.nextLine();

            System.out.print("Olá, " + nome + "! Seja bem-vindo(a)");

        input.close();
    }
}
