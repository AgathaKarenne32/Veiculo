/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author Agatha
 */
import java.util.Scanner;

public class Veiculo {
    private String nome;
    private String modelo;
    private int ano;
    protected double velocidadeAtual = 0; // Alterado para protected para permitir acesso nas subclasses
    //definir velocidadeAtual como protected na classe veiculo permite que tanto a classe Carro quanto a classe Moto
    //que são subclasses de Veiculo, possam acessar e modificar esse atributo diretamente. 

    public Veiculo(String nome, String modelo, int ano) {
        this.nome = nome;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public void acelerar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
        System.out.print("Digite a velocidade que deseja alcançar: ");
        double velocidadeAlcancada = scanner.nextDouble();

        velocidadeAtual = velocidadeAlcancada;

        System.out.println("Acelerando... Velocidade Atual: " + velocidadeAtual + " km/h");
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        acelerar();
    }
}