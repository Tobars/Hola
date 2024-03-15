/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosclase2;

import java.util.Scanner;

/**
 *
 * @author Oscar Tobar <pe.tobar@icloud.com>
 * 
 * Escribir un programa que le pida al usuario un numero del 1 al 7 y muestre el dia de la semana que le corresponde
 */


public class diaSemana {
        public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
            System.out.println("Ingrese un numero del 1 al 7");
            int num = input.nextInt();
            
            
            String dia;
            switch (num){
                
                
                case 1:
                
                dia = "Lunes";
                break;
                
                case 2:
                
                dia = "Martes";
                break;
                
                case 3:
                
                dia = "Miercoles";
                break;
                
                case 4:
                
                dia = "Jueves";
                break;
                
                case 5:
                
                dia = "Viernes";
                break;
                
                case 6:
                
                dia = "Sabado";
                break;
                
                case 7:
                
                dia = "DOmingo";
                break;
                
                default:
                
                dia = "Dia Invalido";
                break;
                
                    
                
            }
            
            System.out.println("El dia de la semana escogido es: " + dia );
            
            
            
                    
                    }
        
        
            
}
