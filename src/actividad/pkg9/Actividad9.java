/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg9;
import java.util.Scanner;
/**
 *
 * @author Rafael
 */
public class Actividad9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tamaño = solicitartamaño();
        int [][] a = arreglo ("A", tamaño);
        int [][] b = arreglo ("B", tamaño);
        
        sumamatriz (a,b);
       
    }
    public static int solicitartamaño(){
        Scanner key = new Scanner (System.in);
        boolean flag;
        int a = 0;
        do{
            try{
                System.out.println("Escribe el tamaño del arreglo: ");
                a = key.nextInt();
                flag = false;
            }
            catch (Exception e){
                System.out.println("Error");
                key.next();
                flag = true;
            }
        }
        while (flag);
        return a;
    }
    public static int solicitarentero(){
        Scanner key = new Scanner (System.in);
        boolean flag;
        int a = 0;
        do{
            try{
                System.out.println("Escribe un entero: ");
                a = key.nextInt();
                flag = false;
            }
            catch (Exception e){
                System.out.println("Error");
                key.next();
                flag = true;
            }
        }
        while (flag);
        return a;
    }
    public static int [][] arreglo (String a, int tamaño){
        int [][]arreglo = new int [tamaño][tamaño];
        System.out.println("Arreglo: " + a);
        for (int i = 0; i < arreglo.length; i++){
        for (int j = 0; j < arreglo[i].length; j++){
        arreglo [i][j] = solicitarentero();
        }
        }
        return arreglo;
    }
    public static int [][] sumamatriz (int [][]a, int[][]b){
        int [][] r = new int [a.length] [a.length];
        System.out.println("Suma: ");
        for (int i = 0; i < a.length; i++){
        for (int j = 0; j < a[i].length; j++){
        r[i][j] = a[i][j] + b[i][j];
        System.out.println("["+r[i][j]+"]");   
    }
        System.out.println("");   
    }
        return r; 
    }
    
}
