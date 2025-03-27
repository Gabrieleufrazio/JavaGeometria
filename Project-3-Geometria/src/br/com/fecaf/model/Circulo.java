package br.com.fecaf.model;

import java.util.Scanner;

// Classe que representa um Círculo
public class Circulo {
    // Atributos da classe para armazenar o raio, área e perímetro do círculo
    public double raio, area, perimetro;

    // Instancia o Scanner para capturar entradas do usuário
    Scanner scanner = new Scanner(System.in);

    // Método para cadastrar o raio do círculo
    public boolean cadastrarCirculo() {
        System.out.println("========== Cadastro de Círculo ==========");
        System.out.print("Informe o raio do círculo: ");
        raio = scanner.nextDouble(); // Captura o valor do raio informado pelo usuário

        // Confirma que o círculo foi cadastrado com sucesso
        System.out.println("Círculo cadastrado com sucesso!");
        System.out.println("=========================================");
        return true; // Retorna true indicando que o cadastro foi realizado
    }

    // Método para calcular a área do círculo
    public void calculcarArea() {
        System.out.println("========== Cálculo da Área ==========");

        // Fórmula da área: π * raio²
        area = Math.PI * Math.pow(raio, 2);

        // Exibe o resultado da área
        System.out.println("A área do círculo é: " + area);
        System.out.println("=====================================");
    }

    // Método para calcular o perímetro do círculo
    public void calcularPerimetro() {
        System.out.println("========== Cálculo do Perímetro ==========");

        // Fórmula do perímetro: 2 * π * raio
        perimetro = 2 * Math.PI * raio;

        // Exibe o resultado do perímetro
        System.out.println("O perímetro do círculo é: " + perimetro);
        System.out.println("==========================================");
    }
}