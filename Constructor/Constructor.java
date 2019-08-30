package Constructor;

public class Constructor {
    int empId;
    String empName;
    Constructor(int id,String Name){
        this.empId=id;
        this.empName=Name;
    }
    void info(){
        System.out.println(" Employee ID:- "+empId+" Employee :-"+empName);
    }

    public static void main(String[] args) {
        Constructor obj=new Constructor(01,"Tony Stark");
        Constructor obj1=new Constructor(02,"Steven Rogers");
        Constructor obj2=new Constructor(03,"Thor");
        Constructor obj3=new Constructor(04,"Natasha Romanoff");
        Constructor obj4=new Constructor(05,"Bruce Banner");
        obj.info();
        obj1.info();
        obj2.info();
        obj3.info();
        obj4.info();
    }
}
