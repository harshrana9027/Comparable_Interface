/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hrana
 */
import java.util.*;

class Student implements Comparable<Student>
{
String name;
int rollno;

    Student(String name,int rollno)
    {
    this.name=name;
    this.rollno=rollno;
    }

public int compareTo(Student s)
{
    if(rollno==s.rollno)
    {
    return 0;
    }
    else if(rollno>s.rollno)
    {
    return 1;
    }
    else
    {
    return -1;
    }
    }
}
public class Comparable_Interface
{
    public static void main(String args[])
    {
        ArrayList<Student> al=new ArrayList();
        al.add(new Student("harsh rana",12));
        al.add(new Student("abhishek rana",10));
        al.add(new Student("rohit rana",8));
        al.add(new Student("dev rana",4));
        al.add(new Student("honey rana",20));
        al.add(new Student("sagar rana",11));

        Collections.sort(al);  

        for(Student var:al)
        {
        System.out.println(var.name+"  "+var.rollno);
        }

    }
}