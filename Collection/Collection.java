package Collection;

import java.util.ArrayList;
import java.util.List;

public class Collection {
    void listData(){
        String name="Sagar,mihir,abhi,omkar,Bhavika";
        List<String> list=new ArrayList<>();
        list.add(name);
        for(String s: list)
        {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        new Collection().listData();
    }
}
