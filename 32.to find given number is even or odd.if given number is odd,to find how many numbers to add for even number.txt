import java.io.*;
import java.util.*;
class number
{
public static void main(String args[])
{
int n,l;
Scanner s=new Scanner(System.in);
System.out.println("enter number:");
n=s.nextInt();
if(n%2==0)
{
System.out.println("even");
}
else
{
System.out.println("odd");
l=n+1;
System.out.println(l);
}
}
}
