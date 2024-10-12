package com.it.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Fileinputstream {
    public static void main(String[] args) throws Exception {
        //字节输入流对象代表字节输入流管道与源文件相通
        InputStream is=new FileInputStream("file-io\\src\\it01.txt");
        //循环读取
        byte[] buffer=new byte[3];//桶大小为3个字节,可能截断汉字，导致乱码
        int len;//每次读了多少字节
        while ((len= is.read(buffer))!=-1){
            //读多少，倒出多少
            String rs=new String(buffer,0,len);
            System.out.print(rs);
        }
        is.close();//关闭流
    }
}


