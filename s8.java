import java.io.*;
import java.util.*;
class arith
{
int x,y;
arith()
{
System.out.println("enter the two values:");
Scanner s=new Scanner(System.in);
x=s.nextInt();
y=s.nextInt();
System.out.println("select\n1 for add,\n2 for sub,\n3 for mul,\n4 for div,\n5 for mod.");
}
void display()
{
int a;
System.out.println("enter the operator:");
Scanner s=new Scanner(System.in);
a=s.nextInt();
switch(a)
{
case 1:
System.out.println("add="+(x+y));
break;
case 2:
System.out.println("sub="+(x-y));
break;
case 3:
System.out.println("mul="+(x*y));
break;
case 4:
System.out.println("div="+(x/y));
break;
case 5:
System.out.println("add="+(x%y));
break;
}
}
}
class s8
{
public static void main(String args[])
{
arith a=new arith();
a.display();
}
}
