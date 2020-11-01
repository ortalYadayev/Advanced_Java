
public class Program {

	public static void main(String[] args) throws divOperationNotSupported, mulOperationNotSupported,DifferentDimensionsException,CloneNotSupportedException {	
		
		Matrix m1=new Matrix(3,3, 1,12,3,2,4,6,56,8,20);
		Matrix m2=new Matrix(3,3, 9,2,7,4,40,6,5,9,2);
		Matrix m3=(Matrix) m1.add(m2);
		System.out.println("addition two matrixs");
		m3.write();
		Matrix m4=(Matrix) m1.sub(m2);
		System.out.println("subtraction two matrixs");
		m4.write();
		Matrix m5=(Matrix) m1.div(m2);
		m5.write();
		m5=(Matrix) m1.mul(m2);
		m5.write();
		System.out.println(m1.equals(m2));
		Object obj= m2.read();
		System.out.println("the value: "+obj);
	}
}
