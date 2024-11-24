public class Gerente extends Empregados{
	private boolean objetivosAtingidos = false;
	
	public Gerente(String nome, int id){
		super(nome, id);
	}
	public boolean getObjetivosAtingidos(){
		return objetivosAtingidos;
	}
	public void setObjetivosAtingidos(){
		objetivosAtingidos = true;
	}
	public void resetObjetivosAtingidos(){
		objetivosAtingidos = false;
	}
	
	@Override
	public double salario(){
		return super.salario() + (objetivosAtingidos? 200.0: 0);
	}
}