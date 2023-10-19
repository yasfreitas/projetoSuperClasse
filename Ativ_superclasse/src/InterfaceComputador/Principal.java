package InterfaceComputador;

public class Principal {

	public static void main(String[] args) {


		Gamer gamer = new Gamer();
		System.out.println("-------PC GAMER---------");
		gamer.ligar();
		gamer.desligar();
		gamer.reininciar();
		gamer.carregandoSistema();
		
		Home home = new Home();
		System.out.println("--------PC HOME---------");
		home.ligar();
		home.reininciar();
		home.desligar();
		home.carregandoSistema();

	}

}
