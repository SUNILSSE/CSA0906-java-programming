import java.io.*;
import java.util.*;
class mean
{
public static void main(String args[])
{
int i,n,j,count,max,index=0,sum,median;
int a[]=new int[10];
Scanner m=new Scanner(System.in);
System.out.println("enter limit of index");
n=m.nextInt();
for(i=1;i<=n;i++)
{
a[i]=m.nextInt();
}
sum=0;
for(i=1;i<=n;i++)
{
sum=sum+a[i];
}
int mean=sum/n;
max=0;
for(i=1;i<=n;i++)
{
count=0;
for(j=i+1;j<=n;j++)
{
if(a[i]==a[j])
{
count++;
}
}
if(max<count)
{
max=count;
index=i;
}
}
int mode=a[index];
for(i=1;i<=n;i++)
{
for(j=i+1;j<=n;j++)
{
if(a[i]>a[j])
{
int t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
if(n%2==0)
{
median=(a[n/2]+a[(n/2)+1])/2;
}
else
{
median=a[(n+1)/2];
}
System.out.println("mean="+mean);
System.out.println("median="+median);
System.out.println("mode="+mode);
}
}
