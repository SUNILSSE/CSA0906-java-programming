import java.io.*;
import java.util.*;
class day
{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("enter n:");
n=s.nextInt();
int m=n%7;
switch(m)
{
case 0:
System.out.println("monday");
break;
case 1:
System.out.println("tuesday");
break;
case 2:
System.out.println("wednesday");
break;
case 3:
System.out.println("thursday");
break;
case 4:
System.out.println("friday");
break;
case 5:
System.out.println("saturday");
break;
case 6:
System.out.println("sunday");
break;
default:
System.out.println("invalid");
}
}
}
