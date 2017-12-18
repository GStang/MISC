package Test;

/**
 * Created by DELL on 2016/10/28.
 */

import Seven_reusing.TestProtected;

import java.util.ArrayList;

public class Practice10 {
    public static void main(String[] args){
        TestProtected testProtected = new TestProtected();
        ArrayList<Integer> list=new ArrayList();
        for(int i=101;i<201;i++){
            boolean a=true;
            for(int j=2;j<i;j++){
                if(i%j==0)
                    a=false;
                break;
            }
            if(a){
                list.add(i);
            }
        }
        System.out.println("素数为："+list);
    }

}