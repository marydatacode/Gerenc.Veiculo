// classe que representa uma moto e implementa a interface Veiculo
public class Moto implements Veiculo {
    private String marca; // Marca da moto
    private String modelo; // modelo da moto
    private double cilindrada; // cilindrada da moto

    // construtor que inicializa os atributos
    public Moto(String marca, String modelo, double cilindrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
    }

    // implementação do metodo da interface para obter a marca da moto
    public String getMarca() {
        return marca;
    }

    // implementação do metodo da interface para obter o modelo da moto
    public String getModelo() {
        return modelo;
    }    

    // implementação do metodo da interface para calcular o imposto da moto
    public double calcularImposto() {
        // logica de calculo de imposto para motos
        return cilindrada * 0.02;
    }
}
