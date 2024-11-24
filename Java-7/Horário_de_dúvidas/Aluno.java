import java.io.*;
import java.util.*;

public class Aluno{
	private String nome;
	private int numeroInscricoes;
	private boolean hasAnAppointment;

	public Aluno(String name, int numeroInscricoes){
		nome = name;
		this.numeroInscricoes = numeroInscricoes;
	}
	public String getName(){
		return nome;
	}
	public int getNumeroInscricoes(){
		return numeroInscricoes;
	}
	public boolean theAppointment(){
		return hasAnAppointment;
	}
	public void setMarcacao(){
		hasAnAppointment = true;
	}
		public void unSetMarcacao(){
		hasAnAppointment = false;
	}
	public String toString(){
		return "Aluno: " + nome + " (" + getNumeroInscricoes() + ")";
	}

}