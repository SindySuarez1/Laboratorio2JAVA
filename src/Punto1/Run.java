package Punto1;


import java.util.Scanner;

public class Run {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("PROGRAMA PARA DETERMINAR EL IMC");
        System.out.print("Ingrese su peso en Kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        double resultado = peso / (altura * altura);
        int resultado2 = (int)resultado;

        System.out.println("El IMC entero es: " + resultado2);
        System.out.println("El IMC double es: " + resultado);


    }
}
