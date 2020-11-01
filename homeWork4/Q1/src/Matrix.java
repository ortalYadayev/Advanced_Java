import java.util.Scanner;

public class Matrix implements Arithmetic,InputOuput,Cloneable {
	int[][] data;
	
	public Matrix (int i, int j, int...nums) {
		this(i,j);
		int k=0;
		for(int x=0; x<i;x++) {
			for(int y=0;y<j;y++) {
				data[x][y]=nums[k];
				k++;
			}
		}
	}
	
	public Matrix(int length, int length2) {
		try {
				data=new int[length][length2];
		}
		catch (NegativeArraySizeException e) {
			System.out.println("mistake in the number of length");
		}
	}
	public Matrix(int[][]a) {
		data=a;
	}
	
	public Object add(Object o) {
		if(o instanceof Matrix) {
			Matrix m1= (Matrix)o;
			int[][] newArr=new int [data.length][data[0].length];
			try {
				for(int i=0;i<data.length;i++) {
					for(int j=0;j<data[i].length;j++) {
						newArr[i][j]=data[i][j]+m1.valueAt(i,j);
					}
				}
				if((data.length==m1.data.length)&&(data[0].length==m1.data[0].length)) {
					Matrix newMatrix=new Matrix(newArr);
					return newMatrix;
				}
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("different length");
			}
		}
		System.out.println("this is not matrix");
		return null;
	
	}

	public Object sub(Object o) {
		if(o instanceof Matrix) {
			Matrix m1= (Matrix)o;
			int[][] newArr=new int [data.length][data[0].length];
			try {
				for(int i=0;i<data.length;i++) {
					for(int j=0;j<data[i].length;j++) {
						newArr[i][j]=data[i][j]-m1.valueAt(i,j);
					}
				}
				if((data.length==m1.data.length)&&(data[0].length==m1.data[0].length)) {
					Matrix newMatrix=new Matrix(newArr);
					return newMatrix;
				}
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("different length");
			}
		}
		System.out.println("this is not matrix");
		return null;
	}
	@SuppressWarnings("finally")
	public Object mul(Object o) throws mulOperationNotSupported {
		try {
			throw new mulOperationNotSupported("no multiplication - mistake");
		}
		finally{
			return new Matrix(null);
		}
	}
	@SuppressWarnings("finally")
	public Object div(Object o) throws divOperationNotSupported {
		try {
			throw new divOperationNotSupported("no division - mistake");
		}
		finally{
			return new Matrix(null);
		}
	}
	public int valueAt(int row,int cur) {
		try {
		return data[row][cur];
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid values");
		}
		return -1;
	}
	@Override
	public Object read() {
		Scanner s = new Scanner(System.in);
		while(true) {
			try {
				System.out.println("Enter a number: ");
				int num=s.nextInt();
				return num;
			}
			catch (Throwable t) {
				System.out.println("again");
   				s.next();
			}
		}
	}
	@Override
	public void write() {
		if(this.data == null) {
			System.out.println("No values");
			return;
		}
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
				System.out.print(data[i][j]);
				if(j!=data[i].length-1)
					System.out.print(",");
			}
			System.out.println();
		}
	}
	@SuppressWarnings("finally")
	public boolean equals(Object o) throws DifferentDimensionsException {
		try {
			if(o instanceof Matrix) {
				Matrix m=(Matrix)o;
				if ((m.data.length != this.data.length) && (m.data[0].length != this.data[0].length))
					throw new DifferentDimensionsException("different dimensions");
				for(int i=0; i<data.length;i++) {
					for(int j=0; j<data[i].length;j++) {
						if(data[i][j]!=m.data[i][j])
							return false;
					}
				}
				return true;
			}
			throw new DifferentDimensionsException("no matrix");
		}
		finally {
			return false;
		}
	}
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
}
