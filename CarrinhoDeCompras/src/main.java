
public class main {

	public static void main(String[] args) {
		CarrinhoDeCompras listaItens = new CarrinhoDeCompras();
		
		listaItens.adicionarItem("TV", 1000, 2);
		listaItens.adicionarItem("iPhone", 4000, 2);
		
		listaItens.removerItem("TV");
		
		
		
		System.out.println("Valor total do carrinho de compras R$: "+ listaItens.calcularPreco());
		System.out.println();
		System.out.println("Lista de Itens");
		System.out.println();
		listaItens.exibirItens();
	}

}
