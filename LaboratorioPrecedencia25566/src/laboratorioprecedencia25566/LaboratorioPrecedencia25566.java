/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioprecedencia25566;

import java.util.Scanner;

/**
 *
 * @author escuela
 */
public class LaboratorioPrecedencia25566 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Primera parte : Precedencia de Operaciones
double x = 9 + 10 / 2 * 6 % 2;
System.out.println("El valor de x es : " + x);
x = (9 + 10 / 2) * ( 6 % 2);
System.out.println("El nuevo valor de x es : " + x);
// Segunda parte – Ejercicios
Scanner leer;
        leer = new Scanner(System.in);
x = 9 / 2 * 2;
System.out.println("x = 9 / 2 * 2");
System.out.print("¿Cuál es el valor de x? : ");
leer.nextLine();
System.out.println("El valor de x es : " + x);
boolean b = (6 * 6 > (5 + 10) + 20);
System.out.println("b = (6 * 6 > (5 + 10) + 20)");
System.out.print("¿Cual es el valor de b? : ");
leer.nextLine();
System.out.println("El valor de b es : " + b);
int[] arreglo = { 4 , 4 };
int i = 1;
arreglo[i] = i = 0;
System.out.println("arreglo = { 4 , 4 }");
System.out.println("arreglo[i] = i = 0");
System.out.print("¿Qué posición del arreglo se modificó? " +
"¿Y con qué valor?");
leer.nextLine();
System.out.println("El arreglo quedó así: { " + arreglo[0] + " , "
+ arreglo[1] + " }");

int b = !( 2 * (3 + 3) / 8 – 2 >0) && (6 + (2 * 2) > (3 * 3));

System.out.println("b = !( 2 * (3 + 3) / 8 – 2 > 0) " +
"&& (6 + (2 * 2) > (3 * 3))");
System.out.print("¿Cuál es el valor de b? : ");
leer.nextLine();
System.out.println("El valor de b es : " + b);
    }
 }
