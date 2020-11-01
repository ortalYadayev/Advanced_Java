
public class Set implements Arithmetic,ScanOp,Cloneable {
	private Object[] arr;
	private int realSize;
	private int current;
	
	public Set(int maxSize){
		arr= new Object[maxSize];
		realSize=0;
	}
	public Set(int maxSize,Object...a){
		arr= new Object[maxSize];
		realSize=0;
		for(int i=0;i<a.length;i++) {
			addObj(a[i]);
		}
	}
	public int getLength() {return arr.length;}
	
	public boolean isFull() {
		return realSize==arr.length;
	}
	public boolean isMember(Object o) {
		for(int i=0; i<realSize;i++) {
			if(arr[i].equals(o))
				return true;
			else if(arr[i]==o)
					return true;
		}
		return false;
	}
	public void addObj(Object o) {
		if((!isFull())&& (!isMember(o))) {
			arr[realSize++]=o;
		}
	}//checkkkkkkkkkkkk
//	public boolean classCommon(Object o, Object[] a,int k) {
//		if(a[0]==null) {
//			return true;
//		}
//		for(int i=0; i<=k;i++) {
//			if(a[i].getClass()==o.getClass())
//				return true;
//		}
//		return false;
//	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	public String toString() {
		String str="";
		int count;
		Object[] newArr=arr.clone();
		for(int i=0; i<realSize;i++) {
			if(i!=0)
				str+=":";			
			count=0;
			Class c=arr[i].getClass();
			str+=c;
			for(int j=0;j<realSize;j++) {
				if(c.equals(arr[j].getClass()))
					count++;
			}
			str+="("+count+")";
		}	
		return str;
	}
	public Object add(Object o) {
		if(o instanceof Set) {
			Set s=(Set)o;
			for(int i=0;i<realSize;i++) {
				boolean flag=false;
				for(int j=0;j<realSize;j++) {
					if(s.arr[j].equals(arr[i])) {
						flag=true;
						break;
					}
				if(!flag)
					s.addObj(arr[i]);
				}
			}
			return ((Object)s);
		}
		return null;
	}
	@Override
	public Object sub(Object o) {
		if(o instanceof Set) {
			Set s=(Set)o;
			Set s1=new Set(realSize);
			for(int i=0; i<realSize;i++) {
				boolean flag=false;
				for(int j=0;j<s.realSize;j++) { 
					if(arr[i].equals(s.arr[j])|| arr[i]==s.arr[j]) {
						flag=true;
						break;
					}
				}
				if(!flag)
					s1.addObj(arr[i]);
			}
			return((Object)s1);
		}		
		return null;
	}
	public Set mul(Object o) {
		if(o instanceof Set) {
			Set s=(Set)o;
			Set s1=new Set(realSize);
			for(int i=0; i<realSize; i++) {
				for(int j=0; j<s.realSize;j++) {
					if(arr[i].equals(s.arr[j])||arr[i]==s.arr[j]) 
						s1.arr[s1.realSize++]=arr[i];
				}
			}
		return s1;
		}
		return null;
	}
	public Object div(Object o) {
		Set s=new Set(realSize);
		return s;
	}
	public Object[] sameType(Class c) {
		Object[] classes=new Object[realSize];
		int k=0;
		for(int i=0; i<realSize; i++) {
			if(arr[i].getClass()==c) 
				classes[k++]=arr[i];
		}
		return classes;
	}
	public Class[] someType() {
		Class[] classes= new Class[realSize];
		int k=0;
		for(int i=0; i<realSize; i++) {
			//if(!(classCommon(arr[i], classes, i))) 
				classes[k++]=arr[i].getClass();
		}
		return classes;
	}
	@Override
	public void reset() {
		current=0;
	}
	@Override
	public boolean forward() {
		if(current+1<realSize) {
			current++;
			return true;
		}
		return false;
	}
	@Override
	public boolean backward() {
		if(current-1<realSize) {
			current--;
			return true;
		}
		return false;
	}
	@Override
	public Object getCurrent() {
		return arr[current];
	}

}
