
public class Program {

	public static void main(String[] args) {
		Set s1=new Set(10,(Object)new Point(2,8),(Object)new Rational(5,6),(Object)new Rational(2,3),new Point(1,6));
		s1.addObj(new Rational(2,3));
		System.out.println(s1.toString());
		
		s1.reset();
		s1.forward();
		s1.forward();
		System.out.println(s1.getCurrent());
		s1.backward();
		System.out.println(s1.getCurrent());
		
		String sti="ortal";
		Set s2=new Set(10,sti,(Object)new Rational(2,3),(Object)new Point(2,8),(Object)new Point(3,8));
		System.out.println(s1.sub((Set)s2).toString());
		System.out.println(s2.mul((Set)s1).toString());
		System.out.println(s2.add((Set)s1).toString());
		System.out.println(s1.div((Set)s2).toString());
		System.out.println();
		
		
	}
}
