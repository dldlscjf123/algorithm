package bruteforce.second.structure.list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class ReverseStringV2 {
    /*
    문자열 S가 주어졌을 때, 이 문자열에서 단어만 뒤집으려고 한다.
    먼저, 문자열 S는 아래와과 같은 규칙을 지킨다.
    알파벳 소문자('a'-'z'), 숫자('0'-'9'), 공백(' '), 특수 문자('<', '>')로만 이루어져 있다.
    문자열의 시작과 끝은 공백이 아니다.

    --  태그의 조건
    '<'와 '>'가 문자열에 있는 경우 번갈아가면서 등장하며, '<'이 먼저 등장한다. 또, 두 문자의 개수는 같다.
    태그는 '<'로 시작해서 '>'로 끝나는 길이가 3 이상인 부분 문자열이고,
     '<'와 '>' 사이에는 알파벳 소문자와 공백만 있다. 단어는 알파벳 소문자와 숫자로 이루어진 부분 문자열이고,
      연속하는 두 단어는 공백 하나로 구분한다. 태그는 단어가 아니며, 태그와 단어 사이에는 공백이 없다.

      -- 구현
      1. 열린문자나오면 열림 flag true로 두고 닫힌 거 나올 때 sb.append
      2. 닫힌문자 나오면 닫힘 flag false
      3. flag false상태일때는 stack.push 근데 공백나오면 pop해서 sb.append
     */
    public static void main(String[] args) throws IOException {

        Deque<Character> stack = new ArrayDeque<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i)=='<'){
                while (!stack.isEmpty()){
                    sb.append(stack.pop());
                }
                flag = true;
            }
            else if (string.charAt(i) == '>') {
                flag = false;
                sb.append(string.charAt(i));
                continue;
            }
            if (flag == true) {
                sb.append(string.charAt(i));
            }
            else if (flag == false) {
                // 해당 인덱스의 i번째 문자가 공백일 경우, 모든 원소를 POP수행 후 공백 추가
                if (string.charAt(i) == ' ') {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(' ');
                    continue;
                } else {
                    // 그외의 경우, Stack에 문자 추가
                    stack.push(string.charAt(i));
                }
            }
            if (i == string.length() - 1) {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
            }


        }
        System.out.println(sb);

    }
}
