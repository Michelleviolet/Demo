package com.it.SearchFile;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        searchFile(new File("D:/"),"YuanShen.exe");
    }

    /**
     * 去目录下寻找某个文件
     * @param dir
     * @param fileName
     * @throws IOException
     */

    public static void searchFile(File dir,String fileName ) throws IOException {
        if(dir==null||!dir.exists()||dir.isFile()){//无法搜索的情况
            return;
        }

        File[] files=dir.listFiles();//获取当前目录下全部一级文件对象

        //判断当前目录下是否存在一级文件对象，以及是否有权限获得文件对象
        if(files !=null && files.length>0){
            //遍历全部一级文件对象
            for (File file : files) {
                //如果对象是文件，判断是否是要找的文件
                if(file.isFile()){
                    if(file.getName().contains(fileName)){
                        System.out.println("找到了"+ file.getAbsolutePath());
                        Runtime runtime=Runtime.getRuntime();
                        runtime.exec(file.getAbsolutePath());
                    }

                }else{
                    //对象是文件夹，递归
                    searchFile(file,fileName);
                }


            }
        }


    }

}
