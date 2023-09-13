# advancedExampleString

## Example 1: 문자열에서 특정 문자까지의 최소 거리 출력하기

### 문제 설명
문자열 s가 주어질 때, 각 문자 위치에서 문자 t까지의 최소 거리를 순차적으로 출력하세요.
문자열 s의 최대 길이는 1000입니다.

예를 들어, s = "taechakt" 이고 t='a' 라면 결과는 다음과 같습니다:

1 0 1 2 1 0 1 2

해당 문제를 풀기위한 알고리즘은
1. a가 왼쪽기준에서 먼지 오른쪽 기준에서 먼지 모르기때문에 좌->우 방향, 우 -> 좌방향으로 계산하는 방법을 생각했다
그림으로 생각해보면

### 알고리즘 설명
이 문제를 해결하기 위한 알고리즘은 다음과 같습니다:

1. 'a'가 왼쪽 기준에서 얼마나 떨어져 있는지, 오른쪽 기준에서 얼마나 떨어져 있는지 모르기 때문에, 좌 -> 우 방향과 우 -> 좌 방향으로 각각 계산합니다.
2. 처음에 't' 왼쪽에는 'a'가 없으므로 일단 최대 숫자인 1000으로 설정합니다
3. 좌->우가 끝낫으면 반대 방향으로도 하면된다 거기서 최솟값을 비교해서 넣어주면된다

# 포인트
문자열을 일일히 비교한다? x
비교를 할때도 해당 cnt 변수를 사용해서 더 쉽게 파악 할 수 있다.

---