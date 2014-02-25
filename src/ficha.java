import java.util.Scanner;
public class ficha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mi_escaner = new Scanner (System.in);
		System.out.println("Ingrese su Nombre");
		String nombre = mi_escaner.next();
		System.out.println("Ingrese su edad");
		int edad = mi_escaner.nextInt();
		System.out.println("Ingrese sexo");
		String sexo = mi_escaner.next();
		System.out.println("Casado");
		boolean casado = mi_escaner.nextBoolean();
		System.out.println("Ficha personal");
		System.out.println("Su nombre: "+ nombre);
		System.out.println("Su edad: "+edad);
		System.out.println("Sexo: " +sexo);
		System.out.println("Casado: "+casado);
	}

}
