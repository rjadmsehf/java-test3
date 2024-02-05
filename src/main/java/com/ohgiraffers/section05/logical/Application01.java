package com.ohgiraffers.section05.logical;

public class Application01 {

    public static void main(String[] args) {

        /* 목표  논리 연산자에 대해 이해하고 활용할 수 있다 */
        /* 필기
            논리 연산자
            논리값(true or false) 를 취급하는 연산자이다.*/

        /* 필기
            논리 연산자의 종류
            1. 논리 연결 연산자 : 두 개의 피연산자를 가지는 이향 연산자이며, 연산자의 결합 방향은 왼쪽에서 오른쪽
                               두 개의 논리 식을 판단하여 참과 거짓을 판단한다.
                 1-1 && (논리 AND) 연산자 : 두 개의 논리식 모두 참 일 경우 침을 반환
                 둘 중 하나라도 거짓이면 거짓을 반환
                 (하나라도 거짓이면 반환)
                 1-2 || (논리 OR)  연산자 : 두 개의 논리식 중 둘 중 하나라도 참 일 경우 참을 반환,
                 둘 다 거짓이면 거짓을 반환
                 (둘중 하나라도 참이면 반환)
            2. 논리 부정 연산자
                2-1 ! (논리 NOT) 연산자 : 논리식이 결과가 참이면 거짓을, 거짓이면 참을 반환한다.


         */
         /* 목차 1 논리 연산자 결과값 확인*/
        System.out.println("true 와 true의 논리 and 연산 : "+   (true && true));
        System.out.println("true 와 false의 논리 and 연산 : "+  (true && false));
        System.out.println("false 와 true의 논리 and 연산 : "+  (false && true));
        System.out.println("false 와 false의 논리 and 연산 : "+ (false && false));

        System.out.println("=============================================");
        System.out.println("true 와 true 논리 or 연산 : " +   (true || true));
        System.out.println("true 와 false 논리 or 연산 : " +  (true || true));
        System.out.println("false 와 true 논리 or 연산 : " +  (false || true));
        System.out.println("false 와 false 논리 or 연산 : " + (false || false));

        System.out.println("=============================================");
        System.out.println("true의 논리 not 연산 : "  +  (!true));
        System.out.println("false의 논리 not 연산 : " +  (!false));





    }

    public int getInta() {
        return inta;
    }

    int getA() {
       return inta;
    }

    protected int getB() {
        return inta;
    }

    private int getC() {
        return inta;
    }

    int inta;

    //객체 생성할 때 type이 String이고, 변수명이 arg인 파라미터를 하나 받음 >> 생성자
    public Application01(int arg) {
        this.inta = arg; // arg를 받아서 클래스에 있는 type이 String이고, 변수명은 string인 변수에 arg를 대입
    }

    public int appMethod() {
        return inta; // string를 반환해줌
    }
}
