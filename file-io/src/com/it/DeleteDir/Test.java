package com.it.DeleteDir;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        //删除非空文件夹
        File dir=new File("D:\\Download\\机密" );
        deleteDir(dir);
    }

    private static void deleteDir(File dir) {
        if(dir==null||!dir.exists()){
            return;
        }
        if(dir.isFile()){
            dir.delete();
            return;
        }
        //存在且是文件夹，拿里面的一级文件对象
        File[] files=dir.listFiles();
        if(files==null){
            return;
        }



        //文件夹有内容
        for (File file : files) {
            if(file.isFile()){
                file.delete();
            }else{
                deleteDir(file);
            }
        }

        dir.delete();


    }
}
