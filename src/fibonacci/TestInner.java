package fibonacci;

import Homework.ceshi;

/**
 * Created by DELL on 2016/12/30.
 * 通过这个例子我学习到了，protected也是带有包访问权限的
 */
public class TestInner {
    public TestInnerClass getTestInnerClass() {
        return new TestInnerClass();
    }

    protected class TestInnerClass implements ceshi {
        @Override
        public void test() {

        }
    }
}
