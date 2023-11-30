import java.io.*;
import java.util.*;
class student
{
String a="sunil";
void display()
{
System.out.println("student name="+a);
}
}
class testmark extends student
{
int m=90;
void display1()
{
System.out.println("marks="+m);
}
}
interface sports
{
int b=1000;
public void display2();
}
class rent extends testmark implements sports
{
public void display2()
{
System.out.println("rent="+b);
}
}
class multiplei2
{
public static void main(String args[])
{
testmark c1=new testmark();
c1.display();
c1.display1();
rent c=new rent();
c.display2();
}
}
