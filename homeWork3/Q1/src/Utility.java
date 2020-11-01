
public class Utility {
	public static void showAll(showable[]  a) {
		for(int i=0; i<a.length;i++) {
			a[i].show();
		}
	}
	public static void showAll(Object[]  a) {
		for(int i=0; i<a.length;i++) {
			if(a[i] instanceof showable)
				((showable) a[i]).show();
			else System.out.println(a[i].toString());
		}
	} 
	public static boolean  search(Object[] a , Object o) {
		for(int i=0; i<a.length;i++) {
			if(a[i] instanceof Comparable && o instanceof Comparable) {
				if(((Comparable)a[i]).compareTo(o)==0) {
					return true;
				}
			}
			else {
				if(a[i].equals(o))
			 		return true;
				}
			
		}
		return false;
	}
	public static Object  max (Object[] a) {
		Object max=a[0];		
		if(!(max instanceof Comparable))
			return null;
		for(int i=1; i<a.length;i++) {
			if(a[i] instanceof Comparable) {
				if(((Comparable) a[i]).compareTo(max)>0) 
						max=a[i];
				}
				else return null;
			}
		return max;
		}	
}
