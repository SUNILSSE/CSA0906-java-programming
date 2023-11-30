import java.io.*;
import java.util.*;
class add{
int x,y;
add(){
System.out.println("enter the two values:");
Scanner s=new Scanner(System.in);
x=s.nextInt();
y=s.nextInt();
System.out.println("sum of two numbers="+(x+y));
}
void display()
{
System.out.println("am not a constructor");
}
}
class s7
{
public static void main(String args[])
{
add a=new add();
a.display();
}
}
 
