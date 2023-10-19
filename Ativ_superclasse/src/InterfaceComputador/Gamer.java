package InterfaceComputador;

public class Gamer implements Computador{
	
	@Override
	public void ligar() {
		System.out.println("PC gamer está ligando.");
	}
	
	@Override
	public void reininciar() {
		System.out.println("PC gamer está reininciando.");
	}
	
	@Override
	public void desligar() {
		System.out.println("PC gamer está desligando.");
	}
	
	@Override
	public void carregandoSistema() {
		System.out.println("PC gamer está carregando o sistema.");
	}

}
