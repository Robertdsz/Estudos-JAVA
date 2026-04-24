import java.util.ArrayList;
import java.util.List;

public class ContatoService {
    List<Contato> contatos = new ArrayList<>();

    public void adicionarContato(Contato contato){
        contatos.add(contato);
    }

    public void removerContato(int id){
        contatos.removeIf(contato -> contato.getId() == id);
    }


}
