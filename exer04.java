//Crie um algoritmo que solicite o nome, o endereço e o telefone do usuário e depois mostre os dados digitados.

import java.util.Scanner;

public class exer04 {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);

        int phone;
        String address, name;

        System.out.println("Por favor, insira seu telefone (Apenas números): ");
            phone = input.nextInt();

        System.out.println("Por favor, insira seu nome: ");
            name = input.nextLine();

        System.out.println("Por favor, insira seu endereço completo: ");
            address = input.nextLine();

        System.out.print("Seu nome é " + name + ", você mora no endereço " + address + " e seu número de telefone é " + phone);

        input.close();
    }
}
