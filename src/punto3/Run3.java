package punto3;

import java.util.Scanner;

public class Run3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Programa de comparación de edades!");
        System.out.print("Ingrese la edad de la primera persona: ");
        int edad1 = scanner.nextInt();

        System.out.print("Ingrese la edad de la segunda persona: ");
        int edad2 =  scanner.nextInt();

        System.out.println("Resultados:");
        System.out.println("¿Ambas personas son mayores de 18 años?: " + (edad1 > 18 && edad2 >18));
        System.out.println("¿Ambas personas son menores de 30 años?: " + (edad1 < 30 && edad2 <30));
        System.out.println("¿Alguna de las personas es mayor de 50 años?: " + (edad1 > 50 || edad2 >50));
        scanner.close();


    }
}
