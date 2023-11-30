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
class C1 extends P
{
int y=20;
void display1()
{
System.out.println("i am also having"+y);
}
}
class C2 extends P
{
int z=5;
void display2()
{
System.out.println("i am having only"+z);
}
}
class C3 extends P
{
int m=3;
void display3()
{
System.out.println("i have"+m);
}
}
class hierar
{
public static void main(String args[])
{
C1 c1=new C1();
c1.display();
c1.display1();
C2 c2=new C2();
c2.display2();    
C3 c3=new C3();
c3.display3();
}
}
