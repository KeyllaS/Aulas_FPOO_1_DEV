package atividade01;


import java.util.Scanner;

public class ValorMulta {
            
    public static void main(String[] args) {
        
        final int LIMITE_VELOCIDADE = 80;
        final double  VALOR_MULTA_POR_KM = 5.00;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a vcelocidade do carro (em km/h):");
        int velocidade = scanner.nextInt();
        
        if (velocidade > LIMITE_VELOCIDADE) {
            int velocidadeExcedente = velocidade - LIMITE_VELOCIDADE;
            double valorMulta = velocidadeExcedente * VALOR_MULTA_POR_KM;
            System.out.println("Motorista multado!");
            System.out.println("velocidade excedente; " + velocidadeExcedente + "km/h");
            System.out.println("valor da multa : R$" + valorMulta);
        } else {
            System.out.println("Velocidade dentro do limite.Boa viagem");
            
        }
    }
}
