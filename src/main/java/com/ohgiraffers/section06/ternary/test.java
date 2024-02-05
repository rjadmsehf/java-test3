package com.ohgiraffers.section06.ternary;

public class test {

    public static void main(String[] args) {
        int num3 = 5;
        int num4 = 0;
        int num5 = -5;

//        char X = "음수다";  문자열 대입 연산자
        String X = "음수다";
        String Y = "0이다";
        String Z = "양수다";

        String result3 = (num3 > 0 ) ? "양수다" : (num3 == 0) ? "0이다" : X;
        String result4 = (num4 > 0 ) ? "양수다" : (num4 == 0) ? Y : X;
        String result5 = (num5 > 0 ) ? Z : (num5 == 0) ? Y : X;


        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);
        System.out.println("result5 = " + result5);



    }
}
