//Escrever um algoritmo que lê: - a porcentagem do IPI a ser acrescido no valor das peças - o código da peça 1, valor unitário da peça 1, quantidade de peças 1 - o código da peça 2, valor unitário da peça 2, quantidade de peças 2. O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.


import java.util.Scanner;

public class exer20 {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);

        double ipi, valorP1, valorP2, quantP1, quantP2, precoP1, precoP2;
        int codP1, codP2;

        System.out.print("Insira a porcentagem do IPI a ser acrescido nas peças: ");
        ipi = input.nextDouble();

        ipi = ipi / 100;

        System.out.print("Insira o código da peça 1: ");
        codP1 = input.nextInt();

        System.out.print("Insira o valor unitário da peça 1: ");
        valorP1 = input.nextDouble();

        System.out.print("Insira a quantidade de peças requeridas: ");
        quantP1 = input.nextDouble();

        System.out.print("Insira o código da peça 2: ");
        codP2 = input.nextInt();

        System.out.print("Insira o valor unitário da peça 2: ");
        valorP2 = input.nextDouble();

        System.out.print("Insira a quantidade de peças requeridas: ");
        quantP2 = input.nextDouble();

        precoP1 = quantP1 * valorP1;
        precoP2 = quantP2 * valorP2;

        System.out.print("Foi solicitado: " + quantP1 + " peças COD" + codP1 + ", juntamente com: " + quantP2 + " peças COD" + codP2);
        System.out.print("\nCom o preço unitário da Peça 1 sendo: R$" + valorP1 + " e da Peça 2 sendo: R$" + valorP2 + ". Temos que: ");
        System.out.print("\nValor peças 1: R$" + precoP1);
        System.out.print("\nValor peças 2: R$" + precoP2);
        System.out.print("\nValor total (Considerando porcentagem IPI aplicada:): R$" + ((precoP1 + precoP2) + ((precoP1 + precoP2) * ipi)));

        input.close();
    }
}
