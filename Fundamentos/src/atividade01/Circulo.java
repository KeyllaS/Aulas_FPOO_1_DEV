package Atividade01;

import java.util.Scanner;

public class Circulo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio do circulo:");
        double raio = scanner.nextDouble();
        double area;
        area = 3.14 * (raio * raio);
        if (raio <= 0) {
            System.out.println("Não é possivel ter um raio negativo");

        } else {
            System.out.println("Area do circulo: " + area);
        }
    }

}
