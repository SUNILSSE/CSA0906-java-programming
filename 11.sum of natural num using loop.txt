import java.io.*;
import java.util.*;
class sumnat
{
public static void main(String args[])
{
int i,sum=0,n;
Scanner s=new Scanner(System.in);
System.out.println("enter nth number:");
n=s.nextInt();
for(i=0;i<=n;i++)
{
sum=sum+i;
}
System.out.println(sum);
}
}
