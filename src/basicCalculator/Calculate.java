package basicCalculator;

import java.util.Scanner;

public class Calculate {
	
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean op = true;
        
        while(op) {
        	int opcion, cn,resultado = 0, cont=1;
        	System.out.println("*****************************************");
        	System.out.println("Menu de Opciones");
        	System.out.println("1. Sumar");
        	System.out.println("2. Restar");
        	System.out.println("3. Multiplicar");
        	System.out.println("4. Dividir");
        	System.out.println("5. Salir");
        	System.out.println("Seleccione el numero de la opcion que desea");
        	opcion = entrada.nextInt();
        	
        	
        	if(opcion == 5) {
        		System.out.println("Finalizo el programa");
        		break;
        	}
        	else {
        		switch(opcion) {
        		case 1:
        			System.out.println("Ingrese la cantidad de numeros que desea sumar");
        			cn = entrada.nextInt();
        			while(cont <= cn) {
        				System.out.println("Ingrese el valor #" + cont);
        				resultado = entrada.nextInt() + resultado;
        				cont+=1;
        			}
        			System.out.println("El resultado de la suma es: "+ resultado);
        			break;
        			
        		case 2:
        			System.out.println("Ingrese la cantidad de numeros que desea restar");
        			cn = entrada.nextInt();
        			while(cont <= cn) {
        				System.out.println("Ingrese el valor #" + cont);
        				if(cont == 1) {
        				resultado = entrada.nextInt() - resultado;
        				}
        				else {
        					resultado = resultado - entrada.nextInt();
        				}
        				cont+=1;
        			}
        			System.out.println("El resultado de la resta es: " + resultado);
        			break;
        				
        		case 3:
        			System.out.println("Ingrese la cantidad de numeros que desea multiplicar");
        			cn = entrada.nextInt();
        			resultado=1;
        			while(cont <= cn) {
        				System.out.println("Ingrese el valor #" + cont);
        				resultado = entrada.nextInt() * resultado;
        				cont+=1;
        			}
        			System.out.println("El resultado de la multiplicacion es: "+ resultado);
        			break;
        			
        		case 4:
        			System.out.println("Ingrese la cantidad de numeros que desea dividir");
        			cn = entrada.nextInt();
        			resultado=1;
        			while(cont <= cn) {
        				System.out.println("Ingrese el valor #" + cont);
        				if(cont == 1) {
        				resultado = entrada.nextInt() / resultado;
        				}
        				else {
        					resultado = resultado / entrada.nextInt();
        				}
        				cont+=1;
        			}
        			System.out.println("El resultado de la division es: "+ resultado);
        			break;
        			
        		default:
        			System.out.println("Opcion no valida");
        				
        		}
        	}
       
        }
	}
}
