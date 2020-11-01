
public class DrawingBoard {
	
	Shape[] shapes;
	int place;
	
	public DrawingBoard(int k) {
		shapes=new Shape[k];
		place=0;
	}
	
	public Shape[] isFull(Shape[] s) {
		if(place!=s.length) {
			return s;
		}
		double x=s.length*1.5;
		if(s.length%2==1) x++;
		Shape[] temp=new Shape[(int)x];
		for(int i =0; i<place;i++) {
			temp[i]=shapes[i];
		}
		return temp;
	}
	public void add(Shape...sha) {	
		for(int i=0; i<sha.length;i++) {
			shapes=isFull(shapes);
			shapes[place++]=(Shape)sha[i];
		}
	}
	public void showAll() {
		for(int i=0;i<place;i++) {
			shapes[i].show();
		}
	}
	public Shape getMax() {
		Shape max=shapes[0];
		for(int i=1;i<place-1;i++) {
			if(max.compare(shapes[i])==1) {
				max=shapes[i];
			}
		}
		return max;
	}
	public Shape3D getMax3DV1() {
		Shape3D max=null;
		int num=0;
		for(int i=0;i<place;i++) {
			if(shapes[i] instanceof Shape3D) {
				max=(Shape3D)shapes[i];
				num=i;
				break;
			}
		}
		if(max==null) return null;
		for(int i=num+1;i<place;i++) {
			if(shapes[i] instanceof Shape3D) {
				if(max.maxVolume((Shape3D)shapes[i])!=1)
					max=(Shape3D)shapes[i];
			}
		}
		return max;
	}
	public Class[] getTypes() {
		Class[] classes=new Class[place];
		for(int i=0; i<place;i++) {
			classes[i]=shapes[i].getClass();
		}
		return classes;
	}
	
}
