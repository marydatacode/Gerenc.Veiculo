// classe principal que interage com o usuario e controla o fluxo do programa
import java.util.Scanner;

public class GerenciamentoVeiculosApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorVeiculos gerenciador = new GerenciadorVeiculos();

        // Loop principal do programa
        while (true) {
            exibirMenu();
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarCarro(scanner, gerenciador);
                    break;
                case 2:
                    adicionarMoto(scanner, gerenciador);
                    break;
                case 3:
                    listarVeiculos(gerenciador);
                    break;
                case 4:
                    calcularImpostoAnual(gerenciador);
                    break;
                case 0:
                    System.out.println("Encerrando o programa. Até logo!");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente Novamente.");
            }
        }
    }

    // metodo para exibir o menu opções
    private static void exibirMenu() {
        System.out.println("\n===== Gerenciamento de Veículos =====");
        System.out.println("1. Adicionar Carro");
        System.out.println("2. Adicionar Moto");
        System.out.println("3. Listar Veículos");
        System.out.println("4. Calcular Imposto Anual");
        System.out.println("0. Sair");
        System.out.println("Escolha uma opção: "); 
    }

    // metodo para add um carro a lista de veiuclos
    private static void adicionarCarro(Scanner scanner, GerenciadorVeiculos gerenciador) {
        System.out.println("Digite a marca do carro: ");
        String marca = scanner.next();
        System.out.println("Digite o modelo do carro: ");
        String modelo = scanner.next();
        System.out.println("Digite o valor do carro: ");
        double valor = scanner.nextDouble();
        Carro carro = new Carro(marca, modelo, valor);
        gerenciador.adicionarVeiculo(carro);
        System.out.println("Carro adicionado com sucesso!");
    }

    // metodo para add uma moto a lista de veiculos
    private static void adicionarMoto(Scanner scanner, GerenciadorVeiculos gerenciador) {
        System.out.print("Digite a marca da moto: ");
        String marca = scanner.next();
        System.out.print("Digite o modelo da moto: ");
        String modelo = scanner.next();
        System.out.print("Digite a cilindrada: ");
        double cilindrada = scanner.nextDouble();
        Moto moto = new Moto(marca, modelo, cilindrada);
        gerenciador.adicionarVeiculo(moto);
        System.out.println("Moto adicionada com sucesso!");
    }

    // metodo para listar os veiculos
    private static void listarVeiculos(GerenciadorVeiculos gerenciador) {
        gerenciador.listarVeiculos();
    }

    // metodo para calcular e exibir o imposto anual de cada veiculo
    private static void calcularImpostoAnual(GerenciadorVeiculos gerenciador) {
        gerenciador.calcularImpostoAnual();
    }
}
