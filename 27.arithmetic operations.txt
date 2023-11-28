import java.io.*;
import java.util.*;
class arth
{
public static void main(String args[])
{
int sum,sub,mul,div,mod,a,b,n;
Scanner s=new Scanner(System.in);
System.out.println("enter n:");
n=s.nextInt();
a=s.nextInt();
b=s.nextInt();
switch(n)
{
case 1:
{
sum=a+b;
System.out.println(sum);
break;
}
case 2:
{
sub=a-b;
System.out.println(sub);
break;
}
case 3:
{
mul=a*b;
System.out.println(mul);
break;
}
case 4:
{
div=a/b;
System.out.println(div);
break;
}
case 5:
{
mod=a%b;
System.out.println(mod);
break;
}
default:
System.out.println("invalid");
}
}
}
