package com.mycompany.ejercicio3edd;

import java.util.Scanner;

/**
 * Calculate the area of a triangle.
 *
 * @author Aroa Granero Omañas
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println("¿Cual es el area del triángulo?");
        Scanner scanner = new Scanner(System.in);
        triangle.setHeight(scanner.nextFloat());

        System.out.println("¿Cual la base del triángulo?");
        scanner = new Scanner(System.in);
        triangle.setBase(scanner.nextFloat());

        float area = triangle.calculateArea();
        System.out.println("El area del triangula es: " + area);

        float fixedHeight = 5;
        float fixedBase = 4;

        Triangle fixedTriangle = new Triangle(fixedBase, fixedHeight);
        System.out.println("El area del triangulo fijado es " + fixedTriangle.calculateArea());
        if (3 > 2) {
            System.out.println("");
        }
    }

}
/**
 * shift + alt + F (order the code placement)
 */