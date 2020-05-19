package group.DniValidator;


import java.util.Scanner;

import groupo.Clases.Dni;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {

    	System.out.println("introduzca un DNI:");
    	//Get Dni Value
    	Scanner scanner = new Scanner(System.in);
    	String dniTxt=scanner.nextLine();
    	Dni dni= new Dni();
    	//Dni class
    	dni.validadorDni(dniTxt);
    }
   
}
