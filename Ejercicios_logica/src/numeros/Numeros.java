package numeros;

import java.util.Scanner;

public class Numeros {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Introduzca el primer numero entero:");
		int a = Integer.parseInt(keyboard.nextLine());
		System.out.println("Introduzca el segundo numero entero:");
		int b = Integer.parseInt(keyboard.nextLine());
		System.out.println("Introduzca el tercer numero entero:");
		int c = Integer.parseInt(keyboard.nextLine());
		double ope1 = a*b/c , ope2 = (a*c)%b , ope3=2*(a+c-b)/(b*c) ,
				ope4= ((a*c)+(b%a))/a-c;
		
		System.out.println("Resultado de la Operacion 1: "+ope1);
		System.out.println("Resultado de la Operacion 2: "+ope2);
		System.out.println("Resultado de la Operacion 3: "+ope3);
		System.out.println("Resultado de la Operacion 4: "+ope4);
		
		System.out.println("\nAHORA CON DECIMALES");
		System.out.println("Introduzca el primer numero:");
		double a1 = Double.parseDouble(keyboard.nextLine());
		System.out.println("Introduzca el segundo numero:");
		double b1 = Double.parseDouble(keyboard.nextLine());
		System.out.println("Introduzca el tercer numero:");
		double c1 = Double.parseDouble(keyboard.nextLine());
		ope1 = a1*b1/c1 ; ope2 = (a1*c1)%b1 ; ope3=2*(a1+c1-b1)/(b1*c1) ; ope4= ((a1*c1)+(b1%a1))/a1-c1;
		
		System.out.println("Resultado de la Operacion 1: "+ope1);
		System.out.println("Resultado de la Operacion 2: "+ope2);
		System.out.println("Resultado de la Operacion 3: "+ope3);
		System.out.println("Resultado de la Operacion 4: "+ope4);
	}
}
