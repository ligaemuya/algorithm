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
}
