
public class divOperationNotSupported extends RuntimeException {
	public divOperationNotSupported (String msg) {
		super(msg);
		System.out.println(msg);
	}
}
