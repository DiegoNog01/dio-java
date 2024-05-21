package application;

public class Iphone implements ReprodutorMusical, AparelhoTelefônico, NavegadorInternet{

	public static void main(String[] args) {
		
		Iphone iphone = new Iphone();
		
		iphone.exibirPagina("https://localhost:8080");
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		
		iphone.ligar("32256542");
		iphone.atender();
		iphone.iniciarCorreioVoz();
		
		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica("Eminem - Mockingbird");

	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo página " + url);
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba...");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando pagina...");
		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando: " + numero);
		
	}

	@Override
	public void atender() {
		System.out.println("Ligação atendida...");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando Correio de Voz...");
		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando...");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando...");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Musica selecionada: " + musica);
		
	}

	
}
