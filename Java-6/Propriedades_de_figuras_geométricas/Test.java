import java.util.*;
public class Test{

	public static void main(String[] args){
		Canvas c = new Canvas();
		List<AbstractFigure> figures = new ArrayList<>();
		AbstractFigure c1 = new Circle(1,1,1);
		figures.add(c1);
		figures.add(new Rectangle(1,1,1,1));
		figures.add(new Square(2,2,2));
		for(AbstractFigure x: figures){
			c.addFigure(x);
			System.out.println(x);
		}
		System.out.println("************************************************Canvas*******************************************");
		System.out.println(c.getFigures());
		System.out.println("***********************************************Sum Areas*****************************************");
		System.out.println("Sum Of All Areas: " + c.sumAllAreas());
		System.out.println("************************************************REMOVE*******************************************");
		c.removeBiggestFigure();
		System.out.println(c.getFigures());
		System.out.println("****************************************************************************************");



	}


}