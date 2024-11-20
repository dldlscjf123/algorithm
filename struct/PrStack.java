package bruteforce.second.structure.struct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PrStack {
    /*
    [silver4]
    문제 명 : 스택
    기본적인 스택 메소드 사용해보는 문제
     */
    public static void main(String[] args) throws IOException {
        Deque<Integer> stack = new ArrayDeque<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            String[] parts = input.split(" ");

            String command = parts[0];
            switch (command) {
                case "push":
                    int value = Integer.parseInt(parts[1]);
                    stack.push(value);
                    break;
                case "pop":
                    // 스택이 비어있으면 -1 출력, 아니면 pop한 값 출력
                    System.out.println(stack.isEmpty() ? -1 : stack.pop());
                    break;
                case "size":
                    // 스택의 크기를 출력
                    System.out.println(stack.size());
                    break;
                case "empty":
                    // 스택이 비어있으면 1, 아니면 0 출력
                    System.out.println(stack.isEmpty() ? 1 : 0);
                    break;
                case "top":
                    // 스택이 비어있으면 -1 출력, 아니면 top 값 출력
                    System.out.println(stack.isEmpty() ? -1 : stack.peek());
                    break;
                default:
                    // 알 수 없는 명령어 처리
                    break;
            }
        }
    }
}
