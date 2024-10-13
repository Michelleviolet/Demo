package com.it.FileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

/**
 * 文件字符输入流每次读取一个字符
 */
public class FileReaderTest1 {
    public static void main(String[] args) {
        //1.创建管道
        try( Reader fr=new FileReader("file-io\\src\\it001.txt");
        ) {
//           //2.读取文本文件的内容
//            int c;
//            while((c=fr.read())!=-1){
//                System.out.print((char)c);
//            }

            //3.每次读多个字符
            char[] buffer=new char[3];
            int len;
            while((len=fr.read(buffer))!=-1){
                System.out.print(new String(buffer, 0, len));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
