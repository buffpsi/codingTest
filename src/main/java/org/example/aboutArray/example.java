package org.example.aboutArray;

//n*n격자판에서 상하좌우 보다 본인이 높으면 +1점 몇점일까?
//탐색하기 위해서 알면 좋은 개념
// int [] dx = {-1,0,1,0} , int [] dy = {0,1,0,-1} ==> i + dx[k] , j + dy[k]
//위에 개념이면 첫번째 값은 행은 한칸 작아지고 열은 그대로니까 12시 -1, 0 -> 12시, 0,1 =>3시, 1,0=>6시 , 0,-1 =>9시
// 좀 헷갈렸던 개념인 dx ,dy에 대해서 다시한번 상기 시켜주는 예제
public class example {
    int [] dx = {-1,0,1,0};
    int [] dy = {0,1,0,-1};

    public int solution(int n, int [][] arr){
        int answer =0;
        for (int i =0; i<n; i++){
            for (int j=0; j<n; j++){
                //봉우리 판별 변수
                boolean flag=true;
                //아래는 4방향에 대해서 말하는거임
                for(int k=0; k<4; k++){
                    int nx = i+dx[k];
                    int ny = j+dy[k];
                    if ( nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny] >= arr[i][j]){
                        flag =false;
                        break;
                    }
                }
                if (flag) answer++;
            }
        }
        return answer;
    }
}
