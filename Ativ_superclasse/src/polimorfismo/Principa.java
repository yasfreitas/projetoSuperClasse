package polimorfismo;

public class Principa {

	public static void main(String[] args) {
		
		Lobo lobo = new Lobo("Jacob","macho","selvagem");
		System.out.println("-----------LOBO-----------");
		System.out.println("Nome: "+ lobo.getNome());
		System.out.println("Sexo: "+ lobo.getSexo());
		System.out.println("Raça: "+ lobo.getRaca());
		lobo.emitirSom();
		
		Leao leao = new Leao("Simba","macho","selvagem");
		System.out.println("-----------LEAO-----------");
		System.out.println("Nome: "+ leao.getNome());
		System.out.println("Sexo: "+ leao.getSexo());
		System.out.println("Raça: "+ leao.getRaca());
		leao.emitirSom();
		
		Tigre tigre = new Tigre("Tigrão","macho","selvagem");
		System.out.println("----------TIGRE-----------");
		System.out.println("Nome: "+ tigre.getNome());
		System.out.println("Sexo: "+ tigre.getSexo());
		System.out.println("Raça: "+ tigre.getRaca());
		tigre.emitirSom();
		
		Cachorro cachorro = new Cachorro("Thor","macho","pastor alemão");
		System.out.println("----------CACHORRO----------");
		System.out.println("Nome: "+ cachorro.getNome());
		System.out.println("Sexo: "+ cachorro.getSexo());
		System.out.println("Raça: "+ cachorro.getRaca());
		cachorro.emitirSom();
		
		Gato gato = new Gato("Tigrão","macho","selvagem");
		System.out.println("-----------GATO-----------");
		System.out.println("Nome: "+ gato.getNome());
		System.out.println("Sexo: "+ gato.getSexo());
		System.out.println("Raça: "+ gato.getRaca());
		gato.emitirSom();
	}

}
