package entities;

public class Rectangle {

	public double width;
	public double height;

	public double Area() { //calculo da area
		return width * height;
	}

	public double Perimeter() { //calculo do perimetro
		return 2 * (width + height);
	}

	public double Diagonal() { //calculo da diagonal
		return Math.sqrt((width * width) + (height * height));
	}

}
