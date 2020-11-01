
public class Square extends Rectangle {
	
    public Square(double s){
   	 super(s,s);
   	 }
    
    public double area() {
    	return super.area();
    }
    public double perimeter() {
	return super.perimeter();	
	}
	public void show() {
		System.out.println("Shape type: 2D");
		System.out.println("Name shape: square");
		System.out.println("Characteristics: height "+height);
	}
  
	public boolean equals(Shape s) {
		if(s instanceof Square) {
			if(width==((Square)s).width)
				return true;
		}
		return false;
	} 	
}
