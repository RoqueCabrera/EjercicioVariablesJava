/*FASE 1
*/

import java.util.Scanner;

public class Fase1 {

	public static void main(String[] args) {

//Crea tres variables string e inicialitzales amb les dades pertinents (nom, cognom1, cognom2).

		String name;
		String surname1;
		String surname2;
		
//Crea tres variables int e inicialitzales amb les dades pertinents (dia, mes, any).		

		int day;
		int month;
		int year;
		
		name= "Peter";
		surname1= "Factory";
		surname2= "Suárez";
		day= 15;
		month= 01;
		year= 1964;

//Mostra per pantalla les variables string concatenant-les en aquest ordre (cognom1 + cognom2, + nom).		

		
		System.out.println(surname1 + " " + surname2 + " " + name);
		
//Mostra per pantalla les variables int concatenant-les amb “/” entre cada una d’elles

		System.out.println(day + "/" + month +"/" + year);
		
		System.out.println("");

		
//FASE 2 
//Sabiendo que 1948 es un año bisiesto
		
//● Crea una constante con el valor del año (1948).
		
				final int initialYear = 1948;
				
//● Crea una variable que guarde cada cuánto hay un año bisiesto.
				
		
		int nextLeapYear= initialYear + 4;
		int previousLeapYear= initialYear - 4;	
		
		
/*● Calcula cuántos años bisiestos hay entre 1948 y tu año de nacimiento y almacenar el valor
resultante en una variable.*/
		
		int birthyear = 1988;
		int recount = ((1988-1948)/4)+1;
		
//● Muestra por pantalla el resultado del cálculo.
		System.out.println ("There has/have been " + recount + " leap years between " + initialYear + " and " + birthyear);
								
				
		System.out.println("");
		
				
//FASE 3


/*●Partiendo del año 1948 tienes que hacer un bucle "for" y mostrar los años bisiestos hasta llegar a tu año
de nacimiento.*/
		
		for (int i = 1948; i <= 1988; i=i+4) {
			  System.out.println(i);
			}
		
/*● Crea una variable "boolean" que será cierta si el año de nacimiento es bisiesto o falsa si no lo es. En caso de que la variable boolean sea cierta, tiene que mostrar por consola una frase donde lo diga, 
 * en caso de ser falsa mostrará la frase pertinente. Crea dos variables string para guardar les frases.*/
		
		System.out.println("");

		
		int birthdate= 1988;
				
		/*TANQUETA 
		 * System.out.println(birthdate == 1988 || birthdate == 1984 || birthdate == 1980 || birthdate ==1976 || birthdate ==1972
				|| birthdate ==1968 || birthdate == 1964 || birthdate ==1960 || birthdate ==1956 || birthdate ==1952 || birthdate ==1948); 
				TANQUETA*/
		
		
		if ((birthdate % 4 == 0) && ((birthdate % 100 != 0) || (birthdate % 400 == 0)))
			System.out.println(birthdate + " is a leap year!");
		else
			System.out.println(birthdate + " is not a leap year!");
		
/*FASE 4
● Crea una variable donde juntarás el nombre y los apellidos (todo en una variable) y otra donde juntarás la fecha
de nacimiento separada por “/” (todo en una variable). Muestra por consola las variables del nombre completo,
la fecha de nacimiento y si el año de nacimiento es de traspaso o no.

Exemple de sortida per consola:
El meu nom és Juan Perez Gonzalez
Vaig néixer el 01/01/1979
El meu any de naixement és de traspàs.*/
		
		System.out.println("");

		
		
		String nameNew = "Paco";
		String surname1New = "Mer";
		String surname2New = "Algo";
		int dayNew = 04;
		int monthNew = 9;
		int yearNew = 1996;

		System.out.println("My name is " + nameNew+ " " + surname1New  + " " + surname2New );
		System.out.println("I was born the " + dayNew + "/0" + monthNew +"/" + yearNew);
		
		if ((yearNew % 4 == 0) && ((yearNew % 100 != 0) || (yearNew % 400 == 0)))
			System.out.println("My year of birth is a leap year!");
		else
			System.out.println("My year of birth is not a leap year!");
	}

}

