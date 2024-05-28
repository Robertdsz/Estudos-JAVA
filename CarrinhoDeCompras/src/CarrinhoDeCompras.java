import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Item> listaItens;

	public CarrinhoDeCompras() {
		this.listaItens = new ArrayList<>();
	}

	public List<Item> getListaItens() {
		return listaItens;
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		Item item = new Item(nome, preco, quantidade);
		this.listaItens.add(item);
	}
	
	public void removerItem(String nome) {
		List<Item> itensParaRemover = new ArrayList<>();
		if(!listaItens.isEmpty()) {
			for(Item i : listaItens) {
				if(i.getNome().equalsIgnoreCase(nome)) {
					itensParaRemover.add(i);
				}
			}
			listaItens.removeAll(itensParaRemover);
		} else {
			System.out.println("A lista está vazia!");
		}
	}
	
	public double calcularPreco() {
		double somaTotal = 0.0;
		for(Item i : listaItens) {
			somaTotal += i.getPreco() * i.getQuantidade();
		}
		return somaTotal;
	}
	
	public void exibirItens() {
		if(!listaItens.isEmpty()) {
			System.out.println(this.listaItens);
		} else {
			System.out.println("A lista está vazia!");
		}
	}

	public String toString() {
		return "Item: " + listaItens;
	}
}