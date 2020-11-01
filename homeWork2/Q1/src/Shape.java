
public abstract class Shape {
	
	public abstract double area();
	public abstract double perimeter();
	public abstract void show();	
	
	public int compare(Shape s) {
		if(area()>s.area()) return 1;
		if(area()<s.area()) return -1;
		return 0;
	}
	public abstract boolean equals(Shape s);
}
