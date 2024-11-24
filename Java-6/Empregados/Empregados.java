public class Empregados{
	private int id;
	private String nome;
	private static final double SALARIO_BASE = 800.0;

	public Empregados(String nome, int id){
		this.id = id;
		this.nome = nome;
	}

	public double salario(){
		return SALARIO_BASE;
	}	
	public String getNome(){
		return nome;
	}
	public int getId(){
		return id;
	}

	public String toString(){
		return nome + " (" + id + ") " + " - ganha " + salario() + " Euros";
	}
}