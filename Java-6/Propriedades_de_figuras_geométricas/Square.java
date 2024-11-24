public class Square extends AbstractFigure {
	private int side;

	public Square(int x, int y, int side) {
		super(x, y);
		this.side = side;
	}
	public double getArea() {
		return side * side;
	}
	public double getPerimeter(){
		return (double)(side * 4);
	}

	public String toString(){
		return "Sqare, Area: " + getArea() + " and Perimeter: " + getPerimeter();
	}
}