import java.io.*;
import java.util.*;
class year
{
public static void main(String args[])
{
int n,l;
Scanner s=new Scanner(System.in);
System.out.println("enter year:");
n=s.nextInt();
if(n%4==0)
{
System.out.println("leap year");
}
else
{
System.out.println("not a leap year");
l=4-(n%4);
System.out.println("wait for " +l+ " years");
}
}
}
