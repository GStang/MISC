package Eight_polymorphism.shape;

/**
 * Created by DELL on 2017/1/4.
 */
public class FieldAccess {
    public static void main(String[] args) {
        Super sup = new Sub();
        System.out.println("sup.field = " + sup.field + " ,sup.getField() =" + sup.getField());
        Sub sub = new Sub();
        System.out.println("sub.field =" + sub.field + " ,sub.getField() =" + sub.getField()+" ,sub.getSuperField() = "
                + sub.getSuperField());
    }
}
