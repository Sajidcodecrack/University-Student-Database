package Codes;

public class Course {
    private String cId;
    private String cTitle;
    private double credit;
    private Student[] slist= new Student[10];
    private int numberofStudents;
    private Faculty faculty;
    public Course[] cos= new Course[10];
    public int numberofCourse;
    Course()
    {

    }
    Course(String cID, String cTitle, double credit )
    {
        this.cId=cID;
        this.cTitle=cTitle;
        this.credit=credit;
    }
    @Override
    public String toString() {
        return "Course Id :" +cId + " Course-Title : " +cTitle+ " Course-credit : " +credit ;
    }
    public void addCourse(Course c)
    {
       cos[numberofCourse++]=c;
    }
    public  void addStudent(Student s)
    {
       slist[numberofStudents++]=s;
    }
    
    public void addFaculty(Faculty f)
    {
        this.faculty=f;

    }
    public void dropstudent(int stdId)
    {
        for(int i=0;i<numberofStudents;i++)
        {
            if(stdId==slist[i].getstdId())
            {
               for(int j=0;j<numberofStudents;j++)
               {
                 slist[i]=slist[i+1];
               }
               numberofStudents--;
            }
        }
    }
    public void dropfaculty()
    {
        faculty=null;
    }
    public void searchStudent(int stdId)
    {
       for(int i=0;i<numberofStudents;i++)
       {
        if(stdId==slist[i].getstdId())
        {
            System.out.println("****  **** **** ****  ");
            System.out.println(slist[i].toString());
            System.out.println("****  ****  ****  ****  ");
        }
       
        }


    }
    public void printStudentinfo()
    {
        for(int i=0;i<numberofStudents;i++)
        {
            System.out.println("----------- ----  --- ---- ----- --- ---- ---- -- -----------");


            System.out.println(slist[i].toString());
           

        }
    }
    public void prinCourseinfo()
    {
        for(int i=0;i<numberofCourse;i++)
        {
            System.out.println(this.cos[i].toString());
        }
    }
    public void printFacultyinfo()
    {
        for(int i=0;i<numberofStudents;i++)
        {
            System.out.println("------- -------- ------- ------- ------ -------");


            System.out.println(this.faculty.toString());
        }
    }
  
}
