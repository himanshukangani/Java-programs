import java.util.*;
class DemoArrayListDeleteSpecifiedCollection
{
public static void main(String args[])
{
	ArrayList<String> al = new ArrayList<String>();
	al.add("Himanshu");
	al.add("Manish");
	al.add("Ravi");
	ArrayList<String> al2 = new ArrayList<String>();
	al2.add("Rav");
	al2.add("Kismat");
	al.retainAll(al2);
	Iterator itr = al.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
		