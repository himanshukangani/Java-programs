class First
{
int a=50;

public void sum()
{
System.out.println("this is from first");
}
}

class Second extends First{
int a = 100;
int b=80;
public void sum()
{
System.out.println("this is from Second");
}
public static void main(String args[])
{
First obj = new First();
obj.sum();
System.out.println(obj.a);
System.out.println(obj.b);

First obj1 = new Second();
obj1.sum();
System.out.println(obj1.a);
System.out.println(obj1.b);

Second obj2 = new Second();
obj2.sum();
System.out.println(obj2.a);
System.out.println(obj2.b);
}
}