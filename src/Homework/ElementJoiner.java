package Homework;

import java.util.Collection;

/**
 * Created by DELL on 2016/11/13.
 */
public interface ElementJoiner {
    public <T> String join(T[] ts,String delimiter);
    public <T> String join(Collection<T> ts,String delimiter);
}
