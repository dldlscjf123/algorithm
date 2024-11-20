package bruteforce.second.structure.struct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Vps {
    /*
    스택 괄호 문제
    */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());  // 테스트 케이스 수 입력
        for (int i = 0; i < N; i++) {
            Deque<Character> stack = new ArrayDeque<>();
            String string = br.readLine();
            boolean isValid = true;
            for (int j = 0; j < string.length(); j++) {
                char c = string.charAt(j);
                if(c == '('){
                    stack.push(c);
                } else if (c == ')') {
                    if(stack.isEmpty()){
                        isValid = false;

                    }else{
                        stack.pop();
                    }

                }

            }


            // 반복문이 끝난 후에도 스택에 여는 괄호가 남아있다면 유효하지 않음
            if (!isValid || !stack.isEmpty()) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
