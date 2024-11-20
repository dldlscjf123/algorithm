package bruteforce.second.structure.struct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Josephus {
    /*
    1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 K(≤ N)가 주어진다.
    이제 순서대로 K번째 사람을 제거한다. 한 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다.
    이 과정은 N명의 사람이 모두 제거될 때까지 계속된다. 원에서 사람들이 제거되는 순서를 (N, K)-요세푸스 순열이라고 한다.
    예를 들어 (7, 3)-요세푸스 순열은 <3, 6, 2, 7, 5, 1, 4>이다.
    N과 K가 주어지면 (N, K)-요세푸스 순열을 구하는 프로그램을 작성하시오.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> que = new ArrayDeque<>();
        Deque<Integer> resultQue = new ArrayDeque<>();
        String str = br.readLine();
        String[] input = str.split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        for (int i = 0; i < N; i++) {
            que.offer(i + 1);
        }
        while (!que.isEmpty()) {
            for (int i = 1; i < M; i++) {
                Integer poll = que.poll();
                que.offer(poll);
            }
            resultQue.offer(que.poll());
        }
        System.out.print("<");
        for (Integer i : resultQue) {
            if (i == resultQue.getLast()) {
                System.out.print(i);
            } else {
                System.out.print(i + ", ");
            }
        }
        System.out.println(">");
    }
}
