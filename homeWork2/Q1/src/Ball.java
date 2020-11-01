
public class Ball extends Shape3D {

	private double rad1;
	public Ball(double r) {
		rad1=r;
	}
	public double volume() {  
		return Math.PI*Math.pow(rad1, 3)*(4/3);
	}
	public double area() { //שטח פנים 
		return Math.PI*4*Math.pow(rad1, 2);
	}
	public void show() {
		System.out.println("Shape type: 3D");
		System.out.println("Name shape: ball");
		System.out.println("Characteristics: radius="+rad1);
	}
	public double getRad1() {return rad1;}
	
	public boolean equals(Shape s) {
		if(s instanceof Ball) {
			if(rad1==((Ball)s).getRad1())
				return true;
		}
		return false;
	}
	public double perimeter() {
		return 0;
	}

}


