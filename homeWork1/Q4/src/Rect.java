/**
 * @author ortal
 * @version
 * 
 */
public class Rect{ 
	protected int width, height;
	/**
	 * @param h -מקבל גובה
	 * @param w - מקבל אורך
	 * @return - כלום 
	 */
	public Rect(int h, int w) {
		height=h;
		width=w;
	}
	/**
	 * 
	 * @return area 
	 */
	public int getArea() { 
		return width*height;
	}
	/**
	 * 
	 * @return circ
	 */
	public int getCirc() {
		return (width+height)*2;
	}
}
