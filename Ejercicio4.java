//Ejercicio Propuesto No 14

import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        double num, cuadrado, cubo;

        Scanner entrada = new Scanner(System.in);
        num = entrada.nextDouble();
        cuadrado = Math.pow(num, 2);
        cubo = Math.pow(num, 3);

        System.out.println("El cuadrado del numero ingresado es: " + Math.round(cuadrado));
        System.out.println("El cubo del numero ingresado es: " + Math.round(cubo));

    }
}
