package formsTesting;

public class Square extends Form {
	
	private double width;
	public Square(double x, double y, double width) {
		super(x, y);
		this.width = width;
	}
	

	public double getWidth() {
		return width;
	}



	public void setWidth(double width) {
		this.width = width;
	}



	public double calculateArea() {
		return this.width*this.width;
	}

	public double calculateCircumference() {
		return this.width*4;
	}
	
	public String toString() {
		return "Square (" + this.getX() + "|" + this.getY() + ") with width = " 
					+ this.getWidth();
	}
	

}
