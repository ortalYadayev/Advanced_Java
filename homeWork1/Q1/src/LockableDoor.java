
public class LockableDoor extends Door{
	private boolean lock;
	
	public LockableDoor() {
		super();
		lock=false;
	}
	public void open() {
		if(!lock)
			super.open();
		else System.out.println("the door is locked");
	}
	public void close() {
		super.close();
	}
	public void lock() {
		if(!super.isOpen())
			lock=true;
		else System.out.println("the door is open");
	}
	public void unlock () {
		lock=false;
	}
	public  boolean  isLock() {
		return lock;
	 }
	public void show() {
		if(lock)
			System.out.println("The door is lock && close");
		else if(super.isOpen())
			System.out.print("The door is unlock && open");
		else System.out.print("The door is unlock && close");
	}
}
