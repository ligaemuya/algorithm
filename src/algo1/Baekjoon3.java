package algo1;

import java.util.LinkedList;
import java.util.Scanner;

public class Baekjoon3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> deque = new LinkedList<Integer>();
        System.out.println("deque = " + deque);

        int count = 0;
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            deque.offer(i);
            System.out.println("deque = " + deque);
        }

        int[] seq = new int[m];

        for (int i = 0; i < m; i++) {
            seq[i] = scanner.nextInt();
        }

        for (int i = 0; i < m; i++) {
            int target_idx = deque.indexOf(seq[i]);
            int half_idx;

            if (deque.size() % 2 == 0) {
                half_idx = deque.size() / 2 - 1;
            } else {
                half_idx = deque.size() / 2;
            }

            if(target_idx <= half_idx) {
                // idx 보다 앞에 있는 원소들을 모두 뒤로 보낸다. (2번 연산)
                for(int j = 0; j < target_idx; j++) {
                    int temp = deque.pollFirst();
                    deque.offerLast(temp);
                    count++;
                }
            } else {	// 중간 지점보다 원소의 위치가 뒤에 있는 경우
                // idx를 포함한 뒤에 있는 원소들을 모두 앞으로 보낸다. (3번 연산)
                for(int j = 0; j < deque.size() - target_idx; j++) {
                    int temp = deque.pollLast();
                    deque.offerFirst(temp);
                    count++;
                }
            }
            deque.pollFirst();	// 연산이 끝나면 맨 앞 원소를 삭제
        }
        System.out.println(count);
    }
}
