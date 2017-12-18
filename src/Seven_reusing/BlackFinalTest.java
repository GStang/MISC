package Seven_reusing;

/**
 * Created by DELL on 2016/12/31.
 * Java中允许空白final，意思是在声明一个final变量或者引用的时候
 * 可以不对它进行初始化，
 * 但是Java虚拟机会要求你在构造函数中必须对它进行初始化
 * 这样才不会造成错误
 */
public class BlackFinalTest {
    final Value value;

    public BlackFinalTest(Value value) {
        this.value = value;
    }

    public static void main(String[] args) {
    }
}
