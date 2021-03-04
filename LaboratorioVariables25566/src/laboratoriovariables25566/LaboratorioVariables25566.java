/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratoriovariables25566;

import java.util.Scanner;

/**
 *
 * @author escuela
 */
public class LaboratorioVariables25566 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Primera parte : Declaración de variables primitivas
boolean booleano;
char caracter;
byte numeroMuyPequeño;
short numeroPequeño;
int entero;
long largo;
float flotante;
double doble;
// Segunda parte: Diferencias entre los tipos de datos primitivos
entero = 97;
doble = 97;
caracter = 97;
System.out.println("El valor 97 como entero es: " + entero);
System.out.println("El valor 97 como doble es: " + doble);
System.out.println("El valor 97 como caracter es: " + caracter);
// Tercera parte: Variables de Referencia
String cadena = "Variables de Referencia!";
Scanner sc = new Scanner(System.in);

System.out.println("¡Los Strings en Java son " + cadena);
System.out.println("");
// Cuarta parte: Literales
booleano = true;
caracter = 7;
System.out.println(booleano);
System.out.println(caracter);
System.out.println("");
booleano = false;
caracter = '\u0037';
System.out.println(booleano);
System.out.println(caracter);
caracter = '\n';
System.out.println("El caracter salto de línea en acción: ");
System.out.println(caracter);
flotante = 3.14159265f;
System.out.println(flotante);
cadena = "¡Puedes asignar valores a un String con literales!";
System.out.println(cadena);
System.out.println(caracter);
System.out.println("¿Cómo te llamas?: ");
//String nombre = lector.nextLine();
String nombre;
        nombre = sc.nextLine();

System.out.println("¿Cuántos años tienes?: ");
        String edad;
        edad = sc.nextLine();
        
System.out.println("¡Te llamas " + nombre + " y tienes " + edad + "años");
    }
    
}
