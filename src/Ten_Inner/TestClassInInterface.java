package Ten_Inner;

/**
 * Created by DELL on 2017/1/6.
 * 这里展示了一个组合的用法，Test中里面组合了TestClass对象
 * 然后就可以直接调用TestClass对象中的方法
 */
public class TestClassInInterface {
//    TestClass testClass = new TestClass();

    public static void main(String[] args) {
//        TestClass testClass = new TestClass();
//        testClass.f();
        Test test = new Test();
        test.testClass.f();
    }
}

class Test implements ClassInInterface{
    TestClass testClass = new TestClass();

    public TestClass getTestClass() {
        return testClass;
    }
}
