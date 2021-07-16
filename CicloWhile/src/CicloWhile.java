import java.util.Scanner;

public class CicloWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector2= new Scanner(System.in);
		int numero1,numero2;
		boolean nosoniguales=true;
		System.out.println("Este programas pide dos numeros y se detiene cuando ambos son iguales");
		while(nosoniguales) {
			System.out.println("Ingrese el primer numero: ");
			numero1=lector2.nextInt();
			System.out.println("Ingrese el segundo numero: ");
			numero2=lector2.nextInt();
			
			if(numero1==numero2) {
				System.out.println("Los numeros son iguales, el programa se finalizara ");
				nosoniguales=false;
			}else {
				System.out.println("Los numeros no son iguales ");
			}
		} //fin while
		
	} // fin main

}
