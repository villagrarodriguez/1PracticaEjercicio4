/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1practicaejercicio4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DINA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner o=new Scanner(System.in);
        Random dado=new Random();
        int numero,escribir ,restric=12;
       
        
        for(int i=1;i<restric;i++){
            System.out.println("escriba un numero:");
            escribir=o.nextInt();
            numero=dado.nextInt(7);
            
            
            
            if(numero>escribir){
               
                System.out.println("íel numero ingresado es menor!!!");
                System.out.println("el numero aleatorio fue:"+numero);
                restric--;
                System.out.println("te quedan :"+restric+" intentos");
            }
                
            if(numero<escribir){
                 
                  System.out.println("íel numero ingresado es mayor!!");
                System.out.println("el numero aleatorio fue:"+numero);
                restric--;
                System.out.println("te quedan :"+restric+" intentos");
            }
            if(numero==escribir)
                System.out.println("felicitaciones!! acertaste, en tan solo "+i+" intentos");
               
            
            
             
        
        }
    
   
    }
    
}
