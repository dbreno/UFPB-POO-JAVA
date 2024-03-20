package ex007;

import java.util.Scanner;

public class Ex007 {
	
	public static void main(String[] args) {
		Speaker speakers[] = new Speaker[] {
			new Personagem("Frodo", 1, 1),
			new Personagem("Bilbo", 2, 1),
                        new Mensagem(),
		};

		Scanner scanner = new Scanner(System.in);

		int n = speakers.length - 1;
		while (true) {
			System.out.print("Escolha um personagem ou mensagem de 0 a " + n + ": ");
			int i = Integer.parseInt(scanner.nextLine());
                        System.out.println("");
			if (i >= 0 && i <= n) {
                            System.out.print(speakers[i].getClass().getSimpleName() + " ");
                            if (speakers[i] instanceof Personagem) {
                                System.out.print(((Personagem)speakers[i]).getName());
                            } 
                            speakers[i].speak(); 
                        } else {
                            System.out.println("Opcao invalida!");
                        }
                        System.out.println("");
                        
		} 

	}

}
