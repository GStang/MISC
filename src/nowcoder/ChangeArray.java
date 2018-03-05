package nowcoder;

/**
 * Created by DELL on 2018/3/2.
 */
public class ChangeArray {
    public void reOrderArray(int [] array) {

        int[] newarray = new int[array.length];
        int count = 0;
        for(int i=0;i<array.length;i++){
            if (array[i]%2!=0){
                newarray[count] = array[i];
                count++;
            }else{
                newarray[count] = array[i];
                count++;
            }
        }
        for (int i = 0;i<newarray.length;i++){
            System.out.println(newarray[i]);
        }

    }

    public static void main(String[] args) {
        int[] arary = {1,2,3,4,5,6};
        ChangeArray changeArray = new ChangeArray();
        changeArray.reOrderArray(arary);

    }
}
