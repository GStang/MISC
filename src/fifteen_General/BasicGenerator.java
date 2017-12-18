package fifteen_General;

/**
 * Created by DELL on 2017/3/2.
 */
public class BasicGenerator<T> implements Generator<T> {
    private Class<T> type;

    @Override
    public T next() {
        try {
            return type.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public BasicGenerator(Class<T> type) {
    }

    public static <T> BasicGenerator create(Class<T> type) {
        return new BasicGenerator<T>(type);
    }
}
