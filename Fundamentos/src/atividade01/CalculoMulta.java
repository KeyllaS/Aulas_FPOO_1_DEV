package Atividade01;

import java.util.Scanner;

public class CalculoMulta {
    public static void main(String[] args) {
        
         final int LIMITE_VELOCIDADE = 80;
        final double VALOR_MULTA_POR_KM = 5.00;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a velocidade do carro (em km/h): ");
        int velocidade = scanner.nextInt();

        if (velocidade > LIMITE_VELOCIDADE) {
            int velocidadeExcedente = velocidade - LIMITE_VELOCIDADE;
            double valorMulta = velocidadeExcedente * VALOR_MULTA_POR_KM;
            System.out.println("Motorista multado!");
            System.out.println("Velocidade excedente: " + velocidadeExcedente + " km/h");
            System.out.println("Valor da multa: R$" + valorMulta);
        } else {
            System.out.println("Velocidade dentro do limite permitido. Boa viagem!");
        }

    }
}
