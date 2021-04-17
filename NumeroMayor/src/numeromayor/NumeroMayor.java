/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeromayor;

import java.util.Scanner;

/**
 *
 * @author escuela
 */
public class NumeroMayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);                
int iNumero1, iNumero2;
                
System.out.println("Dame el primer número");
iNumero1 = reader.nextInt();
System.out.println("Dame el segundo número");
iNumero2 = reader.nextInt();
       if (iNumero1>iNumero2)
          System.out.println(iNumero1 + " es mayor que " + iNumero2);
       else
          System.out.println(iNumero2 + " es mayor que " + iNumero1);
    }
    
}
