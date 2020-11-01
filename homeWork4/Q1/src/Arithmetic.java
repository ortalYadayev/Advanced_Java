
public interface Arithmetic {
	Object add(Object o);
	Object sub(Object o);
	Object mul(Object o) throws mulOperationNotSupported;
	Object div(Object o) throws divOperationNotSupported;
}
