import java.io.*;
import java.util.*;
class odd
{
public static void main(String args[])
{
int i=1,sum=0,n;
Scanner s=new Scanner(System.in);
System.out.println("enter nth number");
n=s.nextInt();
while(i<n)
{
i=i+2;
sum=sum+i;
}
System.out.println("sum " +sum);
}
}
