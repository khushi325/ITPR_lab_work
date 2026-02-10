package project1;
/*----- Interface for ThreeD Figure -------*/
interface ThreeDFigure
{
	//member variable
	float PI = 3.14f;

	//method for calculating curved surface area
	default void calculateCurvedSurfaceArea()
	{
		System.out.println("Curved Surface Area");
	}

	//method for calculating total surface area
	void calculateTotalSurfaceArea();

	//method for calculating Volume
	void calculateVolume();
}

/*----- Defining a class for Sphere ----*/
class Sphere implements ThreeDFigure
{
	float radius;

	//constructor
	public Sphere(float radius) 
	{
		this.radius = radius;
	}

	@Override
	public void calculateCurvedSurfaceArea() {
		double csa = 4 * ThreeDFigure.PI * radius * radius;
		System.out.println("Curved Surface Area of Sphere : "+csa+" sq. cm");
	}

	@Override
	public void calculateTotalSurfaceArea() {
		double tsa = 4 * ThreeDFigure.PI * radius * radius;
		System.out.println("Total Surface Area of Sphere : "+tsa+" sq. cm");		
	}

	@Override
	public void calculateVolume() {
		double volume = (4 * ThreeDFigure.PI * radius * radius * radius)/3;
		System.out.println("Volume of Sphere : "+volume+" cubic cm");		
	}
}

/*----- Defining a class for Hemisphere ----*/
class Hemisphere implements ThreeDFigure
{
	float radius;

	//constructor
	public Hemisphere(float radius)
	{
		this.radius = radius;
	}

	@Override
	public void calculateCurvedSurfaceArea() {
		double csa = 2 * ThreeDFigure.PI * radius * radius;
		System.out.println("Curved Surface Area of Hemisphere : "+csa+" sq. cm");
	}

	@Override
	public void calculateTotalSurfaceArea() {
		double tsa = 3 * ThreeDFigure.PI * radius * radius;
		System.out.println("Total Surface Area of Hemisphere : "+tsa+" sq. cm");
	}

	@Override
	public void calculateVolume() {
		double volume = (2 * ThreeDFigure.PI * radius * radius * radius)/3;
		System.out.println("Volume of Hemisphere : "+volume+" cubic cm");
	}
}

/*-------------------------------------------------*/
public class SphereInterfaceExample {

	public static void main(String[] args) 
	{
		System.out.println("------ Sphere ------");
		ThreeDFigure figure1 = new Sphere(10.0f);
		figure1.calculateCurvedSurfaceArea();
		figure1.calculateTotalSurfaceArea();
		figure1.calculateVolume();
		System.out.println("-------------------------------------------");

		System.out.println("------ Hemisphere ------");
		ThreeDFigure figure2 = new Hemisphere(10.0f);
		figure2.calculateCurvedSurfaceArea();
		figure2.calculateTotalSurfaceArea();
		figure2.calculateVolume();
	}
}
