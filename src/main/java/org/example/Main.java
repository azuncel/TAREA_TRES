package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        String[] nombres = new String[2];
        Scanner scaner = new Scanner(System.in);
        System.out.print("Ingresar nombre: ");
        nombres[0] = scaner.next();
        System.out.print("Ingresar apellido: ");
        nombres[1] = scaner.next();

        String[] iniciales = new String[2];
        iniciales[0] = nombres[0].substring(0,1) + "." + nombres[1].substring(nombres[1].length() -2).toUpperCase();
        System.out.println(iniciales[0]);
    }
}