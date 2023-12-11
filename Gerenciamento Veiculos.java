// classe que gerencia a lista de veiculos e fornece operações relacionadas
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GerenciadorVeiculos {
    private List<Veiculo> veiculos; // Lista de veiculos

    // construtor que inicializa a lista de veiculos
    public GerenciadorVeiculos() {
        this.veiculos = new ArrayList<>();
    }

    // metodo para add um veiculo a lista
    public void adicionarVeiculo (Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    // metodo para listar os veiculos na console
    public void listarVeiculos() {
        System.out.println("\n===== Veículos Cadastrados =====");
        Iterator<Veiculo> iterator = veiculos.iterator();
        while (iterator.hasNext()) {
            Veiculo veiculo = iterator.next();
            System.out.println(veiculo.getMarca() + " " + veiculo.getModelo());
        }
    }

    // metodo para calcular e imprimir o imposto anual de cada veiculo
    public void calcularImpostoAnual() {
        System.out.println("\n===== Cálculo de Imposto Anual =====");
        Iterator<Veiculo> iterator = veiculos.iterator();
        while (iterator.hasNext()) {
            Veiculo veiculo = iterator.next();
            double imposto = veiculo.calcularImposto();
            System.out.println(veiculo.getMarca() + " " + veiculo.getModelo() + ": R$ " + imposto);
        }
    }
}
