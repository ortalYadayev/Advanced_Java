
public class Program {

	public static void main(String[] args) {
		LockableDoor d=new LockableDoor();
		d.close();
		d.lock();
		d.open();
		d.show();
		d.unlock();
		d.open();
		d.show();
	}

}
