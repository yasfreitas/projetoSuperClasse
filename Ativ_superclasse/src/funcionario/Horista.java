package funcionario;

public class Horista extends Funcionario{

	public Horista(long id, String nome, String telefone, int matricula, String endereco) {
		super(id, nome, telefone, matricula, endereco);
	}
	
	@Override
	public double calculaSalario(double valorHora, double quantHoras) {
		return valorHora * quantHoras;
	}
	

}
