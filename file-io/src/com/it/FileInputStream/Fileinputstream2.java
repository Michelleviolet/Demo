package com.it.FileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Fileinputstream2 {
    public static void main(String[] args) throws Exception {
        //一次读取文件全部字节
        //字节输入流对象代表字节输入流管道与源文件相通
        InputStream is=new FileInputStream("file-io\\src\\it02.txt");
        //循环读取
//        File f=new File("file-io\\src\\it02.txt");
//        long size=f.length();
//        byte[] buffer=new byte[(int) size];//与文件大小一样大
//        int len;//每次读了多少字节
//        len= is.read(buffer);
//        String rs=new String(buffer);
//        System.out.println(rs);
//        System.out.println(size);
//        System.out.println(len);
//
//        is.close();//关闭流
        byte[] buffer=is.readAllBytes();
        System.out.println(new String(buffer));

    }
}


