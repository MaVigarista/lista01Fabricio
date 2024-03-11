//Escreva um programa que calcule os quadrados e cubos dos números de 0 a 10 e imprima os valores resultantes em formato de tabela como a seguir:

import javax.swing.*;
import java.awt.*;


public class exer19 {
    public static void main (String[]args) {
        SwingUtilities.invokeLater(() -> {

            JFrame frame = new JFrame("Tabela de Valores");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            Double [][] data = {
                {Math.pow(0, 1), Math.pow(0, 2), Math.pow(0, 3)},
                {Math.pow(1, 1), Math.pow(1, 2), Math.pow(1, 3)},
                {Math.pow(2, 1), Math.pow(2, 2), Math.pow(2, 3)},
                {Math.pow(3, 1), Math.pow(3, 2), Math.pow(3, 3)},
                {Math.pow(4, 1), Math.pow(4, 2), Math.pow(4, 3)},
                {Math.pow(5, 1), Math.pow(5, 2), Math.pow(5, 3)},
                {Math.pow(6, 1), Math.pow(6, 2), Math.pow(6, 3)},
                {Math.pow(7, 1), Math.pow(7, 2), Math.pow(7, 3)},
                {Math.pow(8, 1), Math.pow(8, 2), Math.pow(8, 3)},
                {Math.pow(9, 1), Math.pow(9, 2), Math.pow(9, 3)},
                {Math.pow(10, 1), Math.pow(10, 2), Math.pow(10, 3)}
            };

            String[] colunas = {"Número", "Quadrado", "Cubo"};

            JTable tabela = new JTable(data, colunas);
            JScrollPane scrollPane = new JScrollPane(tabela);

            frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
            frame.setSize(300, 300);
            frame.setVisible(true);
        });
    }
}
