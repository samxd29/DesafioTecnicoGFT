package exercicio2;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o tamanho do lado 1: ");
        int lado1 = scan.nextInt();
        System.out.println("Informe o tamanho do lado 2: ");
        int lado2 = scan.nextInt();
        System.out.println("Informe o tamanho do lado 3: ");
        int lado3 = scan.nextInt();

        if (lado1 == lado2 && lado1 == lado3){
            System.out.println("Equilatero");
        } else if (lado1 == lado2 || lado1 == lado3) {
            System.out.println("Isosceles");
        } else if (lado1 == lado2 && lado2 == lado3 && lado3 == lado1) {
            System.out.println("Escaleno");
        }
    }
}
