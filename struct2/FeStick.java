package bruteforce.second.structure.struct2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class FeStick {
    /*
    [silver2] 쇠 막대기
    입력들어오면 레이저인지 막대기인지 구분
    막대기의 길이와 개수만 구하면 끝
    막대기 안에 레이저가 몇개있는지 레이저 개수 +1이 쪼개진 막대기 개수
    괄호가 열려있을 때  스택에 넣는다
    닫혀있을 때는

     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char str[] = br.readLine().toCharArray();
        Deque<Character> stack = new ArrayDeque<>();
        int result =0;
      int totalLength = str.length;
        for (int i = 0; i < totalLength; i++) {
            if(str[i]=='('){
                stack.push(str[i]);
            }else{
                stack.pop();
                if(str[i-1] =='('){
                    result += stack.size();
                }else{
                    result+=1;

                }
            }
        }
        System.out.println(result);


    }
}
