package com.studies.methods.domain;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtrairDoisNumeros(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    // Passando parametros em um metodo
    public void multiplicarDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double dividirDoisNumeros(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        }
        return (double) num1 / num2; // Casting do retorno
    }

    // Parametros do tipo primitivo
    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Num1: " + num1 + " Num2: " + num2);
        System.out.println("--------------------------");
    }

    public void somaArray(int[] numeros) {
        int soma = 0;

        for (int numero : numeros) {
            soma += numero;
        }
        System.out.println(soma);
    }

    // Usando VarArgs
    public void somaVarArgs(int... numeros) {
        int soma = 0;

        for (int numero : numeros) {
            soma += numero;
        }
        System.out.println(soma);
    }
}
