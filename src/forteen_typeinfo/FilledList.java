package forteen_typeinfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 2017/1/9.
 */
class CountedInteger {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return Long.toString(id);
    }
}

public class FilledList<T>{
    private Class<T> type;
    public FilledList(Class<T> type){
        this.type = type;
    }
    public List<T> create(int nElements){
        List<T> result = new ArrayList<T>();
        try{
            for (int i = 0;i<nElements;i++)
                result.add(type.newInstance());
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) {
        FilledList<CountedInteger> f1 =
                new FilledList<>(CountedInteger.class);
        System.out.println(f1.create(15));
        Class a = int.class;
        a.cast(a);
    }
}
