package Homework;

import java.util.LinkedList;

/**
 * Created by DELL on 2016/11/5.
 */
public class LinkListTest {
    public static void main(String[] args) {
        LinkedList<Student> mylist = new LinkedList<Student>();
        Student stu1 = new Student("张小一",78);
        Student stu2 = new Student("王小二",98);
        Student stu3 = new Student("李大山",67);
        mylist.add(stu1);
        mylist.add(stu2);
        mylist.add(stu3);
        int number = mylist.size();
        System.out.println("现在链表中有" + number + "个结点");
        for (int i = 0;i<number;i++){
            Student temp = mylist.get(i);
            System.out.printf("第"+i+"节点中的数据,学生: %s,分数: %d\n",temp.getName(),temp.getScore());
        }
        Student removeStu = mylist.remove(1);
        System.out.printf("被删除掉的节点中的数据是:%s,%d\n",removeStu.getName(),removeStu.getScore());
        Student replaceStu =  mylist.set(1,new Student("赵钩林",68));
        System.out.printf("被替换的节点中的数据是:%2$s,%1$d\n",replaceStu.getScore(),replaceStu.getName());
        number = mylist.size();
        System.out.println("现在链表中有"+ number +"个节点");
        if (mylist.contains(stu1)){
            System.out.println("链表包含"+stu1+":");
            System.out.println(stu1.getName()+","+stu1.getScore());
        }else{
            System.out.println("链表中没有节点"+stu1);
        }
    }

}
class Student{
    private String name;
    private int score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public Student(String name,int score){
        this.name = name;
        this.score = score;
    }
}
