package InterfaceComputador;

public class Home implements Computador{
	
	@Override
	public void ligar() {
		System.out.println("Computador home está ligando.");
	}
	
	@Override
	public void reininciar() {
		System.out.println("Computador home está reininciando.");
	}
	
	@Override
	public void desligar() {
		System.out.println("Computador home está desligando.");
	}
	
	@Override
	public void carregandoSistema() {
		System.out.println("Computador está carregando o sistema.");
	}

}
