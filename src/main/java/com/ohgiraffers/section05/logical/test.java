package com.ohgiraffers.section05.logical;

public class test {
    public static void main(String[] args) {


//        byte bnum = 1;
//        bnum++;
//        ++bnum;
//        ++bnum;
//        bnum++;
//        System.out.println(bnum);
//        System.out.println(" 안녕하세여 ");

        Application01 application01 = new Application01(10); // type이 Application01 이고, 변수명이 application01인 객체 생성
        Application01 application02 = new Application01(20); // type이 Application01 이고, 변수명이 application02인 객체 생성


        System.out.println(application01.appMethod());
        System.out.println(application02.appMethod());


    }
}
