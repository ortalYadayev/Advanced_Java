
public class Cube extends Shape3D {
	
    private double height;
   
    public double getHeight() {return height;}
	public Cube(double a){
		height=a;
	}
	public double area() { 
		return 6*Math.pow(height, 2);
	}

	public double volume() {
		return Math.pow(height, 3);
	}
	public void show() {
		System.out.println("Shape type: 3D");
		System.out.println("Name shape: cube");
		System.out.println("Characteristics: length="+height+" height "+height+" width="+ height);
	}
	
	public boolean equals(Shape s) {
		if(s instanceof Cube) {
			if(height==((Cube)s).getHeight())
				return true;
		}
		return false;
	}
	@Override
	public double perimeter() {
		return 0;
	} 
	
}
