package Codes;

public class Faculty {
  private int fId;
  private String fname;
  private String fposition;
  Faculty()
  {

  } 
  Faculty(int fId, String fname, String fposition)
  {
    this.fId=fId;
    this.fname=fname;
    this.fposition=fposition;
  }
  public void setfId(int fId) {
      this.fId = fId;
  } 
  public void setFname(String fname) {
      this.fname = fname;
  }
  public void setFposition(String fposition) {
      this.fposition = fposition;
  }
  public int getfId() {
      return fId;
  }
  public String getFname() {
      return fname;
  }
  public String getFposition() {
      return fposition;
  }
  @Override
  public String toString() {
    return "\n Faculty-ID : " +getfId()+ "\n Faculty-name :" + getFname()+ "\n Faculty-position " +getFposition();

  }
}
