import java.util.Objects;

public class List {

	private ListNode firstNode;
	private ListNode lastNode;
	private String name;


	public ListNode getHead() {return firstNode;} 

	public List(){
		this("list");
	}
	public List(String listName){
		name=listName;
		firstNode=lastNode=null;
	}
	public void insertAtFront(Object insertItem){
		if(isEmpty())
			firstNode=lastNode=new ListNode(insertItem);
		else
			firstNode=new ListNode(insertItem,firstNode);
	}
	public void insertAtBack(Object insertItem){
		if(isEmpty())
			firstNode=lastNode=new ListNode(insertItem);
		else
			lastNode=lastNode.nextNode=new ListNode(insertItem);
	}
	public Object removeFromFront()throws EmptyListException{
		if(isEmpty())
			throw new EmptyListException(name);
		
		Object removedItem=firstNode.data;
		if(firstNode==lastNode)
			firstNode=lastNode=null;
		else
			firstNode=firstNode.nextNode;
		return removedItem;
	}
	public Object removeFromBack() throws EmptyListException{
		if(isEmpty())
			throw new EmptyListException(name);

		Object removedItem=lastNode.data;
		if(firstNode==lastNode)
			firstNode=lastNode=null;
		else{
			ListNode current=firstNode;

			while(current.nextNode!=lastNode)
				current=current.nextNode;
				
			lastNode=current;
			current.nextNode=null;
		}
		return removedItem;
	}
	public boolean isEmpty(){
		return firstNode==null;
	}
	public void print(){
		if(isEmpty()){
			System.out.print("Empty %s\n"+ name);
			return;
		}
		System.out.print("The %s is : "+name);
		ListNode current=firstNode;

		while(current != null){
			System.out.print("%s"+current.data);
			current=current.nextNode;
		}
		System.out.println("\n");
	}
	
	public String toString() {
		String str="";
		if(isEmpty()){
			str+="Empty "+name;
			return str;
		}
		str+="(";
		ListNode current=firstNode;
		Object info;
		while(current!=null) {
			info=current.getObject();
			str+=info;
			current=current.nextNode;
			if(current!=null)
				str+=",";
		}
		str+=")";
		return str;
	}
	//חריגה לא משהו
	public Object removeAt(int k)throws EmptyListException,ListIndexOutOfBound {
		if(isEmpty())
			throw new EmptyListException(name);
		if(k==0) {
			return removeFromFront();			
		}
		try {
			int i=0;
			ListNode current=firstNode;
			ListNode prev=null;
			ListNode next;
			while(i<k) {
				if(current.nextNode!=null) {
					prev = current;
					current=current.nextNode;
					i++;
				}				
				else {
					throw new ListIndexOutOfBound(k+" not good");
				}
			}
			if(current==lastNode)
				removeFromBack();
			Object removedItem=current.data;
			prev.nextNode=current.nextNode;
			return removedItem;		
		}
		 catch (ListIndexOutOfBound e) {
			 return null;
		}
		
	}
	public  void show(){
		if (firstNode==null)
			return;
		else
			firstNode.show();
		}
	public  void showRev(){
		if (firstNode==null)
		  return;
		else
		  firstNode.showRev();
		}
	public void addAt(Object obj, int k) {
		if(isEmpty()&& k>0)
			throw new EmptyListException(name);
		if(k==0) {
			insertAtFront(obj);
			return;
		}
		int i=0;
		ListNode current=firstNode;
		ListNode prev=null;
		try {
			while(i<k) {
				if(current.nextNode!=null) {
					prev = current;
					current=current.nextNode;
					i++;
				}
				else {
					throw new ListIndexOutOfBound(k+" not good");
				}
			}
			ListNode next=new ListNode(obj);
			prev.setNext(next);
			next.setNext(current);
			if(current==lastNode) {
				insertAtBack(obj);
				return;
			}
		}
		catch (ListIndexOutOfBound e) {
		}
	}
	public Object[] toArray() {
		if(isEmpty())
			return null;
		int sizeOfList=0;
		ListNode current=firstNode;
		while(current.nextNode!=null) {
			sizeOfList++;
			current=current.nextNode;
		}
		
		Object[] objects= new Object[sizeOfList+1];
		current=firstNode;
		for(int i=0;i<objects.length;i++) {
			objects[i]=current.data;
			current=current.nextNode;
		}
		return objects;
	}
	

}