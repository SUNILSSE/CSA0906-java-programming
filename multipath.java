import java.io.*;
import java.util.*;
class gp
{
int x=15;
void display()
{
System.out.println("grandpa have"+x+"cr");
}
}
interface f
{
int y=5;
public void display1();
}
interface m
{
int z=10;
public void display1();
}
class C extends gp implements f,m
{
public void display1()
{
System.out.println("father have"+y+"cr\nmother have"+z+"cr");
}
}
class multipath
{
public static void main(String args[])
{
C c=new C();
c.display();
c.display1();
}
}
