package bruteforce.second.structure.struct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class ArrayHapchigi {
    /*
    자료구조
    문제 : 배열 합치기
     구현 노트
     1. 두 배열이 주어지면 두 배열을 합쳐 정렬 하는 문제임
     2.  일단 두 배열을 받아보자 --> 해결
     3. 원래 있던 값은 추가 안해도 돼( 탐색) 하고 나서 추가해야함 -->
     4.오름 차순으로 정렬해야해

     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(str.nextToken());
        int M = Integer.parseInt(str.nextToken());
        int[] firstArray = new int[N];
        int[] secondArray = new int[M];
        int[] resultArray = new int[N+M];
        //첫번째 배열 입력 값 넣기
        str = new StringTokenizer(br.readLine());
        for (int i = 0; i < firstArray.length; i++) {
            resultArray[i] = Integer.parseInt(str.nextToken());
        }
        str = new StringTokenizer(br.readLine());
        for (int i = 0; i < secondArray.length; i++) {
            resultArray[i+N] = Integer.parseInt(str.nextToken());
        }
        System.out.println(Arrays.toString(resultArray));
        Arrays.sort(resultArray);
        System.out.println(Arrays.toString(resultArray));
        StringBuilder sb = new StringBuilder();
        for (int i : resultArray) {
            sb.append(i + " ");
        }
        System.out.println(sb.toString().trim());



    }

}

