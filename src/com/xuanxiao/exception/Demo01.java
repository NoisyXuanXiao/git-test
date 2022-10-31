package com.xuanxiao.exception;

public class Demo01 {
    public static void main(String[] args) {

        new Demo01().test(1,0);


/*        try {
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("出现异常，变量b不能为0");
        }finally {
            System.out.println("finally");
        }

*/

    }

    // 假设这方法中处理不了这个异常，方法上抛出异常
    public void test(int a,int b){
        if(b==0){
            throw new ArithmeticException();//主动抛出异常,一般在方法中使用
        }
    }

}
