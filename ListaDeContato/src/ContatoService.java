package src;
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

    public List<Contato> listarContatos() {
        return contatos;
    }

    public List<Contato> buscarContatos(String nome){
        List<Contato> resultado = new ArrayList<>();

        for ( Contato contato : contatos ) {
            if (contato.getNome().contains(nome)) {
                resultado.add(contato);
            }
        }
        return resultado;
    }

    public void atualizarContato( int id, String telefone){
        for ( Contato contato : contatos ){
            if (contato.getId() == (id)){
              contato.setTelefone(telefone);
            }
        }
    }
}
