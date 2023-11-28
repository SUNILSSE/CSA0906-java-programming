import java.io.*;
import java.util.*;
class num
{
public static void main(String args[])
{
int n,l;
Scanner s=new Scanner(System.in);
System.out.println("enter number:");
n=s.nextInt();
if(n>0)
{
System.out.println("positive");
}
else
{
l=-(n-1);
System.out.println("we have to add" +l+ "numbers to get positive");
}
}
}
