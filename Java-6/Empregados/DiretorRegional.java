public class DiretorRegional extends Empregados{
	private int lucroMensal = 0;

	public DiretorRegional(String nome, int id){
		super(nome, id);
	}

	public int getLucroMensal(){
		return lucroMensal;
	}
	public void setLucroMensal(int lucroMensal){
		this.lucroMensal = lucroMensal;
	}

	@Override
	public double salario(){
		return super.salario() * 2.0 + 0.1 * getLucroMensal();
	}		

	public String toString(){
		return super.toString() + " Lucro Mensal " + lucroMensal + ".";
	}
}