
public class Program {

	public static void main(String[] args) {
		Stack<String> ss=new Stack<String>(3);
		ss.push("ortal");
		ss.push("the");
		ss.push("best");
		System.out.println(ss.top());
		for(int i=0;i<3;i++) {
			System.out.println(ss.pop());
		}

		Stack<Integer> tat1=new Stack<Integer>(3);
		tat1.push(1);
		tat1.push(2);
		tat1.push(3);
		Stack<Integer> tat2=new Stack<Integer>(3);
		tat2.push(11);
		tat2.push(22);
		tat2.push(33);
		Stack<Stack<Integer>> sat=new Stack<Stack<Integer>>(3);
		sat.push(tat1);
		sat.push(tat2);
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++)
				System.out.print(sat.top().pop()+" ");
			System.out.println();
			sat.pop();
		}
	}

}
