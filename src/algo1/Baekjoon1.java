package algo1;

import java.util.Scanner;

public class Baekjoon1 {


    public static void main(String[] args) {
//        문제
//        두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//        입력
//        첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
//        출력
//        첫째 줄에 A+B를 출력한다.
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        print(a,b);
    }


    public static void print(int a, int b) {
        System.out.println("출력 = " + a+b);
    }
}
