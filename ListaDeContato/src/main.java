package src;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        ContatoService service = new ContatoService();
        List<Contato> lista = service.listarContatos();

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("=== Agenda de Contatos ===");
            System.out.println("[1] Adicionar");
            System.out.println("[2] Listar");
            System.out.println("[3] Buscar por nome");
            System.out.println("[4] Atualizar telefone");
            System.out.println("[5] Remover");
            System.out.println("[0] Sair");
            System.out.println("Escolha: ");

            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Nome: ");
                    String nome = sc.nextLine();
                    System.out.println("Telefone: ");
                    String telefone = sc.nextLine();
                    System.out.println("Email: ");
                    String email = sc.nextLine();
                    service.adicionarContato(new Contato(nome, telefone, email));
                    System.out.println("Contato adicionado com sucesso!");
                    break;
            }
        }
    }
}