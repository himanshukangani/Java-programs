import java.util.*;
class Student 
{
int roll;
String name;
int age;
Student(int roll, String name,int age)
{
this.roll = roll;
this.name= name;
this.age=age;
}
}

class DemoArrayListUserDefined
{
	public static void main(String args[])
	{
		ArrayList<Student> al = new ArrayList<Student>();
		Student s1 = new Student(101,"Himanshu",25);
		Student s2 = new Student(102,"Manish",25);
		Student s3 = new Student(103,"Aakash",24);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			Student s = (Student)itr.next();
		System.out.println(s.roll+" "+s.name+" "+s.age);
		}
	}
}