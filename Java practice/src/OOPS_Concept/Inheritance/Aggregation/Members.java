package OOPS_Concept.Inheritance.Aggregation;

public class Members {

    int id;
    String member;
    String location;
    Avengers membAddr;
    Members(int id, String memb ,String loc, Avengers addr){
        this.id=id;;
        this.member=memb;
        this.location=loc;
        this.membAddr=addr;


    }

    public static void main(String[] args) {
        Avengers ad=new Avengers(01,"Tony-Stark","Iron-Man","Avengers");
        Members me=new Members(01,"Steve-Rogers","Avengers-Faciity",ad);
        System.out.println(ad.id);
        System.out.println(ad.Name);
        System.out.println(ad.Heroname);
        System.out.println(ad.group);
        System.out.println(me.location);

    }
}
