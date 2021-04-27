package TestPackage;
/*
输出1-100的素数，并要求每8个换一行
 */

public class Sushu {
    public static void main(String[] args) {
        int count = 0;       //计数
        for (int i = 2; i <=100; i++) {
            boolean isSuShu = true;   //标记
            for(int j = 2;j<i;j++){
                if(i%j==0){
                    isSuShu = false;
                    break;
                }
                }
            if(isSuShu){
                System.out.print(i+"   ");
                count++;
                if(count % 8==0){
                    System.out.println();
                }

            }

        }
    }
}
