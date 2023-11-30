import java.io.*;
import java.util.*;
class P
{
int x=10;
void display()
{
System.out.println("i am having"+x);
}
}
class C extends P
{
int y=10;
void display1()
{
System.out.println("i am also having"+y);
}
}
class single
{
public static void main(String args[])
{
C c=new C();
c.display();
c.display1();
}
}
