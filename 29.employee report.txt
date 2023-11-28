import java.io.*;
import java.util.*;
class salary
{
public static void main(String args[])
{
int salary,hra,da,ta,ca,gs,pf,home,lic,ded,net;
float annual,tax;
Scanner s=new Scanner(System.in);
System.out.println("SAVEETHA SCHOOL OF ENGINEERING");
System.out.println("chennai");
System.out.println("enter employee name:");
String name=s.nextLine();
System.out.println("enter employee designation:");
String deg=s.nextLine();
System.out.println("enter employee number:");
 int cno=s.nextInt();
System.out.println("enter employee basic salary:");
salary=s.nextInt();
hra=salary*20/100;
System.out.println("hra:"+hra);
da=salary*20/100;
System.out.println("da:"+da);
ta=salary*100/100;
System.out.println("ta"+ta);
ca=salary*5/100;
System.out.println("ca"+ca);
gs=salary+hra+da+ta+ca;
System.out.println("gs"+gs);
pf=salary*12/100;
System.out.println("pf"+pf);
System.out.println("enter the home allowance");
home=s.nextInt();
System.out.println("enter  the lic amount:");
lic=s.nextInt();
ded=pf+home+lic;
System.out.println("ded"+ded);
net=gs-ded;
System.out.println("net"+net);
annual=net*12;
System.out.println("annual salary"+annual);
if(annual<=250000)
{
tax=annual*0;
System.out.println("tax"+tax);
}
else if(annual>250000 && annual<500000)
{
tax=annual*5/100;
System.out.println("tax"+tax);
}
else if(annual>500000 && annual<750000)
{
tax=annual*10/100;
System.out.println("tax"+tax);
}
else if(annual>750000 && annual<100000)
{
tax=annual*15/100;
System.out.println("tax"+tax);
}
else if(annual>=100000)
{
tax=annual*20/100;
System.out.println("tax"+tax);
}
else
{
System.out.println("no tax");
}
}
}
