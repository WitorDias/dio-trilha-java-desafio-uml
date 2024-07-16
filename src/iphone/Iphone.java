package iphone;

import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;
import funcionalidades.Telefonia;

public class Iphone implements ReprodutorMusical, NavegadorInternet, Telefonia {
	@Override
	public void aumentarVolumeMusica() {
		System.out.println("o volume da música aumentou");
	}

	@Override
	public void diminuirVolumeMusica() {
		System.out.println("o volume da música diminuiu");
	}

	@Override
	public void pausarMusica() {
		System.out.println("a música foi pausada");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("exibindo informações da música...");
	}

	@Override
	public void tocarMusica() {
		System.out.println("música tocando...");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("uma nova aba foi criada");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("página atualizada");
	}

	@Override
	public void exibirPagina() {
		System.out.println("exibindo página...");
	}

	@Override
	public void atender() {
		System.out.println("ligação atendida");
	}

	@Override
	public void iniciarCorreioDeVoz() {
		System.out.println("correio de voz iniciado");
	}

	@Override
	public void ligar() {

		System.out.println("ligando para alguém...");

	}
}
