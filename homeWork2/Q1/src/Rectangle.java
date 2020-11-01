
public class Rectangle extends Shape {
    protected double width, height;
    
    public Rectangle(double w, double h){
    	width = w; height = h;
    }
    public double area() {
    	return width*height;
    }
    public double perimeter() {
		return width*2+height*2;
	}
	public void show() {
		System.out.println("Shape type: 2D");
		System.out.println("Name shape: rectangle");
		System.out.println("Characteristics: height "+height+" width="+ width);
	}
	
	public double getWidth () { return width;}
	public double getHeight () { return height;}
	
	public boolean equals(Shape s) {
		if(s instanceof Rectangle) {
			if(width==((Rectangle)s).width && height==((Rectangle)s).height)
				return true;
		}
		return false;
	} 	
}
