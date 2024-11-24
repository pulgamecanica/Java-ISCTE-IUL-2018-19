public class Circle extends AbstractFigure {
	private int x;
	private int y;
	private int radius;

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getPerimeter(){
		return Math.PI * radius * 2;	
	}

	public String toString(){
		return "Circle, Area: " + getArea() + " and Perimeter: " + getPerimeter();
	}
}