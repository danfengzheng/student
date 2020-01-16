package com.zhengdf.one;

import com.zhengdf.one.service.FootBall;

/**
 * @ClassName Test
 * @Description TODO
 * @Author zhengdf
 * @Date 2020/1/16 14:42
 * @Version 1.0
 * @Memo Anonymous  匿名类测试
 **/
public class Test {
    public static FootBall footBall = new FootBall() {
        @Override
        public void kick() {
            System.out.println("Nested Anonymous Class.");
        }
        @Override
        public void get() {

        }

        @Override
        public String toString(){
            System.out.println("toString");
            return "toString";
        }
    };
    public static void main(String[] args) {

        FootBall footballObject = new FootBall()
        {
            @Override
            public void kick()
            {
                System.out.println("Anonymous Class");
            }

            @Override
            public void get() {

            }
        };
        footballObject.kick();

        Test.footBall.toString();

    }
}
