package com.xuanxiao.io;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
    @Test
    public void test1(){
        FileReader fileReader = null;
        try {
            // 1.实例化File类对象，指明要操作的文件
            File file = new File("hello.txt");
            // 2.提供具体的流
            fileReader = new FileReader(file);
            // 3.数据的读入
            // read()：返回读入的一个字符，如果达到文件末尾，返回-1
            // 异常的处理：为了保证流资源一定可以执行关闭操作，需要使用try-catch-finally处理
            // 读入文件一定要存在，否则会报FileNotFoundException
            // 方式一
/*        int data = fileReader.read();
        while (data != -1){
            System.out.print((char) data);
            data = fileReader.read();
        }*/

            // 方式二
            int data;
            while ((data = fileReader.read()) != -1){
                System.out.print((char)data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.流的关闭操作
            try {
                if (fileReader!=null){
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //对read()操作升级：使用read的重载方法
    @Test
    public void test2() {
        FileReader fr = null;
        try {
            //1.File类的实例化
            File file = new File("hello.txt");
            //2.FileReader流的实例化
            fr = new FileReader(file);
            //3.读入的操作
            //read(char[] cbuffer)：返回每次读入cbuffer数组中的字符的个数。如果达到文件末尾返回-1
            char[] cbuffer = new char[5];
            int len;
            while ((len = fr.read(cbuffer)) != -1){
                //方式一
                //错误写法方式一
/*                for (int i = 0; i < cbuffer.length; i++) {
                    System.out.print(cbuffer[i]);
                }*/
                //正确写法方式一
/*                for (int i = 0; i < len; i++) {
                    System.out.print(cbuffer[i]);
                }*/
                //方式二
                //对应方式一的错误写法
/*                String str = new String(cbuffer);
                System.out.println(str);*/
                //正确写法方式二
                String str = new String(cbuffer,0,len);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr!=null){
                try {
                    //4.资源的关闭
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /*
       从内存中写出数据到硬盘文件中
       说明：
       1.输出操作，对应的File可以不存在，并不会报异常
       2.File对应的硬盘文件
         如果不存在：在输出的过程中，会自动创建此文件。
         如果存在：
            如果流使用构造器是FileWriter(file)或FileWriter(file，false)：对原有文件覆盖
            如果流使用构造器是FileWriter(file，true)：不会对原有文件覆盖，而是在原有文件基础上追加内容
     */
    @Test
    public void test3 () {
        FileWriter fw = null;
        try {
            //1.提供File类的对象，指明写出到的文件
            File file = new File("hello1.txt");
            //2.提供FileWriter的对象，用于数据写出
            //在new FileWriter对象时可以加参数，默认false是覆盖源文件，true是追加
            fw = new FileWriter(file);
            //3.写出的操作
            fw.write("I have a dream!\n");
            fw.write("you need to have a dream!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.资源流的关闭
            if (fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void testFileReaderFileWriter() {
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
