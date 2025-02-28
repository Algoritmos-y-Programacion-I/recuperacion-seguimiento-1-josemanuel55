package ui;

import java.util.Scanner;
import java.lang.Math;

public class Recuperatorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ejercicio 1
        System.out.println("Ejercicio 1: Cantidad de números iguales");
        System.out.print("Ingrese tres números enteros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.println("Cantidad de números iguales: " + contarIguales(num1, num2, num3));
        
        // Ejercicio 2
        System.out.println("\nEjercicio 2: Saludo o despedida");
        System.out.print("Ingrese un nombre: ");
        String nombre = scanner.next();
        System.out.print("Ingrese 1 para saludo o 0 para despedida: ");
        int opcion = scanner.nextInt();
        System.out.println(generarMensaje(nombre, opcion));
        
        // Ejercicio 3
        System.out.println("\nEjercicio 3: Contar cadenas con 4 o más caracteres");
        System.out.print("Ingrese tres palabras: ");
        String str1 = scanner.next();
        String str2 = scanner.next();
        String str3 = scanner.next();
        System.out.println("Cantidad de palabras con 4 o más caracteres: " + contarCadenasLargas(str1, str2, str3));
        
        // Ejercicio 4
        System.out.println("\nEjercicio 4: Comparar tercera posición de cadenas");
        System.out.print("Ingrese dos palabras: ");
        String palabra1 = scanner.next();
        String palabra2 = scanner.next();
        System.out.println(compararTerceraPosicion(palabra1, palabra2));
        
        // Ejercicio 5
        System.out.println("\nEjercicio 5: Resolver ecuación cuadrática");
        System.out.print("Ingrese el coeficiente a: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el coeficiente b: ");
        double b = scanner.nextDouble();
        System.out.print("Ingrese el coeficiente c: ");
        double c = scanner.nextDouble();
        calcularRaices(a, b, c);
        
        scanner.close();
    }

    public static int contarIguales(int a, int b, int c) {
        if (a == b && b == c) return 3;
        if (a == b || a == c || b == c) return 2;
        return 0;
    }

    public static String generarMensaje(String nombre, int opcion) {
        if (opcion == 1) return "Hola " + nombre;
        if (opcion == 0) return "Chao " + nombre;
        return "Error: entradas inválidas";
    }

    public static int contarCadenasLargas(String str1, String str2, String str3) {
        int count = 0;
        if (str1.length() >= 4) count++;
        if (str2.length() >= 4) count++;
        if (str3.length() >= 4) count++;
        return count;
    }

    public static String compararTerceraPosicion(String str1, String str2) {
        if (str1.length() < 3 || str2.length() < 3) return "Error: Una de las cadenas es demasiado corta";
        return str1.charAt(2) == str2.charAt(2) ? "true" : "false";
    }

    public static void calcularRaices(double a, double b, double c) {
        if (a == 0) {
            System.out.println("El coeficiente 'a' no puede ser cero en una ecuación cuadrática.");
            return;
        }
        
        double discriminante = Math.pow(b, 2) - 4 * a * c;
        
        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las raíces son: x1 = " + x1 + ", x2 = " + x2);
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            System.out.println("La ecuación tiene una única raíz real: x = " + x);
        } else {
            System.out.println("La ecuación no tiene raíces reales.");
        }
    }
}
