import java.io.*;
import java.util.*;
class sorting
{
public static void main(String args[])
{
int x[]=new int[10];
int i,n,j,t=0;
Scanner s=new Scanner(System.in);
for(i=0;i<10;i++)
{
x[i]=s.nextInt();
}
System.out.println("output");
for(i=0;i<10;i++)
{
for(j=i+1;j<10;j++)
{
if(x[i]>x[j])
{
t=x[i];
x[i]=x[j];
x[j]=t;
}
}
}
for(i=0;i<10;i++)
{
System.out.println(x[i]);
}
}
}
