package algo1;

import java.util.Scanner;

public class Baekjoon1 {
    public static void main(String[] args) {
        printDog();
    }


    public static void printAB() {
        //        문제
//        두 정수 A와 `B`를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//        입력
//        첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
//        출력
//        첫째 줄에 A+B를 출력한다.
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a+b);
    }

    public static void printArmy() {
//        문제
//        ACM-ICPC 인터넷 예선, Regional, 그리고 World Finals까지 이미 2회씩 진출해버린 kriii는 미련을 버리지 못하고 왠지 모르게 올해에도 파주 World Finals 준비 캠프에 참여했다.
//        대회를 뜰 줄 모르는 지박령 kriii를 위해서 격려의 문구를 출력해주자.
//
//        입력
//        본 문제는 입력이 없다.
//
//        출력
//        두 줄에 걸쳐 "강한친구 대한육군"을 한 줄에 한 번씩 출력한다.
        System.out.println("강한친구 대한육군");
        System.out.println("강한친구 대한육군");
    }

    public static void printHelloworld() {
//        문제
//        Hello World!를 출력하시오.
//
//        입력
//        없음
//
//        출력
//        Hello World!를 출력하시오.
        System.out.println("Hello World!");
    }

    public static void printCat(){

        System.out.println("\\    /\\");
        System.out.println(" )  ( ')");
        System.out.println("(  /  )");
        System.out.println(" \\(__)|");
    }

    public static void printDog(){

        System.out.println("|\\_/|");
        System.out.println("|q p|   /}");
        System.out.println("( 0 )\"\"\"\\");
        System.out.println("|\"^\"`    |");
        System.out.println("||_/=\\\\__|");
    }



}
