package com.it;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws Exception {
        //复制任意类型文件
        //创建字节输入流管道
        InputStream is=new FileInputStream("file-io\\src\\it02.txt");
        //字节输出流管道
        OutputStream os=new FileOutputStream("file-io\\src\\it02copy.txt");

        //字节数组负责转移字节数据
        byte[] buffer=new byte[1024];//1KB
        int len;
        while((len=is.read(buffer))!=-1){
            os.write(buffer,0,len);
        }
        os.close();
        is.close();
        System.out.println("复制完成！");
    }
}
