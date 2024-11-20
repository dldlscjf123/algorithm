package bruteforce.second.structure.struct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class StackSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> stack = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();

        int next = 1; // 다음 푸시할 수
        boolean isValid = true; // 유효성 체크

        for (int i = 0; i < N; i++) {
            int inputValue = Integer.parseInt(br.readLine());

            while (next <= inputValue) {
                stack.push(next++);
                result.append("+\n");
            }

            if (!stack.isEmpty() && stack.peek() == inputValue) {
                stack.pop();
                result.append("-\n");
            } else {
                isValid = false;
                break;
            }
        }

        if (!isValid) {
            System.out.println("NO");
        } else {
            System.out.print(result);
        }
    }
}

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class StackSequence {
    public static void main(String[] args) throws IOException {
        *//*
        기능 구현 명세서
        1~n까지 오름차순으로 스택에 푸시된다
        푸시되면서 입력 수열을 만들 수 있는 지없는 지체크하는 문제
        예외 조건 : 4가 나오고 다음 2가 나오면 NO, 근데 이경우에 3이 이미 pop한 수라면 정상적으로 진행함
        정상 조건 : 4가 나오면 push 4번하고 pop한번해야 4가나옴
        일단 처음수는 무조건 push하고 , pop할 때는 stack의 마지막 수 와 inputValue가 같을 시 pop
        -- 주의 push할때도  중간에 pop된것들 건너 뛰어야함 즉 ) 배열의 1부터 n까지 수 넣어 놓고 사용해야할듯
        정리 : 배열에 1부터 N까지 수 넣어두고 -- 자료구조는 인덱스가 필요하면서 특정 값 빼려면 arratlist가 좋다고 생각했움
        pop한값은 배열에서도 지워주어야 한다
         *//*
        boolean resultBoolean = true;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> stack = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>(N);
        List<String> result = new ArrayList<>(N);
        for (int j = 1; j <=N; j++) {
            list.add(j);
        }
      //  System.out.println(list);
     for (int i = 0; i < N; i++) {
            int inputValue = Integer.parseInt(br.readLine());
     //    System.out.println("input value"  + inputValue);
            if(stack.isEmpty()){ //처음 수 일때
               // 푸시함
             //   pushStack(inputValue, 1, stack);
                for (int m = 1; m <= inputValue; m++) {
                    stack.push(m);
                    result.add("+");
                }
                list.remove(Integer.valueOf(inputValue));
           //     System.out.println("list"+list);
                stack.pop();
                result.add("-");
             //   System.out.println("stact"+stack);
            }else{
                if(inputValue == stack.getFirst()){
                    list.remove(Integer.valueOf(inputValue));
                    stack.pop();
                    result.add("-");
                 //   System.out.println("stact"+stack);
                  // System.out.println(list);
                } else if (inputValue > stack.getFirst()) {
                    for (Integer integer : list) {
                       if(integer > stack.getFirst() && integer<=inputValue){
                           stack.push(integer);
                           result.add("+");
                     //      System.out.println("stact"+stack);
                       //    System.out.println("list"+list);

                       }
                    }
                    list.remove(Integer.valueOf(inputValue));
                    stack.pop();
                    result.add("-");
                   // System.out.println("list"+list);
                } else if(inputValue < stack.getFirst()){
                    resultBoolean = false;
                }
            }
            // stack의 마지막 수와 inputValue가 같을 시 pop -- 이거 안되면 그냥 no하고 break
        }
     if(resultBoolean == false){
         System.out.println("NO");
     } else if (resultBoolean == true) {
         for (String string : result) {
             System.out.println(string);
         }
     }

    }*/


