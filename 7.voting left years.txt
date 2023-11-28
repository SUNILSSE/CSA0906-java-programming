import java.io.*;
import java.util.*;
class voting
{
public static void main(String args[])
{
int age;
Scanner s=new Scanner(System.in);
System.out.println("enter age:");
age=s.nextInt();
if(age>=18)
{
System.out.println("eligible");
}
else
{
System.out.println("not eligible for voting");
int n=18-age;
System.out.println("wait for " +n+ " years");
}
}
}
