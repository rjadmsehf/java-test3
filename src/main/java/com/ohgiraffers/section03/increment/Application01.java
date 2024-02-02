package com.ohgiraffers.section03.increment;

public class Application01 {
    
    public static void main(String[] args) {
        
        /* 목표 증감연산자에 대해 이해하고 활용할 수 있다.*/
        /* 필기   
            증감연산자    
            - 피연산자의 앞 or 뒤에 사용이 가능하다.
            '++'1증가의 의미 
            '--'1감소의 의미 */
        
        int num = 20;
        System.out.println("num = " + num);
        
        num++;          // 1증가
        System.out.println("num = " + num);
        
        ++num;          // 1증가
        System.out.println("num = " + num);
        
        --num;          // 1감소
        System.out.println("num = " + num);

        num--;          // 1감소
        System.out.println("num = " + num);
        
        /* 목차 2 증감연산자를 다른 연산자와 함께 사용*/
        /* 필기
            주의사항
            증감연산자는 다른 연산자와 함께 사용 할때 의미가 달라진다!!!!
            다른 연산자와 함께 사용할 때 증감 연산자의 의미
            '++num' : 피연산자의 값을 먼저 1을 증가시킨 후 다른 연산을 진행함.
            'num++' : 다른 연산을 먼저 진행하고 난 뒤 마지막에 피연산자의 값을 1 증가 시킨다.
         */
        
        int firstNum = 20;

        int result1 = ++firstNum * 3;

        System.out.println("result1 = " + result1);
        System.out.println("firstNum = " + firstNum);

        int secondNum = 20;
        
        int result2 = ++secondNum * 3;

        System.out.println("result2 = " + result2);
        System.out.println("secondNum = " + secondNum);

        int num1 = 10;
        int addNum = num1++;

        System.out.println("addNum = " + addNum);

        System.out.println("num1 = " + num1);





    }
}
