public class Aluno {
	int numero;
	String nome;
	int anoMatricula;
	int anoNascimento;


	public Aluno(String nome, int numero, int anoNascimento, int anoMatricula){
		this.nome = nome;
		this.numero = numero;
		this.anoMatricula = anoMatricula;
		this.anoNascimento = anoNascimento;
	}
	public int getNumber(){
		return numero;
	}
	public String getName(){
		return nome;
	}
	public int getAnoMatricula(){
		return anoMatricula;
	}
	public int getAnoNascimento(){
		return anoNascimento;
	}
}