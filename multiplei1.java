import java.io.*;
import java.util.*;
class f
{
void display()
{
System.out.println("father");
}
}
interface m1
{
int x=2;
public void display1();
}
interface m2
{
int y=3;
public void display2();
}
class C extends f implements m1,m2
{
public void display1()
{
System.out.println(x);
}
public void display2()
{
System.out.println(y);
}
}
class multiplei1
{
public static void main(String args[])
{
C c=new C();
c.display();
c.display1();
c.display2();
}
}
