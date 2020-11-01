
public class Rational implements showable, Arithmetic,Cloneable {
	private int mone, mechane;
	
	public Rational(int mone,int mechane) {
		this.mone=mone;
		this.mechane=mechane;
	}
	
	public Rational() {	
		this(1,2);
	}
	
	public Rational(Rational r) {
		this.mechane=r.mechane;
		this.mone=r.mone;
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
			q1=(double)(mone)/(double)(mechane);
			q2=(double)(r.mone)/(double)(r.mechane);
			if(q1==q2)
				return true;
		}
		return false;
	}

	public void show() {	
		System.out.println(mone+"/"+mechane);
	}
	
	public Object add(Object o) {
		if(o instanceof Rational) {
			Rational r=(Rational) o;
			if(mechane==r.mechane) {
				return (new Rational(mone+r.mone,mechane));
			}
			int kmechane;
			kmechane=mechane*r.mechane;
			return (new Rational(mone*r.mechane+mechane*r.mone,kmechane));	
		}
		return null;
	}

	public Object sub(Object o) {
		if(o instanceof Rational) {
			Rational r=(Rational) o;
			if(mechane==r.mechane) {
				return (new Rational(mone-r.mone,mechane));
			}
			int kmechane;
			kmechane=mechane*r.mechane;
			return (new Rational(mone*r.mechane-mechane*r.mone,kmechane));	
		}
		return null;
	}

	public Object mul(Object o) {
		if(o instanceof Rational) {
			Rational r=(Rational) o;
			return (new Rational(mone*r.mone,mechane*r.mechane));
		}
		return null;
	}
	
	public Object div(Object o) {
		if(o instanceof Rational) {
			Rational r=(Rational) o;
			return new Rational(mone*r.mechane,mechane*r.mone);
		}
		return null;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	
}
