/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author Agatha
 */
class Carro extends Veiculo {
    private int portas;

    public Carro(String nome, String modelo, int ano, int portas) {
        super(nome, modelo, ano);
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }

    public void abrirPortaMalas() {
        System.out.println("Abrindo porta-malas do carro...");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Total de portas: " + portas);
    }
}
