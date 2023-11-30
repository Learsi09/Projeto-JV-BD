import java.util.ArrayList;
import java.util.Scanner;

public class AppAdocao {
    private static ArrayList<Crianca> listaCriancas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean rodando = true;

        while (rodando) {
            System.out.println("Bem-vindo ao App de Adoção de Crianças!");
            System.out.println("1. Adicionar criança para adoção");
            System.out.println("2. Visualizar crianças disponíveis");
            System.out.println("3. Adotar criança");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome da criança:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite a idade da criança:");
                    int idade = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer do scanner

                    Crianca novaCrianca = new Crianca(nome, idade);
                    listaCriancas.add(novaCrianca);
                    System.out.println("Criança adicionada para adoção com sucesso!");
                    break;
                case 2:
                    System.out.println("Crianças disponíveis para adoção:");
                    exibirCriancasDisponiveis();
                    break;
                case 3:
                    adotarCrianca();
                    break;
                case 4:
                    rodando = false;
                    System.out.println("Saindo do aplicativo de adoção de crianças.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
        scanner.close();
    }

    private static void exibirCriancasDisponiveis() {
        for (Crianca crianca : listaCriancas) {
            if (!crianca.estaAdotada()) {
                System.out.println("Nome: " + crianca.getNome() + ", Idade: " + crianca.getIdade());
            }
        }
    }

    private static void adotarCrianca() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome da criança que deseja adotar:");
        String nomeAdotar = scanner.nextLine();

        for (Crianca crianca : listaCriancas) {
            if (crianca.getNome().equalsIgnoreCase(nomeAdotar) && !crianca.estaAdotada()) {
                crianca.adotar();
                System.out.println("Parabéns! Você adotou a criança " + crianca.getNome() + "!");
                return;
            }
        }
        System.out.println("Criança não encontrada ou já adotada.");
    }
}
