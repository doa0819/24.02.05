package com.ohgiraffers.section01.method;

public class Application08 {

    public static void main(String[] args) {

        /* 수업목표. static 메소드를 호출할 수 있다. */
        /* 필기.
        *   static 메소드 호출
        *   */

        /* 필기.
        *   static 메소드 호출하는 방법
        *   클래스명. 메소드명();  <- 이런 방식으로 호출한다.
        * */

        Application08.sumTwoNumbers(10, 20);
        System.out.println("10과 20의 합: " + Application08.sumTwoNumbers(10, 20));

        // static 는 new 라는 것을 쓰지 않아도 공간이 만들어 졌기 때문에 쓸 필요가 없다.
    // 메소드는 메인함수 를 만나야지 공간을 만들수 있지만 static 은 메인 함수를 안만나도 미리 공간을 만들어 둔다는의미이다.
    // main 은 static 를 사용하는데 미리 공간을 만들고 시작 한다는 것이다.

        /* 필기.
        *   동일한 클래스 내에 작성된 static 메소드는 클래스명이 생략 가능하다. */
        System.out.println("20과 30의 합: " + sumTwoNumbers(20, 30));
    }

    public static  int sumTwoNumbers(int first, int second){

        return first + second;
    }
}
