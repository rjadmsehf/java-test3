package com.ohgiraffers.section05.logical;

public class Application02 {
    public static void main(String[] args) {

        /* 목표 논리연산자의 우선순위에 대해 이해하고 이를 활용할 수 있다
        *  필기
        *   논리연산자의 우선순위와 활용
        *   논리 & 연산자와 논리 | 연산자의 우선순위
        *   && : 11순위
        *   || : 12순위
        *   논리 %% 연산자의 우선순위가 논리 || 연산자 우선순위 보다 높다.
        */

        /* 목차 1. 1부터 100 사이의 값인지 확인*/
        int num1 = 55;
        System.out.println("1부터 100 사이인지 확인 : " +(num1 >= 1 && num1 <= 100));

        int num2 = 166;
        System.out.println("1부터 100 사이인지 확인 : " +(num2 >= 1 && num2 <= 100));

        /* 목차 2. 영어 대문자인지 확인*/
        char ch1 = 'G';
        int converCharToint = ch1;
        System.out.println(converCharToint); //
        
        int converIntochar = 100;
        char result = (char)converIntochar;

        System.out.println("result = " + result);
        // 의문점 a~z 까지

        System.out.println("영어 대문자인지 확인 : " + (ch1 >= 'A' && ch1 <= 'Z'));

        char ch2 = 'g';
        System.out.println("영어 소문자인지 확인 = " + (ch2 >= 'a' && ch2 <= 'z'));

        /* 목차 3. 대소문자 상관 없이 영문자 y 인 지 확인*/
        char ch3 = 'Y';
        System.out.println("영문자 y 인지 확인  = " + (ch3 == 'y' || ch3 == 'Y'));
        
        /* 목차 4. 영문자인지 확인 */
        char ch5 = 'f';
        System.out.println("영문자인지 확인  = " + ((ch5 >= 'A' && ch5 <= 'Z') || (ch5 >= 'a' && ch5 <= 'z'))); // 기쁘다

        char ch6 = 'F';
        System.out.println("영문자인지 확인  = " + (ch6 >= 'A' && ch6 <= 'Z' ||(ch6 <= 'a' && ch6 <= 'z')));
        














    }
}
