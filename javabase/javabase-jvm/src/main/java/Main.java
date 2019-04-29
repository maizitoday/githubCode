import java.util.Random;

/**
 * @author yubo
 * @version V2.0
 * @Description:
 * @date 2019/4/22 下午2:51
 * @Company: cecsm.com
 * @Copyright Copyright (c) 2017
 */
public class Main {
    public static void main(String[] args){
        try {
            String str = "maizi-today";
            while (true)
            {
                str = str + new Random().nextInt(1000000)+new Random().nextInt(999999);
            }
        }catch (Throwable e){
            System.out.println("  JVM OOM 错误   ");
           e.printStackTrace();
        }


    }

}
