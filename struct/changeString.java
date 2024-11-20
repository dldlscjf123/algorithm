package bruteforce.second.structure.struct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class changeString {
    /*
    단어 뒤집기
    문자열 추가 수정-- > 반복문 안에서는 StringBuilder사용생각하기!!!
    첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있으며,
    문장이 하나 주어진다. 단어의 길이는 최대 20, 문장의 길이는 최대 1000이다.
    단어와 단어 사이에는 공백이 하나 있다.
    */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());  // 테스트 케이스 수
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());  // 문장을 공백으로 구분
            while (st.hasMoreTokens()) {
                String word = st.nextToken();  // 단어 추출
                // StringBuilder를 사용하여 단어 뒤집기
                StringBuilder sb = new StringBuilder(word);
                System.out.print(sb.reverse().toString());  // 뒤집은 단어 출력
                System.out.print(" ");  // 단어 사이에 공백 출력
            }
            System.out.println();  // 각 테스트 케이스가 끝나면 줄바꿈
        }
    }
}
