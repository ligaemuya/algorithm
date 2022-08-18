package algo1;

public class BigO {

    public int div(int a, int b) {
      int count = 0;
      int sum = b;
        while (sum <= a) {
            sum += b;
            count++;
        }
        return count;

        //O(a/b) 만큼의 시간복잡도를가짐
    }

    public int sqrt(int n) {
        for (int g = 1; g * g <= n; g++) {
            if (g*g==n) return g;
        }
        return -1;

        //O(sqrt(n)) 만큼의 시간복잡도를가짐
    }

}
