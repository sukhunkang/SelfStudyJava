package codingtest_level0;

class Exercise68 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        answer = new int[n];
        for(int i=0; i<n; i++) {
            answer[i] = num_list[i];
        }
        return answer;
    }
}