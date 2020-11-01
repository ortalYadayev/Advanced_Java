
public class Program {

	public static void main(String[] args) throws  CloneNotSupportedException {
		Rational r1= new Rational();
		Rational r2= new Rational(4,8);
		Rational r3= new Rational(2,3);
		Rational r4= new Rational(r1);
		Object o1;
		o1=r2.clone();
		System.out.println("the clone of r2="+o1.toString());	
		System.out.println(r2.equals(r3));
		System.out.println(r1.equals(r4));
		
		Object ar1=r1.add(r2);
		Object ar2=r1.sub(r3);
		Object ar3=r1.mul(r4);
		Object ar4=r2.div(r3);
		System.out.println("add="+ar1.toString());
		System.out.println("sub="+ar2.toString());
		System.out.println("mul="+ar3.toString());
		System.out.println("div="+ar4.toString());
		
		System.out.println("r1="+r1.toString());
		System.out.println("r2="+r2.toString());
		System.out.println("r3="+r3.toString());
		System.out.println("r4="+r4.toString());
		
		System.out.println("---------------");
		showable[] soso = new showable[] {r1,r2,r3};
		Utility.showAll(soso);
		Rational[] ratArr = new Rational[3];
		ratArr[0]=r1;
		ratArr[1]=r2;
		ratArr[2]=r3;
		System.out.println("----------");
		Utility.showAll(ratArr);
		System.out.println(Utility.search(ratArr, r3));
		String[] sosonew = new String[] {"11111","ortal","abcdefgz"};
		System.out.println(Utility.max(sosonew));
		
		
	}

}
