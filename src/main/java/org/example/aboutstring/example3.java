package org.example.aboutstring;

import java.util.Scanner;
import java.util.StringTokenizer;

//한 문장을 받았을때 그 문장에서 가장 긴 단어를 찾기
public class example3 {
    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        StringTokenizer st = new StringTokenizer(str, " ");
        //해답 1 스트링 토크나이저를 통해서 해보기
        while (st.hasMoreTokens()) {
            String s = st.nextToken();
            int l = s.length();
            if (l > m) {
                answer = s;
            }
        }

//        해답2 split함수를 사용하기
//        String[] s = str.split(str);
//        for (String a : s){
//            int l = a.length();
//            if (l>m){
//                m = l;
//                answer = a;
//            }
//        }
        return answer;
    }

    public static void main(String[] args) {
        example3 e3 = new example3();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(e3.solution(str));
    }
}
