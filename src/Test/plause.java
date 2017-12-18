package Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 2017/2/17.
 */
public class plause {

//    public static void main(String[] args) {
        public static void main(String args[]) {
            String _Hellowor$ld="";
            List Listlist1 = new ArrayList();
            Listlist1.add(0);
            List Listlist2 = Listlist1;
            System.out.println(Listlist1.get(0) instanceof Integer);
            System.out.println(Listlist2.get(0) instanceof Integer);
        }

//    }
}
