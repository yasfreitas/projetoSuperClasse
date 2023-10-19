package funcionario;


public class Principal {

	public static void main(String[] args) {
		
		Jornada jornada = new Jornada(232, "alberto", "15 99342-1967", 38092, "rua maravilhosa");
		System.out.println("--------SALARIO JORNADA------");
		System.out.println(jornada.calculaSalario(8, 100));
		
		Horista horista = new Horista(234, "ana", "15 99243-5324", 4017, "rua cidade grande");
		System.out.println("------SALARIO HORISTA--------");
		System.out.println(horista.calculaSalario(5, 1000));
		
		PessoaJuridica pessoa = new PessoaJuridica(384, "livia", "15 99247-8293", 44211, "rua alegria");
		System.out.println("----SALARIO PESSOA JURIDICA-----");
		System.out.println(pessoa.calculaSalario(1200, 85));
		
	}

}
