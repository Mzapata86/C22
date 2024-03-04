package co.com.ps;

import java.util.Scanner;
public class TrabajoEnClase1 {
    public static void main(String[] args) {
         int promedio;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String nombre= scanner.next();

        System.out.println("Digite el primer numero");
        int num1 = scanner.nextInt();

        System.out.println("Digite el segundo numero");
        int num2 = scanner.nextInt();

        System.out.println("Digite el tercer numero");
        int num3 = scanner.nextInt();

        promedio = (num1+num2+num3)/3;
        System.out.println(nombre + "El promedio es: "+promedio);

        scanner.close();
    }
}
