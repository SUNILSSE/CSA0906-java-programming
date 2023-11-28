import java.io.*;
import java.util.*;
class armstrong
{
public static void main(String args[])
{
int i=0,n,rev=0,dig,number;
Scanner s=new Scanner(System.in);
System.out.println("enter nth number");
n=s.nextInt();
number=n;
while(n>0)
{
dig=n%10;
rev+=Math.pow(dig,3);
n=n/10;
}
System.out.println(rev);
if(number==rev)
{
System.out.println("arms");
}
else
{
System.out.println("not");
}
}
}
