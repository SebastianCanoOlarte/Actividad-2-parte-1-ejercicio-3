/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad2parte1ejerecicionumero3;

import java.util.Scanner;
public class Actividad2Parte1EjerecicioNumero3 {

    public static void main(String[] args) {
        int a, b, c,perimetro,semi;
        double area;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("escriba los tres lados de un triangulo");
        a = leer.nextInt();
        b = leer.nextInt();
        c = leer.nextInt();
        perimetro = a+b+c;
        semi = perimetro/2;
        area = Math.sqrt(semi*(semi-a)*(semi-b)*(semi-c));
        System.out.println("el primetro del triangulo es "+perimetro);
        System.out.println("el semiperimetro del triangulo es "+semi);
        System.out.println("el area del triangulo es "+area);
    }
}
