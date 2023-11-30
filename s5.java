import java.io.*;
import java.util.*;
class electricity
{
int cmr,lmr,c_no,unit;
double amount;
String c_name;
void display()
{
Scanner s=new Scanner(System.in);
System.out.println("enter the c.name,c.no,cmr,lmr");
c_name=s.nextLine();
c_no=s.nextInt();
cmr=s.nextInt();
lmr=s.nextInt();
unit=cmr-lmr;
if(unit<=100){
System.out.println("amount=0");
}
else if(100>unit && unit>=300){
amount=(unit-100)*3;
System.out.println("amount="+amount);
}
else if(300>unit && unit>=500){
amount=(unit-300)*7.50+(200*3);
System.out.println("amount="+amount);
}
else if(unit>=500){
amount=(unit-500)*10+(200*3)+(200*7.50);
System.out.println("amount="+amount);
}
}
}
class s5
{
public static void main(String args[])
{
electricity a=new electricity();
a.display();
}
}
