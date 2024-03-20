package ex008;
import java.util.Scanner;

public class Ex008 {
	
	public static void main(String[] args) {
		
                obj.Scene scene = new obj.Scene();
                obj.Objeto cenario[] = scene.createScene();
		Scanner scanner = new Scanner(System.in);

		int n = cenario.length - 1;
		while (true) {
			System.out.println("Escolha um objeto de 0 a " + n + ":");
			int i = Integer.parseInt(scanner.nextLine());
			System.out.println(cenario[i]);
		}

	}

}
