package com.mycompany.ejerciciosclase2;
import java.util.Scanner;

/**
 *Escribir un programa que solicite al usuario un numero, muestre la tabla de multiplicar correspondiente
 * @author Oscar Tobar <pe.tobar@icloud.com>
 */
public class contrasena {
    
        public static void main(String[] args) {
            
            /*
            Escribir un programa que solicite al usuario una password, verifique la password 
            LA VERIFIQUE USANDO LA SENTENCIA DO WHILE
            */
            Scanner input = new Scanner(System.in);
            String password;
            
            do{
                System.out.println("Ingrese su contrasena: ");
                password = input.next();
            }while(!password.equals("itca123!"));
                System.out.println("CONTRASENA CORRECTA"); 
        }
    
}
