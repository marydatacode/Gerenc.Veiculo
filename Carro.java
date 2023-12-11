// classe que representa um carro e implementa a interface veiculo 
public class Carro implements Veiculo {
    private String marca; // marca do carro
    private String modelo; // modelo do carro
    private double valor; // valor do carro

    // construto que inicializa os atributos
    public Carro(String marca, String modelo, double valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.valor = valor;
    }

    // implementação do metodo da interface para obter a marca do carro
    public String getMarca() {
        return marca;
    }

    // implementação do metodo da interface para obter o modelo do carro
    public String getModelo() {
        return modelo;
    }

    // implementação do metodo da interface para calcular o imposto do carro
    public double calcularImposto() {
        // Logica de calculo de imposto para carros
        return valor * 0.05;
    }
}
