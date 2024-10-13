package Print_Stream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintTest {
    public static void main(String[] args) {
        //打印流输出重定向
        System.out.println("老骥伏枥");
        System.out.println("志在千里");

        try (PrintStream ps=new PrintStream("file-io/src/it03.txt");
        ){
            System.setOut(ps);
            System.out.println("烈士暮年");
            System.out.println("壮心不已");
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
