/**
 * @author ortal
 * @version
 */
public class Square extends Rect{ //ריבוע
	/**
	 * @param h - height
	 */
	public Square(int h) { // מקבל אורך של ריבוע 
		super(h,h);
	}
	/**
	 * @return area of square
	 */
	public int getArea() { //מחזיר שטח של ריבוע
		return super.getArea();
	}
	/**
	 * @return circ of square
	 */
	public int getCirc() { // מחזיר היקף של ריבוע
		return super.getCirc();
	}
}
