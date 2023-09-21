// Instrução Switch 
public class Programa06 {
	
	public static void main(String[] args) {
		int numero = 5;
		
		switch (numero) {
		case 1:
			System.out.println("O número é 1");
			break;
		case 2:
			System.out.println("O número é 2");
		break;
		case 3:
			System.out.println("O número é 3");
			break;
		case 4:
			System.out.println("O número é 4");
			break;
			

		default:
			System.out.println("O número é "
					+ numero);
			break;
		}
	}

}
