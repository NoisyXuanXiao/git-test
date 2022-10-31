package com.xuanxiao.io;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileInputOutputStreamTest {
    
    @Test
    public void  test1(){
        FileReader fr = null;
        FileWriter fw = null;
        try {
            //1.创建File类对象，指明读入和写出的文件
            File srcFile = new File("hello.txt");
            File destFile = new File("hello2.txt");
            //2.创建输入流和输出流的对象
            fr = new FileReader(srcFile);
            fw = new FileWriter(destFile);
            //3.数据的读入和写出操作
            char[] cbuffer = new char[5];
            int len;//记录每次读入到cbuffer数组中的字符的个数
            while ((len = fr.read(cbuffer)) != -1){
                //每次写出len个字符
                fw.write(cbuffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭资源流
            if (fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
