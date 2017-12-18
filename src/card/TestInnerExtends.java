package card;

import Homework.ceshi;
import fibonacci.TestInner;

/**
 * Created by DELL on 2016/12/30.
 */
public class TestInnerExtends extends TestInner {
    public ceshi response() {
        TestInnerExtends innerExtends = new TestInnerExtends();
        TestInner inner = new TestInner();
//        TestInnerClass innerClass = inner.getTestInnerClass();
        ceshi ceshi =  inner.getTestInnerClass();;
        return ceshi;
    }
}
