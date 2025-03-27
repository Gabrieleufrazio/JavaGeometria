package br.com.fecaf.model;

import java.util.Scanner;

// Classe que representa um Triângulo
public class Triangulo {
    // Atributos da classe para armazenar os lados, altura, área, perímetro, hipotenusa e catetos
    public double base, lado2, lado3, area, perimetro, altura, hipotenusa, catetoMaior, catetoMenor;

    // Instancia o Scanner para capturar entradas do usuário
    Scanner scanner = new Scanner(System.in);

    // Método para cadastrar os lados e a altura do triângulo
    public boolean cadastrarTriangulo() {
        System.out.println("========== Cadastro de Triângulo ==========");
        System.out.print("Informe a base: ");
        base = scanner.nextDouble(); // Captura o valor da base
        System.out.print("Informe o lado 2: ");
        lado2 = scanner.nextDouble(); // Captura o valor do lado 2
        System.out.print("Informe o lado 3: ");
        lado3 = scanner.nextDouble(); // Captura o valor do lado 3
        System.out.print("Informe a altura: ");
        altura = scanner.nextDouble(); // Captura o valor da altura

        System.out.println("Triângulo cadastrado com sucesso!");
        System.out.println("==================================");
        return true; // Retorna true indicando que o cadastro foi realizado
    }

    // Método para calcular a área do triângulo
    public void calcularArea() {
        System.out.println("========== Cálculo da Área ==========");
        area = (base * altura) / 2; // Fórmula da área: (base * altura) / 2
        System.out.println("A área do triângulo é: " + area);
        System.out.println("=====================================");
    }

    // Método para calcular o perímetro do triângulo
    public void calcularPerimetro() {
        System.out.println("========== Cálculo do Perímetro ==========");
        perimetro = base + lado2 + lado3; // Fórmula do perímetro: soma dos três lados
        System.out.println("O perímetro do triângulo é: " + perimetro);
        System.out.println("==========================================");
    }

    // Método para identificar o tipo do triângulo (Equilátero, Escaleno ou Isósceles)
    public void definirTipo() {
        System.out.println("========== Definição do Tipo ==========");
        if (base == lado2 && base == lado3) { // Verifica se todos os lados são iguais (Equilátero)
            System.out.println("O triângulo é Equilátero.");
        } else if (base != lado2 && base != lado3 && lado2 != lado3) { // Verifica se todos os lados são diferentes (Escaleno)
            System.out.println("O triângulo é Escaleno.");
        } else { // Caso contrário, dois lados iguais e um diferente (Isósceles)
            System.out.println("O triângulo é Isósceles.");
        }
        System.out.println("========================================");
    }

    // Método para identificar os catetos (maior e menor) e a hipotenusa
    public void definirCatetoHipotenusa() {
        if (base > lado2 && base > lado3) { // Verifica se a base é a hipotenusa
            hipotenusa = base;
            if (lado2 > lado3) {
                catetoMaior = lado2;
                catetoMenor = lado3;
            } else {
                catetoMaior = lado3;
                catetoMenor = lado2;
            }
        } else if (lado2 > base && lado2 > lado3) { // Verifica se o lado 2 é a hipotenusa
            hipotenusa = lado2;
            if (base > lado3) {
                catetoMaior = base;
                catetoMenor = lado3;
            } else {
                catetoMaior = lado3;
                catetoMenor = base;
            }
        } else { // Caso contrário, o lado 3 é a hipotenusa
            hipotenusa = lado3;
            if (base > lado2) {
                catetoMaior = base;
                catetoMenor = lado2;
            } else {
                catetoMaior = lado2;
                catetoMenor = base;
            }
        }
    }

    // Método para verificar se o triângulo é retângulo
    public void verificarSeRetangulo() {
        definirCatetoHipotenusa(); // Define os catetos e a hipotenusa
        System.out.println("========== Verificação de Triângulo Retângulo ==========");
        if ((catetoMenor * catetoMenor) + (catetoMaior * catetoMaior) == (hipotenusa * hipotenusa)) {
            System.out.println("O triângulo é Retângulo.");
        } else {
            System.out.println("O triângulo nao é Retângulo.");
        }
        System.out.println("========================================================");
    }

    // Método que verifica se o triângulo faz parte do padrão 3, 4, 5
    public void verificar345() {
        definirCatetoHipotenusa(); // Define os catetos e a hipotenusa
        System.out.println("========== Verificação do Padrão '3, 4, 5' ==========");
        if (catetoMenor * 4 == catetoMaior * 3 && catetoMenor * 5 == hipotenusa * 3) {
            System.out.println("O triângulo segue o padrão '3, 4, 5'.");
        } else {
            System.out.println("O triângulo nao segue o padrão '3, 4, 5'.");
        }
        System.out.println("=====================================================");
    }
}