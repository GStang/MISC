package Seven_reusing;

/**
 * Created by DELL on 2016/12/31.
 * protected是带有包访问权限的，在不同的包里面，是不能访问protected的。
 * 同时，继承与protected的类同样可以有访问权限的。
 * private访问权限即使是子类也是不能够访问的
 * 然而，如果向上转型为父类，那么就可以访问了。
 */
public class TestProtected {
    private void get(){
        System.out.println("subclass");
    }

    public static void main(String[] args){
        TestProtectedExtentd testProtectedExtentd = new TestProtectedExtentd();
        testProtectedExtentd.test();
        TestProtected testProtected = (TestProtected)testProtectedExtentd;
        testProtected.get();
    }
}

class TestProtectedExtentd extends TestProtected{
    public void test(){
        get();
    }


    public void get(){
//        super.get();
        System.out.println("extents_class");
    }
}
