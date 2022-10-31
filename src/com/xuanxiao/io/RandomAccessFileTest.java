package com.xuanxiao.io;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

    @Test
    public void test1(){

        RandomAccessFile raf1 = null;
        RandomAccessFile raf2 = null;
        try {
            raf1 = new RandomAccessFile(new File("dos命令.jpg"),"r");
            raf2 = new RandomAccessFile(new File("dos命令3.jpg"),"rw");

            byte[] buffer = new byte[1024];
            int len;
            while ((len = raf1.read(buffer)) != -1){
                raf2.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (raf1 != null){
                try {
                    raf1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (raf2 != null){
                try {
                    raf2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test2(){

        RandomAccessFile raf1 = null;
        try {
            raf1 = new RandomAccessFile(new File("hello4.txt"), "rw");
            //把指针指到参数的索引处，在进行操作
            raf1.seek(4);
            //write方法需要传一个byte数组，所以把字符串通过getBytes方法转化为byte数组。
            //write方法就是覆盖效果。
            raf1.write("aaa".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (raf1 != null){
                try {
                    raf1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
