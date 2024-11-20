package bruteforce.second.structure.struct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Que {
    // [silver4] que
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<String> que = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            String[] split = str.split(" ");
            String c = split[0];

            switch (c) {
                case "push":
                    String a = split[1];
                    que.offer(a);
                    break;

                case "pop":
                    if (que.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(que.poll());
                    }
                    break;

                case "size":
                    System.out.println(que.size());
                    break;

                case "empty":
                    System.out.println(que.isEmpty() ? "1" : "0");
                    break;
                case "front":
                    if (que.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(que.getFirst());
                    }
                    break;

                case "back":
                    if (que.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(que.getLast());
                    }
                    break;

                default:
                    break;
            }
        }
    }
}
