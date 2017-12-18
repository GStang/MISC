package nintheen_enumerated;

/**
 * Created by DELL on 2017/1/19.
 */
public enum OzWitch {

    WEST("Miss Gulch ,aka the Wiched Witch of the West"),
    NORTH("Glinda , the Good Witch of the North"),
    EAST("Wiched Witch of the East ,wearer of th Ruby" +
            "Slippers ,crushed by Dorothy's house"),
    SOUTH("Good by inference,bu missing");
    private String description;

    //变量的定义需要在枚举类型的申明之后
    OzWitch(String description) {

        this.description = description;

    }

    public static void main(String[] args) {
        for (OzWitch witch : OzWitch.values()){
            System.out.println(witch+":"+witch.getDeclaringClass());
        }
    }
}
