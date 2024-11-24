import java.util.*;

public class Canvas{
	private List<AbstractFigure> figures = new ArrayList<>();

	public Canvas(){

	}
	public List<AbstractFigure> getFigures(){
		return figures; 
	}
	public void addFigure(AbstractFigure figure){
		figures.add(figure);
	}
	public void removeFigure(int index){
		figures.remove(index);
	}
	public void removeBiggestFigure(){
		if(figures.size() == 0)
			new IllegalArgumentException("No figures inside");
		double bigAreas = 0.0;
		int result = 0;
		int counter = 0;
		for(AbstractFigure x: figures){
			if(x.getArea() > bigAreas){
				result = counter;
			}
			counter++;
		}
		removeFigure(result);
	}
	public double sumAllAreas(){
		double result = 0.0;
		for(AbstractFigure x: figures){
			result += x.getArea();
		}
		return result;
	}
}