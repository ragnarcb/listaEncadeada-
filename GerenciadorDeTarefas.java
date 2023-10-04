import java.util.Scanner;

public class GerenciadorDeTarefas {
    private Tarefa inicio;
    private Tarefa fim;

    public GerenciadorDeTarefas() {
        this.inicio = null;
        this.fim = null;
    }

    public void adicionarTarefa(String descricao, int codigo) {
        Tarefa novaTarefa = new Tarefa(descricao, codigo);
        if (inicio == null) {
            inicio = novaTarefa;
            fim = novaTarefa;
        } else {
            fim.setProxima(novaTarefa);
            fim = novaTarefa;
        }
    }

    public void removerTarefa() {
        if (inicio == null) {
            System.out.println("A lista de tarefas está vazia.");
        } else {
            System.out.println("Removida a tarefa: " + inicio.getNome());
            inicio = inicio.getProxima();
            if (inicio == null) {
                fim = null;
            }
        }
    }

    public void exibirTarefas() {
        if (inicio == null) {
            System.out.println("A lista de tarefas está vazia.");
        } else {
            System.out.println("Lista de Tarefas:");
            Tarefa atual = inicio;
            while (atual != null) {
                System.out.println("Código: " + atual.getCodigo() + ", Descrição: " + atual.getNome());
                atual = atual.getProxima();
            }
        }
    }

    public static void main(String[] args) {
        GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();
        Scanner scanner = new Scanner(System.in);

        ASCIIArt.printMenu();
        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar nova tarefa");
            System.out.println("2 - Remover tarefa");
            System.out.println("3 - Exibir lista de tarefas");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a descricao da tarefa: ");
                    String descricao = scanner.nextLine();
                    System.out.print("Digite o código da tarefa: ");
                    int codigo = scanner.nextInt();

                    gerenciador.adicionarTarefa(descricao, codigo);
                    break;
                case 2:
                    gerenciador.removerTarefa();
                    break;
                case 3:
                    gerenciador.exibirTarefas();
                    break;
                case 4:
                    System.out.println("Encerrando o programa.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
