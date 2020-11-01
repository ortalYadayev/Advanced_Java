
public abstract class Shape3D extends Shape {

	public abstract double area();
	public abstract double volume();
	public abstract void show();
	public abstract double perimeter();
	public abstract boolean equals(Shape s);
	
	public double maxVolume(Shape3D s) {
		if(volume()>s.volume()) return 1;
		if(volume()<s.volume()) return -1;
		return 0;
	}
}

