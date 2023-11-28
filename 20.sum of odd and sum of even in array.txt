import java.io.*;
import java.util.*;
class evenodd
{
public static void main(String args[])
{
int x[]=new int[10];
int i,n,e=0,o=0;
Scanner s=new Scanner(System.in);
System.out.println("enter n");
n=s.nextInt();
for(i=1;i<10;i++)
{
x[i]=s.nextInt();
}
System.out.println("output");
for(i=1;i<10;i++)
{
if(x[i]%2==0)
{
e=e+x[i];
}
else
{
o=o+x[i];
}
}
System.out.println("even " +e);
System.out.println("odd " +o);
}
}
