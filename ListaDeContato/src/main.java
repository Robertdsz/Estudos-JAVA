package src;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        ContatoService service = new ContatoService();

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
            sc.nextLine();

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

                case 2:
                    List<Contato> lista = service.listarContatos();
                    for (Contato contato : lista){
                        System.out.println(contato.getNome() + " | " + contato.getTelefone() + " | " + contato.getEmail());
                    }
                    break;

                case 3:
                    System.out.println("Digite o nome: ");
                    String nomeContato = sc.nextLine();
                    List<Contato> resultado = service.buscarContatos(nomeContato);
                    for (Contato contato : resultado){
                        System.out.println(contato.getNome() + " | " + contato.getTelefone() + " | " + contato.getEmail());
                    }
                    break;

                case 4:
                    List<Contato> contatos = service.listarContatos();
                    if ( contatos.isEmpty() ) {
                        System.out.println("Nenhum contato cadastrado!");
                        break;
                    }
                    for ( Contato contato : contatos ) {
                        System.out.printf("ID: " + contato.getId() + " | " + contato.getNome() + "\n");
                    }
                    System.out.println("Digite o ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite o novo telefone: ");
                    String novoTelefone = sc.nextLine();
                    service.atualizarContato(id, novoTelefone);
                    break;

                case 5:
                    List<Contato> contatosRemover = service.listarContatos();
                    if ( contatosRemover.isEmpty() ) {
                        System.out.println("Nenhum contato cadastrado!");
                        break;
                    }
                    for ( Contato contato : contatosRemover ) {
                        System.out.printf("ID: " + contato.getId() + " | " + contato.getNome() + "\n");
                    }
                    System.out.println("Digite o ID do contato a remover: ");
                    int apagarId = sc.nextInt();
                    sc.nextLine();
                    service.removerContato(apagarId);
                    break;
            }
        } while(opcao != 0);
    }
}
