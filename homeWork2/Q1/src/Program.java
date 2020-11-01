
public class Program {

	public static void main(String[] args) {
		DrawingBoard d= new DrawingBoard(3);
		d.add(new Ellipse(3,5), new Square(5));
		Shape s= d.getMax();
		d.add(new Rectangle(3, 7),new Ball(4.5), new Cube (8));	for(int i=0; i<d.place;i++);
		d.showAll();
		System.out.println("the best area:"+s.getClass());
		Shape3D s3= d.getMax3DV1();
		System.out.println("the best volume:"+ s3.getClass());	
			
	}
}
