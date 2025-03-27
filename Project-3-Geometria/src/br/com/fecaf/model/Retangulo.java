package br.com.fecaf.model;

import java.util.Scanner;

// Classe que representa um Retângulo
public class Retangulo {
    // Atributos da classe para armazenar os lados, área e perímetro do retângulo
    public double lado1, lado2, area, perimetro;

    // Instancia o Scanner para capturar entradas do usuário
    Scanner scanner = new Scanner(System.in);

    // Método para cadastrar os lados do retângulo
    public boolean cadastrarRetangulo() {
        System.out.println("========== Cadastro de Retângulo ==========");
        System.out.print("Informe o lado 1: ");
        lado1 = scanner.nextDouble(); // Captura o valor do lado 1
        System.out.print("Informe o lado 2: ");
        lado2 = scanner.nextDouble(); // Captura o valor do lado 2

        // Confirma que o retângulo foi cadastrado com sucesso
        System.out.println("Retângulo cadastrado com sucesso!");
        System.out.println("===========================================");
        return true; // Retorna true indicando que o cadastro foi realizado
    }

    // Método para calcular a área do retângulo
    public void calcularArea() {
        System.out.println("========== Cálculo da Área ==========");
        area = lado1 * lado2; // Fórmula da área: lado1 * lado2
        System.out.println("A área do retângulo é: " + area); // Exibe o resultado da área
        System.out.println("=====================================");
    }

    // Método para calcular o perímetro do retângulo
    public void calcularPerimetro() {
        System.out.println("========== Cálculo do Perímetro ==========");
        perimetro = 2 * (lado1 + lado2); // Fórmula do perímetro: 2 * (lado1 + lado2)
        System.out.println("O perímetro do retângulo é: " + perimetro); // Exibe o resultado do perímetro
        System.out.println("==========================================");
    }

    // Método para verificar se o retângulo é um quadrado
    public void verificarSeQuadrado() {
        System.out.println("========== Verificação de Quadrado ==========");
        if (lado1 == lado2) { // Verifica se os dois lados são iguais
            System.out.println("O retângulo é um quadrado."); // Exibe que é um quadrado
        } else { // Caso os lados sejam diferentes
            System.out.println("O retângulo nao é um quadrado."); // Exibe que não é um quadrado
        }
        System.out.println("=============================================");
    }
}