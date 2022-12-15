package Codes;

public class Student {
    private  int stdId;
    private String stdname;
    private double stdcgpa;
    Student()
    {

    }
    Student( int stdId, String stdname, double stdcgpa)
    {
        this.stdId= stdId;
        this.stdname=stdname;
        this.stdcgpa=stdcgpa;
    }
    public void setstdId(int stdId) {
        this.stdId = stdId;
    }
    public void setStdname(String stdname) {
        this.stdname = stdname;
    }
    public void setStdcgpa(double stdcgpa) {
        this.stdcgpa = stdcgpa;
    }
    public int getstdId() {
        return stdId;
    }
    public String getStdname() {
        return stdname;
    }
    public double getStdcgpa() {
        return stdcgpa;
    }
    @Override
    public String toString() {
        return "\n Student-ID : " +getstdId()+ "\n Student-Name:" + getStdname()+ "\n Student-Cgpa:" +getStdcgpa();
    }

}
