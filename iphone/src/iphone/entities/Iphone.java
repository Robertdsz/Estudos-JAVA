package iphone.entities;

import iphone.util.aparelho_telefonico.AparelhoTelefonico;
import iphone.util.navegador_internet.NavegadorInternet;
import iphone.util.reprodutor_musical.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

	public void exibirPagina() {
		System.out.println("EXIBINDO PÁGINA");
	}

	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO NOVA PÁGINA");
	}

	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PÁGINA");
	}

	public void ligar() {
		System.out.println("LIGANDO");
	}

	public void atender() {
		System.out.println("ATENDENDO CHAMADA");
	}

	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ");
	}

	public void tocarMusica() {
		System.out.println("TOCANDO MÚSICA");
	}

	public void pausarMusica() {
		System.out.println("PAUSANDO MÚSICA");
	}

	public void selecionarMusica() {
		System.out.println("SELECIONANDO MÚSICA");
	}
	
}
