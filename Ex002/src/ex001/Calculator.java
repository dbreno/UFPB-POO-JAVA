package ex001;

import java.util.Scanner;

public class Calculator {
    private static final char ADD = '+';
    private static final char SUB = '-';
    private String input;
    private String parts[];
    private int resultado;
    private char operador;
    private int operando;
    private int retorno = 0;
    
    public void readInput() {
        Scanner scanner = new Scanner(System.in);
        
        //Lê a entrada do usuário como uma única linha
        System.out.print("Digite a operacao (Exemplo: 3 + 5 - 7): ");
        input = scanner.nextLine();
        
        //Divide a entrada em operadores e operandos
        parts = input.split("(\\s+)"); //Dividir por espaços
        resultado = Integer.parseInt(parts[0]); //Primeiro operando
        
        //Itera sobre os restantes dos operandos e operadores
        
        for (int i = 1; i < parts.length; i+= 2) {
            operador = parts[i].charAt(0);
            operando = Integer.parseInt(parts[i + 1]);
        }
        scanner.close(); //Fechar scanner
    }
    
    public void printResult() {
        
        if (operador == ADD) {
            resultado += operando;
            
        } else if (operador == SUB) {
            resultado -= operando;
  
        } else {
            System.out.println("Operador invalido! Programa encerrado.");
            retorno = 1;
        }
        
        if (retorno != 1) {
            System.out.println("Resultado: " + resultado);
        }
           
    }
}
