/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 
package promedio;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Flor Melanni Infante
 */
public class Promedio {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        double divicion;
        double operacion=0;
        int n;
        
        Scanner sc = new Scanner (System.in);
        BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));
        boolean validar = false;
        
	    System.out.print(" Cuantos datos desea capturar: ");
	    n = Integer.parseInt(sc.nextLine());;
        
	int[] numero = new int[n];
        
	for(int i =0; i<n; i++)
        {
	    System.out.print("Introduce el numero " + (i+1)+": ");
            numero[i] = Integer.parseInt(sc.nextLine());
	}
        
	for(int i =0; i<n; i++)
        {
            operacion += numero[i];	
	}
        System.out.println("_______________");
        for(int i=0; i<n; i++){
            System.out.println ("El arreglo original es: " + numero[i]);
        } 
	divicion = operacion/n;
	System.out.println("El promedio es: " + divicion);       
        }
    }
    
   
