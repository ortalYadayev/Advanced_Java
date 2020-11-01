
public class Rational implements showable{
	private int mone, mechane;
	
	public Rational(int mone,int mechane) {
		this.mechane=mechane;
		this.mone=mone;
	}
	
	public Rational() {	
		this(1,2);
	}
	public String toString() {
		return mone+"/"+mechane;
	}
	public boolean equals(Object o) {
		if(o instanceof Rational) {
			Rational r=(Rational) o;
			if(mechane==r.mechane&&mone==r.mone)
				return true;
			double q1,q2;
			q1=(double)mone/(double)mechane;
			q2=(double)r.mone/(double)r.mechane;
			if(q1==q2)
				return true;
		}
		return false;
	}
	public void show() {
		System.out.println(mone+"/"+mechane);
	}
}
