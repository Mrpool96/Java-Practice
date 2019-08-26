package JavaPractice;

import java.sql.SQLOutput;

public class College {
    String Collegename;
    Address CollegeAddr;
    College(String name, Address Addr){
        this.Collegename=name;
        this.CollegeAddr=Addr;
    }

    public static void main(String[] args) {
        Address ad=new Address(01," Newyork ","Manhattan","America" );
        StudentClass obj=new StudentClass(123,"Tony Stark",ad);
        College obj1 =new College("M.I.T",ad);
        System.out.println("Student Roll no:-"+obj.rollno);
        System.out.println("Student Name:-"+obj.Studname);
        System.out.println("Street NO:-"+obj.StudentAddr.StreetNum);
        System.out.println("City:-"+obj.StudentAddr.city);
        System.out.println("State:-"+obj.StudentAddr.State);
        System.out.println("Country:-"+obj.StudentAddr.Country);
        System.out.println("College Name:-"+obj1.Collegename);
        System.out.println("College Address:-"+obj1.CollegeAddr.city);
    }//Encapsulation Example
}
