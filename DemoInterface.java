interface i1
{
void sum();
}

interface i2 extends i1
{
void sun();
}

abstract class Hello implements i2 
{
public void sum()
{
System.out.println("This is from sum");
}
}

class DemoInterface extends Hello
{
public void sun()
{
System.out.println("This is from sun");
}

public static void main(String args[])
{
 i1 obj;
 obj = new DemoInterface();
 obj.sum();
}
}