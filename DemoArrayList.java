import java.util.*;
class DemoArrayList
{
	public static void main(String args[])
	{
ArrayList<String>  al= new ArrayList<String>();
al.add("Ravi");
al.add("Shyam");
al.add("Himanshu");

Iterator itr = al.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}