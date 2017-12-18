package oom;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 2017/9/9.
 */
public class HeapOOm {
    static class OOMObject {
    }

    public static void main(String[] args){
        List<OOMObject> list = new ArrayList<>();
        while (true){
            list.add(new OOMObject());
        }
    }
}
