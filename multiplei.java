import java.io.*;
import java.util.*;
class f
{
void display()
{
System.out.println("father");
}
}
interface m
{
public void display1();
}
class C extends f implements m
{
public void display1()
{
System.out.println("child");
}
}
class multiplei
{
public static void main(String args[])
{
C c=new C();
c.display();
c.display1();
}
}
