
public class Point implements showable{
	int x,y;
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public int getX() {return x;}
	public int getY() {return y;}
	
	public boolean equals(Object o) {
		if(o instanceof Point) {
			Point p=(Point)o;
			if(x==p.getX()&& y==p.getY())
				return true;
		}
		return false;
	}
	public void show() {
		System.out.println("x="+x+",y="+y);
	}
}
