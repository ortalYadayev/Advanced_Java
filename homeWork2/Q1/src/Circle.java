
public class Circle extends Ellipse {

      public Circle(double r){
    	  super(r,r);
      }
      public double area() {
    	  return super.area();
      }
      public double perimeter() {
    	  return super.perimeter();
      }
  	public void show() {
		System.out.println("Shape type: 2D");
		System.out.println("Name shape: circle");
		System.out.println("Characteristics: radius="+rad1);
	}
	public boolean equals(Shape s) {
		if(s instanceof Circle) {
			if(rad1==((Circle)s).getRad1())
				return true;
		}
		return false;
	} 	
}
