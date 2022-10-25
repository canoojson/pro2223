package _02ejemplos;

public class _21MetodoVoid {
	public static void main(String[] args) {
		rotulo("HOLA");
	}
	//Cuando un método no devuelve un resultado
	// en la cabecera se indica con "void" en el 
	// tipo devuelto.
	// En los metodos void no es necesario poner return
	public static void rotulo (String mensaje) {
		int longitud = mensaje.length();
		linea (longitud + 4);
		System.out.println("* " + mensaje + " *");
		linea (longitud + 4);
		
		return; //<<< Este return se puede poner o no.	
	}
	
	public static void linea(int longitud) {
		int cont = 0;
		while (cont < longitud) {
			System.out.print("*");
			cont = cont + 1;
		}
		System.out.println();
	}

}
