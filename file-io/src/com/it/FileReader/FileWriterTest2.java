package com.it.FileReader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 文件字符输出流，写字符数据出去
 */
public class FileWriterTest2 {
    public static void main(String[] args) {
        //创建文件字符输出流管道
        try (Writer fw=new FileWriter("file-io\\src\\it02out.txt");){
            //写一个字符出去
            fw.write('a');
            fw.write('a');
            fw.write('中');
            fw.write("\r\n");

            //写一个字符串出去
            fw.write("我爱你中国abc");
            fw.write("\r\n");

            //写字符串的一部分
            fw.write("我爱你中国ABC",0,5);
            fw.write("\r\n");

            //写一个字符数组出去
            char[] buffer={'黑','马','a','b','c'};
            fw.write(buffer);
            fw.write("\r\n");

            //写字符数组的一部分
            fw.write(buffer,0,2);
            fw.write("\r\n");




        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
