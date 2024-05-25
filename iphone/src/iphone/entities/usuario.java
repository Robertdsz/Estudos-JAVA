package iphone.entities;

public class usuario {

	public static void main(String[] args) {
		
		Iphone iphone7 = new Iphone();
		
		System.out.println("ABRINDO SAFARI");
		iphone7.exibirPagina();
		iphone7.adicionarNovaAba();
		iphone7.atualizarPagina();
		System.out.println();
		
		System.out.println("ABRINDO TELEFONE");
		iphone7.ligar();
		iphone7.atender();
		iphone7.iniciarCorreioVoz();
		System.out.println();
		
		System.out.println("ABRINDO SPOTFY");
		iphone7.tocarMusica();
		iphone7.pausarMusica();
		iphone7.selecionarMusica();
	}

}
