### 풀이

`brown + yellow`의 값이 전체 격자의 개수와 같고, 카펫의 세로 길이가 3부터 시작할 수 밖에 없기 때문에 `i`를 3부터 계속 올리면서 `i`가 `brown + yellow`의 약수가 되면 그 때의 `i`가 세로 길이가 된다.

#### 시간 복잡도

시간 복잡도는 O(N)이다.

### 소스 코드

```java
class Solution {
    public int[] solution(int brown, int yellow) {
        int n = brown + yellow;
        for (int i=3; n/i>=3; i++) {
            if (n % i == 0 && yellow == (i - 2) * (n/i - 2)) {
                int[] answer = {(n / i), i};
                return answer;
            }
        }
        return new int[]{};
    }
}
```