package br.com.fecaf.controller;

import br.com.fecaf.model.Circulo;
import br.com.fecaf.model.Retangulo;
import br.com.fecaf.model.Triangulo;
import java.util.Scanner;

// Classe Menu que gerencia a interação com o usuário
public class Menu {

    // Instancia o Scanner para capturar entradas do usuário
    Scanner scanner = new Scanner(System.in);

    // Método principal que executa o menu
    public void executarMenu() {
        boolean exit = false; // Variável de controle para encerrar o menu principal

        // Loop principal do menu
        while (!exit) {
            // Exibe as opções do menu principal
            System.out.println("/********************/");
            System.out.println("       Geometria      ");
            System.out.println("/********************/");
            System.out.println("/* 1 - Circulo      */");
            System.out.println("/* 2 - Retângulo    */");
            System.out.println("/* 3 - Triângulo    */");
            System.out.println("/* 4 - Encerrar     */");
            System.out.println("/********************/");

            // Solicita ao usuário que informe a opção desejada
            System.out.print("Informe a opção desejada: ");
            int optionUser = scanner.nextInt(); // Captura a opção escolhida pelo usuário
            System.out.println("");

            // Switch para tratar a opção escolhida pelo usuário
            switch (optionUser) {
                case 1: // Caso 1: Menu para Círculo
                    boolean exitCirculo = false; // Variável de controle para encerrar o menu de círculo
                    Circulo circulo = new Circulo(); // Instancia um objeto da classe Circulo
                    boolean validarCirculo = false; // Variável para verificar se o círculo foi cadastrado

                    // Loop do menu de círculo
                    while (!exitCirculo) {
                        // Exibe as opções do menu de círculo
                        System.out.println("/****     Circulo     *****/");
                        System.out.println("/**************************/");
                        System.out.println("/* 1 - Cadastrar Círculo  */");
                        System.out.println("/* 2 - Calcular Área      */");
                        System.out.println("/* 3 - Calcular Perímetro */");
                        System.out.println("/* 4 - Sair               */");
                        System.out.println("/**************************/");

                        // Solicita ao usuário que informe a opção desejada
                        System.out.print("Informe a opção desejada: ");
                        int optionCirculo = scanner.nextInt(); // Captura a opção escolhida pelo usuário
                        System.out.println("");

                        // Switch para tratar a opção escolhida no menu de círculo
                        switch (optionCirculo) {
                            case 1: // Cadastrar o círculo
                                validarCirculo = circulo.cadastrarCirculo(); // Executa o método para cadastrar o círculo
                                break;
                            case 2: // Calcular a área do círculo
                                if (validarCirculo) { // Verifica se o círculo foi cadastrado
                                    circulo.calculcarArea(); // Calcula a área
                                } else {
                                    System.out.println("Cadastre um Círculo primeiro!");
                                }
                                break;
                            case 3: // Calcular o perímetro do círculo
                                if (validarCirculo) {
                                    circulo.calcularPerimetro(); // Calcula o perímetro
                                } else {
                                    System.out.println("Cadastre um Círculo primeiro!");
                                }
                                break;
                            case 4: // Sair do menu de círculo
                                System.out.println("Saindo do menu de Círculo...");
                                exitCirculo = true; // Encerra o loop do menu de círculo
                                break;
                            default: // Opção inválida
                                System.out.println("Escolha uma opção válida!");
                        }
                    }
                    break;

                case 2: // Caso 2: Menu para Retângulo
                    boolean exitRetangulo = false; // Variável de controle para encerrar o menu de retângulo
                    Retangulo retangulo = new Retangulo(); // Instancia um objeto da classe Retangulo
                    boolean validaRetangulo = false; // Variável para verificar se o retângulo foi cadastrado

                    // Loop do menu de retângulo
                    while (!exitRetangulo) {
                        // Exibe as opções do menu de retângulo
                        System.out.println("/****     Retângulo     ********/");
                        System.out.println("/*******************************/");
                        System.out.println("/* 1 - Cadastrar Retângulo     */");
                        System.out.println("/* 2 - Calcular Área           */");
                        System.out.println("/* 3 - Calcular Perímetro      */");
                        System.out.println("/* 4 - Verificar se é Quadrado */");
                        System.out.println("/* 5 - Sair                    */");
                        System.out.println("/*******************************/");

                        // Solicita ao usuário que informe a opção desejada
                        System.out.print("Informe a opção desejada: ");
                        int optionRetangulo = scanner.nextInt(); // Captura a opção escolhida pelo usuário
                        System.out.println("");

                        // Switch para tratar a opção escolhida no menu de retângulo
                        switch (optionRetangulo) {
                            case 1: // Cadastrar o retângulo
                                validaRetangulo = retangulo.cadastrarRetangulo(); // Executa o método para cadastrar o retângulo
                                break;
                            case 2: // Calcular a área do retângulo
                                if (validaRetangulo) { // Verifica se o retângulo foi cadastrado
                                    retangulo.calcularArea(); // Calcula a área
                                } else {
                                    System.out.println("Cadastre um Retângulo primeiro!");
                                }
                                break;
                            case 3: // Calcular o perímetro do retângulo
                                if (validaRetangulo) {
                                    retangulo.calcularPerimetro(); // Calcula o perímetro
                                } else {
                                    System.out.println("Cadastre um Retângulo primeiro!");
                                }
                                break;
                            case 4: // Verificar se o retângulo é um quadrado
                                if (validaRetangulo) {
                                    retangulo.verificarSeQuadrado(); // Verifica se é um quadrado
                                } else {
                                    System.out.println("Cadastre um Retângulo primeiro!");
                                }
                                break;
                            case 5: // Sair do menu de retângulo
                                System.out.println("Saindo do menu de Retângulo...");
                                exitRetangulo = true; // Encerra o loop do menu de retângulo
                                break;
                            default: // Opção inválida
                                System.out.println("Escolha uma opção válida!");
                        }
                    }
                    break;

                case 3: // Caso 3: Menu para Triângulo
                    boolean exitTriangulo = false; // Variável de controle para encerrar o menu de triângulo
                    Triangulo triangulo = new Triangulo(); // Instancia um objeto da classe Triângulo
                    boolean validarTriangulo = false; // Variável para verificar se o triângulo foi cadastrado

                    // Loop do menu de triângulo
                    while (!exitTriangulo) {
                        // Exibe as opções do menu de triângulo
                        System.out.println("/****************     Triângulo     *****************/");
                        System.out.println("/****************************************************/");
                        System.out.println("/* 1 - Cadastrar Triângulo                          */");
                        System.out.println("/* 2 - Calcular Área                                */");
                        System.out.println("/* 3 - Calcular Perímetro                           */");
                        System.out.println("/* 4 - Definir o tipo do Triângulo                  */");
                        System.out.println("/* 5 - Verificar se o Triângulo é Retângulo         */");
                        System.out.println("/* 6 - Verificar se o Triângulo é do tipo '3, 4, 5' */");
                        System.out.println("/* 7 - Sair                                         */");
                        System.out.println("/****************************************************/");

                        // Solicita ao usuário que informe a opção desejada
                        System.out.print("Informe a opção desejada: ");
                        int optionTriangulo = scanner.nextInt(); // Captura a opção escolhida pelo usuário
                        System.out.println("");

                        // Switch para tratar a opção escolhida no menu de triângulo
                        switch (optionTriangulo) {
                            case 1: // Cadastrar o triângulo
                                validarTriangulo = triangulo.cadastrarTriangulo(); // Executa o método para cadastrar o triângulo
                                break;
                            case 2: // Calcular a área do triângulo
                                if (validarTriangulo) { // Verifica se o triângulo foi cadastrado
                                    triangulo.calcularArea(); // Calcula a área
                                } else {
                                    System.out.println("Cadastre um Triângulo primeiro!");
                                }
                                break;
                            case 3: // Calcular o perímetro do triângulo
                                if (validarTriangulo) {
                                    triangulo.calcularPerimetro(); // Calcula o perímetro
                                } else {
                                    System.out.println("Cadastre um Triângulo primeiro!");
                                }
                                break;
                            case 4: // Definir o tipo do triângulo
                                if (validarTriangulo) {
                                    triangulo.definirTipo(); // Define o tipo do triângulo
                                } else {
                                    System.out.println("Cadastre um Triângulo primeiro!");
                                }
                                break;
                            case 5: // Verificar se o triângulo é retângulo
                                if (validarTriangulo) {
                                    triangulo.verificarSeRetangulo(); // Verifica se o triângulo é retângulo
                                } else {
                                    System.out.println("Cadastre um Triângulo primeiro!");
                                }
                                break;
                            case 6: // Verificar se o triângulo segue o padrão '3, 4, 5'
                                if (validarTriangulo) {
                                    triangulo.verificar345(); // Verifica se o triângulo segue o padrão '3, 4, 5'
                                } else {
                                    System.out.println("Cadastre um Triângulo primeiro!");
                                }
                                break;
                            case 7: // Sair do menu de triângulo
                                System.out.println("Saindo do menu de Triângulo...");
                                exitTriangulo = true; // Encerra o loop do menu de triângulo
                                break;
                            default: // Opção inválida
                                System.out.println("Escolha uma opção válida!");
                        }
                    }
                    break;

                case 4: // Caso 4: Encerrar o programa
                    System.out.println("Encerrando o programa...");
                    exit = true; // Encerra o loop principal
                    break;

                default: // Opção inválida no menu principal
                    System.out.println("Escolha uma opção válida!");
            }
        }
    }
}