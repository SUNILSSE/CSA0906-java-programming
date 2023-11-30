import java.io.*;
import java.util.*;
class student
{
int regno,m1,m2,m3,m4,m5,avg;
String name;
Scanner s=new Scanner(System.in);
System.out.println("enter the name and reg no and enter the 5 subject marks:");
name=s.nextLine();
regno=s.nextInt();
m1=s.nextInt();
m2=s.nextInt();
m3=s.nextInt();
m4=s.nextInt();
m5=s.nextInt();
student()
{
System.out.println("student name="+name);
}
void calculate()
{
avg=(m1+m2+m3+m4+m5)/5;
}
void display()
{
if(avg>90)
{
System.out.println("grade=A+");
}
else if(80<=avg && avg>=90)
{
System.out.println("grade=A");
}
else if(70<=avg && avg>=80)
{
System.out.println("grade=B");
}
else if(60<=avg && avg>=70)
{
System.out.println("grade=c");
}
else if(avg<60)
{
System.out.println("grade=E");
}
else
{
System.out.println("invalid input");
}
}
}
class s9
{
public static void main(String args[])
{
student a=new student();
a.calculate();
a.display();
}
}
