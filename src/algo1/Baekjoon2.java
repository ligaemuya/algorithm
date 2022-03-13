package algo1;

import java.util.Scanner;

public class Baekjoon2 {

    public static void main(String[] args){
        test();
    }




    public static void test() {
        //        문제
//        두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
//        입력
//        첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
//         출력
//        첫째 줄에 다음 세 가지 중 하나를 출력한다.
//        A가 B보다 큰 경우에는 '>'를 출력한다.
//        A가 B보다 작은 경우에는 '<'를 출력한다.
//        A와 B가 같은 경우에는 '=='를 출력한다.
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        if(a > b) {
            System.out.println(">");
        } else if(a<b){
            System.out.println("<");
        } else if (a == b) {
            System.out.println("==");
        }
    }


    public static void test2() {
//        문제
//        시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
//        입력
//        첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
//        출력
//        시험 성적을 출력한다.
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        if(a>= 90){
            System.out.println("A");
        } else if (a >= 80){
            System.out.println("B");
        } else if (a>= 70){
            System.out.println("C");
        } else if (a>= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }

    public static void test3() {
//        문제
//        연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
//        윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
//        예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 하지만, 2000년은 400의 배수이기 때문에 윤년이다.
//        입력
//        첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
//        출력
//        첫째 줄에 윤년이면 1, 아니면 0을 출력한다.
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        if(a%4 == 0) {
            if(a%400 == 0){
                System.out.println("1");
            } else if (a%100 == 0){
                System.out.println("0");
            } else {
                System.out.println("1");
            }
        } else {
            System.out.println("0");
        }
    }
}
