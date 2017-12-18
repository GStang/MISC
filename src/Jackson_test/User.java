package Jackson_test;

/**
 * Created by DELL on 2016/10/21.
 */
public class User {
    private int id;
    private String name;
    private String password;
    private int age;
    private String text;

    public String getText() {
        return text;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setText(String text) {
        this.text = text;
    }
}
