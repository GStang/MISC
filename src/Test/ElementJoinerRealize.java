package Test;

import java.util.Collection;

/**
 * Created by DELL on 2017/2/17.
 * 这是接口的实现类
 */
public class ElementJoinerRealize implements ElementJoiner {

    @Override
    public <T> String join(T[] ts, String delimiter) {
//        采用StringBuilder提高效率
        StringBuilder src = new StringBuilder();
        int i = ts.length;
//        采用foreach循环
        for (T t : ts) {
            src.append(t.toString()).append(delimiter);
        }
//        由于这种方式得到的字符串最后会多了一个分隔符，因此删掉它再return
        return src.deleteCharAt(src.length() - 1).toString();
    }

    @Override
    public <T> String join(Collection<T> ts, String delimiter) {
//         这个方法和上面的方法十分类似，这里不多写了
        StringBuilder src = new StringBuilder();
        for (T t : ts) {
            src.append(t.toString()).append(delimiter);
        }
        return src.deleteCharAt(src.length() - 1).toString();
    }
}
