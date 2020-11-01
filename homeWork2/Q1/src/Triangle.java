
public class Triangle extends Rectangle {
    double c;
	public Triangle(double z1, double z2) {
		super(z1,z2);
	    c = (double)Math.sqrt(Math.pow(this.height, 2)+Math.pow(this.width,2));
	}
	
	public double area() {
	return super.area()/2;
	}
	public double perimeter() {
		return c + width + height;
	}
	public void show() {
		System.out.println("Shape type: 2D");
		System.out.println("Name shape: triangle");
		System.out.println("Characteristics: height="+height+" width="+ width);
	}
	public boolean equals(Shape s) {
		if(s instanceof Triangle) {
			if(width==((Triangle)s).width && height==((Rectangle)s).height)
				return true;
		}
		return false;
	} 
}
