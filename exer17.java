//Faça um programa para o seguinte problema: Compraram-se N canetas iguais, que foram pagas com uma nota de Z reais, obtendo-se Y reais como troco. Quanto custou cada caneta? 

import java.util.Scanner;

public class exer17 {
    public static void main (String[]args) {
        Scanner input = new Scanner (System.in);

        double canetas, preco;
        float pagamento, troco;

        System.out.print("Quantas canetas de mesmo modelo foram compradas? ");
        canetas = input.nextDouble();

        System.out.print("Quantos reais foram usados para pagar? ");
        pagamento = input.nextFloat();

        System.out.print("Quantos reais foi recebido de troco? ");
        troco = input.nextFloat();

        preco = (pagamento - troco) / canetas;

        System.out.print("O preço pago por unidade de caneta foi de: R$" + preco + "!");

        input.close();
    }
}
