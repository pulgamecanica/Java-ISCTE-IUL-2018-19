import java.util.*;

public class HorarioDuvidas{// implements WhoIsFirst{
	private PriorityQueue<Aluno> alunos = new PriorityQueue<>(new AlunoComparator());

	public HorarioDuvidas(){
		alunos = new PriorityQueue<>(new AlunoComparator());
	}

	public void maracacao(Aluno a){
		a.setMarcacao();
	}	
	
	public void chegada(Aluno a){
		alunos.offer(a);
	}
	public Aluno proximo(){
		Aluno a = alunos.poll();
		a.unSetMarcacao();
		return a;//TODO
	}
	public void getAlunos(){
		for(Aluno x: alunos)
			System.out.println(x);
	}
	public int size(){
		return alunos.size();
	}


	public static class AlunoComparator implements Comparator<Aluno>{
        public int compare(Aluno a1, Aluno a2) { 
        	if(a1.theAppointment())
        		return -1;
        	if(a2.theAppointment())
        		return 1;
        	if(a1.getNumeroInscricoes() < a2.getNumeroInscricoes())
        		return -1;
        	else if(a1.getNumeroInscricoes() > a2.getNumeroInscricoes())
            	return 1; 
       		else 
        		return 0;
        } 
    } 

	public static void main(String[] args){
		HorarioDuvidas hd = new HorarioDuvidas();
		Aluno a1 = new Aluno("Viriato", 5);
		hd.maracacao(a1);
		Aluno a2 = new Aluno("Claudio", 2);
		hd.maracacao(a2);
		Aluno a3 = new Aluno("Ciao", 2);
		//hd.maracacao(a3);
		Aluno a4 = new Aluno("Tito", 4);
		Aluno a5 = new Aluno("Fabio", 1);
		Aluno a6 = new Aluno("Tutalo", 1);
		Aluno a7 = new Aluno("ANA", 1);
		hd.maracacao(a7);
		Aluno a8 = new Aluno("PECA", 1);
		Aluno a9 = new Aluno("COCA", 1);
		hd.chegada(a3);
		hd.chegada(a4);
		hd.chegada(a2);
		hd.chegada(a5);
		hd.chegada(a6);
		hd.chegada(a1);
		hd.chegada(a7);
		hd.chegada(a8);
		hd.chegada(a9);
		while(hd.size() != 0)
			System.out.println(hd.proximo());

	}



}