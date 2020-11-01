import java.util.Date;

public class XDate {
	Date d;
	
	public XDate(int date, int month, int year) {
		d=new Date(year-1900,month-1,date);
	}
	public int getMonth() {
		return d.getMonth()+1;
	}
	public  int getYear() {
		return d.getYear()+1900;
	}	
	
	public int getDate() {
		return d.getDate();
	}
	
	public XDate addDays(int d) {
		return new XDate(getDate()+d, getMonth(), getYear());
	}
	
	/*public XDate addDays (int day) {
			switch(getMonth()) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10: 
				if(date+day>31) {
					date=day-(31-date);
					month++;
				}
				else date= date+day;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if(date+day>30) {
					date=day-(30-date);
					month++;
				}
				else date= date+day;
				break;
			case 2:
				if(date+day>28) {
					date=day-(28-date);
					month++;
				}
				else date= date+day;
				break;
			case 12: 
				if(date+day>31) {
					date=day-(31-date);
					month=0;
					year++;
				}
				else date= date+day;
				break;
			default: System.out.print("");
			}		
		XDate xd= new XDate(getDate(),getMonth() ,getYear());
		return xd;
	}*/
	public static XDate now() {
		XDate n=null;
		return new XDate(n.getDate(), n.getMonth(), n.getYear());
	}
}