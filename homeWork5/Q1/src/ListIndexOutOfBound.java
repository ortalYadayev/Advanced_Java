
public class ListIndexOutOfBound extends RuntimeException {
	public ListIndexOutOfBound(String msg) {
		super(msg);
		System.out.println(msg);
	}
}
