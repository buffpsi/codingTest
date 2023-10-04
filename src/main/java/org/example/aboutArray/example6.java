package org.example.aboutArray;

//주어진 배열에서 연속된 n번째의 합이 가장 큰 경우 찾기
//아래 처럼 하면 n^2만큼
public class example6 {
    //풀이 1번 2중 for문 돌리는 방법
//    public int solution(int arr[], int m) {
//        if(arr.length < m) return 0; // 배열의 길이가 m보다 작으면 0을 반환
//
//        int answer = 0;
//        for(int i=0; i<=arr.length-m; i++) { // 배열 범위 넘어가지 않도록 수정
//            int total = 0;
//            for(int j=0; j<m; j++) { // 연속된 m개의 수를 더함
//                total += arr[i+j];
//            }
//            if(total > answer) answer = total;
//        }
//
//        return answer;
//    }

    //for문을 2번 돌리는거 slicing하는거 옆으로 밀어가면서
    public int solution(int arr[], int m){
        int answer=0;
        //아래의 합으로 이제 하면된다
        int sum =0;

        //맨 처음 만들어 놓기
        for (int i=0; i<m; i++){
            sum += arr[i];
            answer = sum;
        }

        //이제 만들어놓은것부터 제일 첫번째 값 과 마지막값을 뺴고 더해가면불필요한 +연산 할 이유가 없음
        for(int i =m; i<arr.length;i++){
            sum += (arr[i]-arr[i-m]);
            answer = Math.max(answer,sum);
        }
        return answer;
    }
    public static void main(String args[]){
        int arr1[] = new int[5];
        int m = 1;
        for (int i=0; i<arr1.length; i++){
            arr1[i] = m;
            m++;
        }
        int e = new example6().solution(arr1 , 2);
        System.out.println(e);
    }
}
