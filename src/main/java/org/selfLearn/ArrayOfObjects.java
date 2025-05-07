package org.selfLearn;

class  Student{
       int rollNo;
       int marks;
       String name;
        }

public class ArrayOfObjects {
    public static void main(String[] args) {
        Student s = new Student();
        s.rollNo = 1;
        s.marks = 98;
        s.name = "Ramila";

        Student s1= new Student();
        s1. rollNo = 56;
        s1.marks = 77;
        s1.name= "Shisir";

        Student s2 = new Student();
        s2. rollNo= 3;
        s2. marks = 87;
        s2.name = "Niranjan";

        Student students[]= new Student[3];
        students[0]= s;
        students[1]= s1;
        students[2]= s2;

       /* for(int i=0; i< students.length; i++)
        {
            System.out.println(students[i].name + " " +  students[i].marks );
        }*/

        for (Student stud : students){
            System.out.println(stud.name + " " + stud.marks + " " + stud.rollNo );
        }
    }

}
