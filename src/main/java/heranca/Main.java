/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author Amanda
 */
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Chevrolet", "Camaro SS", 2023, 4);
        Moto moto = new Moto("Honda", "CB750", 1971, true);

        System.out.println("Informações do Carro:");
        carro.exibirInformacoes();
        carro.abrirPortaMalas();

        System.out.println("\nInformações da Moto:");
        moto.exibirInformacoes();
        moto.empinar();
    }
}
