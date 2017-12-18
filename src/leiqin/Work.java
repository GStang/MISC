package leiqin;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by DELL on 2017/11/2.
 */
public class Work {
    String FileName;

    public Work(String FileName) throws IOException {
        this.FileName = FileName;
    }

    public void writeThing(Thing th, int n) throws Exception {
        //创建随机读写
        RandomAccessFile rafw = new RandomAccessFile(FileName, "rw");
        //将位置指示器移到指定位置上
        rafw.seek(n * 32);
        for (int i = 0; i < 8; i++)
            rafw.writeChar(th.Name[i]);//写入商品名
        rafw.writeInt(th.Number);//写入商品号码
        rafw.writeDouble(th.Price); //写入价格
        rafw.writeInt(th.Count);//写入商品库存量
        rafw.close();

    }
    //输入商品信息

    public void readThing(int n) throws Exception {
        char thingname[] = new char[8];
        RandomAccessFile rafr = new RandomAccessFile(FileName, "r");
        rafr.seek(n * 32);//将位置指示器移到指定位置上，每个商品占32个字节
        for (int i = 0; i < 8; i++)
            thingname[i] = rafr.readChar();//读到char商品名
        System.out.print("商品名:");
        System.out.println(thingname);
        System.out.println("编号:" + rafr.readInt());
        System.out.println("价格:" + rafr.readDouble());
        System.out.println("商品库存量:" + rafr.readInt());
        rafr.close();
        System.out.println();
    }

    //修改存入n号商品名字
    public void setThingName(int n, String name) throws Exception {
        RandomAccessFile rafw = new RandomAccessFile(FileName, "rw");
        rafw.seek(n * 32);
        char[] borrow = new char[8];
        if (name.toCharArray().length > 8)
            System.arraycopy(name.toCharArray(), 0, borrow, 0, 8);
        else
            System.arraycopy(name.toCharArray(), 0, borrow, 0, name.toCharArray().length);
        for (int i = 0; i < 8; i++)
            rafw.writeChar(borrow[i]);
        rafw.close();
    }    //修改存入n号商品价格

    public void setThingPrice(int n, double price) throws Exception {
        RandomAccessFile rafw = new RandomAccessFile(FileName, "rw");
        rafw.seek(n * 32 + 8 + 4); //将位置指示器移到指定位置上，每个商品占24个字节，名字占8字节
        rafw.writeDouble(price);
        rafw.close();
    }   //修改存入n号商品库存量

    public void setThingCount(int n, int count) throws Exception {

        RandomAccessFile rafw = new RandomAccessFile(FileName, "rw");
        rafw.seek(n * 32 + 8 + 4 + 8); //将位置指示器移到指定位置上，每个商品占24个字节，名字占8字节
        rafw.writeFloat(count);
        rafw.close();
    }

}
