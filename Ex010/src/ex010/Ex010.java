package ex010;

import java.util.Scanner;
import obj.Objeto;
import obj.Personagem;
import obj.Caixa;

public class Ex010 {

    public static void main(String[] args) {
        Objeto[] cenario = new Objeto[] {
            new Personagem("Frodo", 1, 1),
            new Personagem("Bilbo", 2, 1),
            new Caixa(1, 2, 1, 1)
        };

        Scanner scanner = new Scanner(System.in);

        int n = cenario.length - 1;
        while (true) {
            
            try {
                System.out.println("Escolha um objeto de 0 a " + n + ":");
                int i = Integer.parseInt(scanner.nextLine());
                System.out.println(cenario[i]);
            } catch (NumberFormatException e) {
                System.out.println("Erro: Entrada inválida. Por favor, insira um número.");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Erro: Índice fora dos limites. Por favor, escolha um número entre 0 e " + n + ".");
            }

        }
    }
    
}
