package com.xuanxiao.io;

import org.junit.Test;

import java.io.*;

public class InputStreamReaderTest {

    /*
       InputStreamReader的使用，实现字节流到字符流的输入流的转换
     */
    @Test
    public void test1() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("hello.txt");
            //InputStreamReader isr = new InputStreamReader(fis);//使用系统默认的字符集
            //参数2指明了字符集，具体使用哪个字符集，取决于文件保存时使用的字符集
            InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
            char[] cbuf = new char[10];
            int len;
            while ((len = isr.read(cbuf)) != -1){
                String str = new String(cbuf,0,len);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test2() {

        InputStreamReader isr = null;
        OutputStreamWriter osw = null;
        try {
            File file1 = new File("hello.txt");
            File file2 = new File("hello3_gbk.txt");

            FileInputStream fis = new FileInputStream(file1);
            FileOutputStream fos = new FileOutputStream(file2);

            isr = new InputStreamReader(fis,"UTF-8");
            osw = new OutputStreamWriter(fos,"gbk");

            char[] cbuf = new char[20];
            int len;
            while ((len = isr.read(cbuf)) != -1){
                osw.write(cbuf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (isr != null){
                try {
                    isr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (osw != null){
                try {
                    osw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
