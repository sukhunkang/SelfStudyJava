package codingtest_level0;

class Exercise72 {
    public int[] solution(int n, int k) {
        int[] answer = {};
        answer = new int[n/k];
        for(int i=0; i<answer.length; i++) {
            answer[i]=k*(i+1);
        }
        return answer;
    }
}