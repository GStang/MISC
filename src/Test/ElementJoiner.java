package Test;

import java.util.Collection;

/**
 * Created by DELL on 2017/2/17.
 * 这是题目中给出的接口
 */
public interface ElementJoiner {
    public <T> String join(T[] ts,String delimiter);
    public <T> String join(Collection<T> ts, String delimiter);
}
