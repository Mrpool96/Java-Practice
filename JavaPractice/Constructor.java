package JavaPractice;

public class Constructor {
    int empId;
    String name;
    Constructor(int id,String name){
        this.empId= id;
        this.name=name;
    }
    void info(){
        System.out.println("ID:- "+empId+"Name:-"+name);
    }

    public static void main(String[] args) {
        Constructor obj=new Constructor(01 ,"Tony Stark");
        Constructor obj1=new Constructor(02 ,"Steven Rogers");
        obj.info();
        obj1.info();
    }
}
