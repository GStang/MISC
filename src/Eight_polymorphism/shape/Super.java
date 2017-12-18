package Eight_polymorphism.shape;

/**
 * Created by DELL on 2017/1/4.
 */
public class Super {
    public int field = 0;
    public int getField(){
        return field;
    }
}
class Sub extends  Super{
    public int field =1 ;

    @Override
    public int getField() {
        return field;
    }

    public int getSuperField(){
        return super.field;
    }
}

