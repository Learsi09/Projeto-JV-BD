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
                    Crianca novaCrianca = new Crianca();
                    novaCrianca.setAdotada(false);

                    System.out.println("Digite o ID da crianca:");
                    novaCrianca.setIdCrianca ( scanner.nextInt());

                    System.out.println("Digite o nome da criança:");
                    novaCrianca.setNome ( scanner.next());

                    System.out.println("Digite a idade da criança:");
                    novaCrianca.setIdade(scanner.nextInt());
                    scanner.nextLine(); // Consume the newline character

                    System.out.println("Digite a altura da criança em inteiro:");
                    novaCrianca.setAltura(scanner.nextInt());
                    scanner.nextLine(); // Consume the newline character


                    System.out.println("Digite a nacionalidade  da criança:");
                    novaCrianca.setNome ( scanner.nextLine());
                   // listaCriancas.add(novaCrianca);
                    CadastarCriancaDAO cadastrarcriancaDAO = new CadastarCriancaDAO();
                    cadastrarcriancaDAO.adiciona (novaCrianca);

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

    public static void exibirCriancasDisponiveis() {
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
