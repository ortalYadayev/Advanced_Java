
public class Program {

	public static void main(String[] args) throws EmptyListException, ListIndexOutOfBound {
		List l=new List("111");
		l.insertAtBack("me");
		l.insertAtFront("its");
		l.insertAtFront("ortal");
		System.out.println(l.toString());
		l.insertAtBack("and this the end");
		l.show();
		l.removeAt(3);
		l.showRev();
		System.out.println("------------------");
		l.removeFromBack();
		l.addAt("because", 0);
		l.addAt("i", 1);
		System.out.println(l.toString());
		l.addAt("work?", 5);
		
		System.out.println("this array of list:");
		Object[] o=l.toArray();
		for(int i=0;i<o.length;i++)
			System.out.print(o[i]+" ");
	}
	
}
