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