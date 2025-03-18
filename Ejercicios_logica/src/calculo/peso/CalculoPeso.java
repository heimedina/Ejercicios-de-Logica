package calculo.peso;

import java.util.Scanner;

public class CalculoPeso {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); 
		System.out.println("Introduzca el valor del peso:");
		double peso = Double.parseDouble(keyboard.nextLine()); //Double para admitir pesos con decimales
		double pesoLUNA = peso*17/100 ; // 17% = 17/100 
		System.out.println("Un peso de "+ peso+" Kilos en la Tierra equivalen a "+pesoLUNA+" Kilos en la Luna");
	}

}
