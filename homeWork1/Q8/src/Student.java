
public class Student {
	int id;
	String name;
	Course[] coursess;
	int place=0;
	public Student(int id, String name)
	{
		this.name=name;
		this.id=id;
		this.coursess=new Course[3];
	}
	
	public void addCourse(Course c) throws NoSpaceForCourseException{
		try {
		coursess[++place]=c;
		}
		catch (ArrayIndexOutOfBoundsException e){
			throw new NoSpaceForCourseException(e);
		}
	}
	
	public int calculateAvarage() throws NoCoursesForStudentException{
		int sum=0, avg;
			for(int i=0; i<place;i++)
				sum+= coursess[i].g
			try {
			avg=sum/place;
			return avg;
			}
		catch (ArithmeticException e) {
			throw new NoCoursesForStudentException();
		}
	}
	
	class Course public static final int get = 0;

	findCourse(String nameC) {
		try {
			for(int i=0;i<place;i++) {
				if (coursess[i])
			}
		}
		catch (Exception e) {
			throw 
		}
	}

	
	
}
