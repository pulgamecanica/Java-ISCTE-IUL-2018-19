public class Aluno{
	int numero;
	String nome;

	public Aluno(String nome, int numero){
		this.nome = nome;
		this.numero = numero;
	}
	public Aluno (String line){
		String[] array = line.split(" ");
		nome = array[1];
		numero = Integer.parseInt(array[0]);
	}
	public int getNumber(){
		return numero;
	}
	public String getName(){
		return nome;
	}
	public String toString(){
		return "Nome: " + nome + " Numero: " + numero;
	}
}