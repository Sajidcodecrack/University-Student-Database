package Codes;
import java.util.*;


public class Maincrack {
    public static void main(String[] args)
    {   
        Course  c= new Course(null, null, 0);
        Scanner sc= new Scanner(System.in);
        int i=0;
        //Course[] cos= new Course[10];
        while(true)
        {
        System.out.println("        ******************   Menu   ****************");
        System.out.println("Press '1' to add information about students :");
        System.out.println("Press '2' to add information about faculties : ");
        System.out.println("Press '3' to delete information about students :");
        System.out.println("Press '4' to delete information about faculties :");
        System.out.println("Press '5' to search information:");
        System.out.println("Press '6' to print student information:");
        System.out.println("Press '7' to print faculty information:");
        System.out.println("Press '8' to add course of a student :");
        System.out.println("Press '9' to print student course information: ");
        System.out.println("Press '0' to exit:");

        System.out.println("************ Choose any menu from the follwoing instruction ***************");
        int a=sc.nextInt();
        if(a==0)
        {
            break;
        }
        if(a==1)
        {
            System.out.println("*********** Complete the student information form ********** ");
            System.out.println("Enter the student id: ");
            int stdId=sc.nextInt();
            System.out.println("Enter the student name:");
            String stdname=sc.next();
            System.out.println("Enter the student cgpa:");
            double stdcgpa=sc.nextDouble();
            Student s= new Student(stdId, stdname, stdcgpa);
            c.addStudent(s);

        }
        if(a==2)
        {
            System.out.println("********* Complete the faculty information from ********** ");
            System.out.println("Enter the faculty id :");
            int fId= sc.nextInt();
            System.out.println("Enter the faculty name :");
            String fname= sc.next();
            System.out.println("Enter the faculty position:");
            String fposition=sc.next();
            Faculty f= new Faculty(fId, fname, fposition);
            c.addFaculty(f);

        }
        if(a==3)
        {
            System.out.println("********* Drop-student form *******");
            System.out.println("Enter student id for dropping :");
            int stdId=sc.nextInt();
            c.dropstudent(stdId);
            System.out.println("Student drop-down execute  succesfully ");

        }
        if(a==4)
        {
            System.out.println("********* Drop-faculty form **********");
            c.dropfaculty();
            System.out.println("Faculty dropped successfully");
        }
        if(a==5)
        {
            System.out.println("******** Search engine for students information: ********* ");
            System.out.println("Enter the student id for the information: ");
            int stdId=sc.nextInt();
            c.searchStudent(stdId);

        }
        if(a==6)
        {
            System.out.println("********** Showing the details ***********");
            System.out.println("Printing the students information :");
            System.out.println("---------------    Students-Information  ---------------");
            c.printStudentinfo();
        }
        if(a==7)
        {

            System.out.println("--------- --------- ------- ------ ----- ------ ------ -------");
            System.out.println("**********    Faculty-Information   ***********");
            c.printFacultyinfo();
        }
        if(a==8)
        {
            System.out.println("----- ----- ----- ----- Course-Add-From ----- ----- ----- -----");
            System.out.println("Enter the course name :");
            String cTitle=sc.next();
            System.out.println("Enter the course credit:");
            Double credit=sc.nextDouble();
            System.out.println("Enter course id to confirm your course:");
            String cId=sc.next();
            c.addCourse(c);
            
        }
        if(a==9)
        
            System.out.println("----- ---- ----- ------ ----- Student-Course-Detail ---- ----- ----- ----- ------");
            c.prinCourseinfo();
            c.addCourse(c);
        }
    }

    }

