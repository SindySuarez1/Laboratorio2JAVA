package punto2;

import java.util.Scanner;

public class Run2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Programa para comparar edad de dos amigos!");
        System.out.print("Ingresa la edad de Pepito: ");
        int edadPepito = scanner.nextInt();

        System.out.print("Ingresa la edad de Juan: ");
        int edadJuan = scanner.nextInt();

        System.out.println("Resultados:");
        System.out.println("Pepito es mayor: " + (edadPepito > edadJuan));
        System.out.println("Pepito es menor: " + (edadPepito < edadJuan));
        System.out.println("Pepito y Juan tienen la misma edad: " + (edadPepito == edadJuan));
        scanner.close();


    }
}
