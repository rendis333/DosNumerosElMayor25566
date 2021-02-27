/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial25566;

/**
 *
 * @author escuela
 */
public class Factorial25566 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 15;
        int factorial =1;
        // TODO code application logic here
        while ( numero!=0) {
             factorial = factorial*numero;
             numero--;
             System.out.println(factorial);
        }
        
    }
}