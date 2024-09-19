/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author Agatha
 */
class Moto extends Veiculo {
    private boolean temCareagem;

    public Moto(String nome, String modelo, int ano, boolean temCareagem) {
        super(nome, modelo, ano);
        this.temCareagem = temCareagem;
    }

    public void empinar() {
        if (velocidadeAtual >= 50) {
            System.out.println("A moto está empinando a " + velocidadeAtual + " km/h.");
        } else {
            System.out.println("A moto não pode empinar: aumente a velocidade para pelo menos 50 km/h.");
        }
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tem careagem: " + temCareagem);
    }
}