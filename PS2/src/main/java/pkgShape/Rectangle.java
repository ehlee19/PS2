package pkgShape;

public class Rectangle {
	
	private int Width;
	private int Length;
	public Rectangle(int width, int length) {
		super();
		setWidth(width);
		setLength(length);
	}
	public int getLength() {
		return Length;
	}
	public void setLength(int length) {
		Length = length;
	}
	public int getWidth() {
		return Width;
	}
	public void setWidth(int width) {
		Width = width;
	}
	
	public double area() {
		return getWidth() * getLength();
	
	}
	public double perimeter() {
		return (2 * getWidth()) + (2 * getLength());
	}

}
