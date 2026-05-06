package src;
import java.util.List;

public class main {
    public static void main(String[] args) {

        ContatoService service = new ContatoService();
        List<Contato> lista = service.listarContatos();

        service.adicionarContato(new Contato("Robert", "987654321", "robert@email.com"));
        service.adicionarContato(new Contato("Ana", "707070987", "ana@email.com"));

        for (Contato contato : lista){
            System.out.println(contato.getNome() + " - " + contato.getTelefone());
        }
    }
}