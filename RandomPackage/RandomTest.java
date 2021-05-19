package RandomPackage;
import java.util.Random;
/*
生成0-5的五个随机数，使其不能重复出现，若重复出现，重新生成，否则放入数组中
 */
public class RandomTest {
    public static void main(String[] args) {
        //创建一个数组长度为5的一维数组：
        int[] arr = new int[5];  //默认全为0

        Random random = new Random();

        //给数组中每一个元素赋值-1，排除0的干扰：
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        //初始化数组下标：
        int index = 0;

        //生成0-5的五个随机数，使其不能重复出现，若重复出现，重新生成，否则放入数组中：
        while (index < arr.length){
            int num = random.nextInt(6);  //随机生成一个0-5的随机数

            //如果数组中的元素和生成的元素不同，则放入数组中：
            if (!contanis(arr,num)){
                arr[index] = num;
                index++;
            }
        }

        //输出数组中的元素：
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }

    //自定义一个方法，判断生成的随机数是否已经包含在数组中：
    public static boolean contanis(int[] arr,int key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return true;

        }
        return false;

    }
}
