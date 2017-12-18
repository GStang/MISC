package leiqin;

/**
 * Created by DELL on 2017/11/2.
 */
public class Thing {
    char Name[] = new char[8];//16个字节
    int Number; //4个字节
    double Price;//8个字节
    int Count;//4个字节 所以保存一个商品要32个字节

    public Thing(String name, int number, double price, int count) {
        if (name.toCharArray().length > 8)
            System.arraycopy(name.toCharArray(), 0, this.Name, 0, 8);//如果字符长度大于8，只取前8个   else
        System.arraycopy(name.toCharArray(), 0, this.Name, 0, name.toCharArray().length);//如果字符长度小于8，有几个填几个
        this.Number = number;
        this.Price = price;
        this.Count = count;
    }

    public String getName() {
        return new String(this.Name);
    }

    public void setName(String name) {
        if (name.toCharArray().length > 8)
            System.arraycopy(name.toCharArray(), 0, this.Name, 0, 8);
        else
            System.arraycopy(name.toCharArray(), 0, this.Name, 0, name.toCharArray().length);
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        this.Price = price;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        this.Number = number;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        this.Count = count;
    }
}

