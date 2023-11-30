import java.io.*;
import java.util.*;
class college
{
String q="saveetha";
void display(){
System.out.println("college name     :"+q+".");
}
}
class student extends college
{
int st_id=123;
String q1="sunil";
void display1(){
System.out.println("student id       :"+st_id+"\nstudent name     :"+q1);
}
}
class staff extends college
{
int st_id=321;
String q2="hithesh";
void display2(){
System.out.println("staff id         :"+st_id+"\nstaff name       :"+q2);
}
}
class office extends college
{
String q3="karthik";
void display3(){
System.out.println("clerk name       :"+q3);
}
}
class teaching extends staff
{
String q4="cse";
void display4(){
System.out.println("department name  :"+q4);
}
}
class nts extends staff
{
String q5="3-5 hours per day.";
void display5(){
System.out.println("regular part time:"+q5);
}
}
class salary extends teaching
{
int pay=60000;
void display6(){
System.out.println("salary per month :rs."+pay);
}
}class wage extends teaching
{
int perday=2000;
void display7(){
System.out.println("salary per day   :rs."+perday);
}
}
class multiinheritance
{
public static void main(String args[])
{
student a=new student();
a.display();
a.display1();
staff b=new staff();
b.display2();
office c=new office();
c.display3();
teaching d=new teaching();
d.display4();
nts e=new nts();
e.display5();
salary f=new salary();
f.display6();
wage g=new wage();
g.display7();
}
}
