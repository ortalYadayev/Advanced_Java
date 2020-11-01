
public class Ellipse extends Shape{
    protected double rad1,rad2;
    
    public Ellipse(double r,double r2){
  	   rad1 = r; rad2=r2;
    }
    public double area() {
    	return Math.PI*rad1*rad2;
    }
    public double perimeter() {
    	return Math.PI*(rad1+rad2);
    }
  	public void show() {
		System.out.println("Shape type: 2D");
		System.out.println("Name shape: ellipse");
		System.out.println("Characteristics: radius="+rad1+",radius2="+rad2);
	}
  	
  	public double getRad1() {return rad1;}
  	public double getRad2() {return rad2;}
  	
	public boolean equals(Shape s) {
		if(s instanceof Ellipse ) {
			if(rad1==((Ellipse)s).getRad1()&& rad2==((Ellipse)s).getRad2())
				return true;
		}
		return false;
	} 	
}
