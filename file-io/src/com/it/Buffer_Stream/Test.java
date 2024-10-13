package com.it.Buffer_Stream;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Callable;

public class Test {
    public static void main(String[] args) {
        //恢复文件<出师表>的顺序并输出


        //2.行读取数据，创建缓存字符输入流
        try(
                BufferedReader br=new BufferedReader(new FileReader("file-io\\csb.txt"));
                BufferedWriter bw=new BufferedWriter(new FileWriter("file-io\\new-csb.txt"));
        ) {
            //1.定义一个集合存储每段
            ArrayList<String> data=new ArrayList<>();

            //3.按行读每段,存入到集合
            String line;
            while ((line = br.readLine()) != null) {
                data.add(line);
            }
            //排序
            Collections.sort(data);

            //遍历data写入新文件
            for (String ln : data) {
               bw.write(ln);
               bw.newLine();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
