package ex001;

import java.util.Scanner;

public class Calculator {
    private int primeiroOperando;
    private static final char ADD = '+';
    private static final char SUB = '-';
    private int operator;
    private String input;
    private int segundoOperando;
    
    public void readInput() {
        Scanner scanner = new Scanner(System.in);
        
        //Lê o primeiro operando
        System.out.print("Digite o primeiro operando: ");
        this.primeiroOperando = Integer.parseInt(scanner.nextLine());
        
        //Lê o operador
        System.out.println("");
        System.out.print("Digite o operador (+ ou -): ");
        this.input = scanner.nextLine();
        System.out.println("");
        if (input.length() == 1) {
            char operador = input.charAt(0);
            if (operador == ADD || operador == SUB) {
                this.operator = operador;
                //Lê o segundo operando
                System.out.print("Digite o segundo operando: ");
                this.segundoOperando = Integer.parseInt(scanner.nextLine());
                scanner.close();
            } else {
                System.out.println("Operador Invalido! Programa encerrado");
            }
        } else {
            System.out.println("Operador Invalido! Programa encerrado");
            
        }
        
        //Lê o segundo operando
        
 
    }
    
    public void printResult() {
        
        int resultado = 0; //Inicializando com um valor 
        
        if (operator == ADD) {
            resultado = primeiroOperando + segundoOperando;
        } else if (operator == SUB){
            resultado = primeiroOperando - segundoOperando;
        } else {
            System.out.println("Operador invalido!");
        }
        System.out.println("");
        System.out.println("Resultado: " + resultado);
    }
}
