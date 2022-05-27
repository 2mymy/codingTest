package coding.test;

/***
 * 내적
 */

class Solution003 {

    public static void main(String[] args) {

    }
    public int solution(int[] a, int[] b) {
        int answer = 0;

        for(int i = 0 ; i < a.length ; i++){
            answer = answer + a[i] * b[i];
        }

        return answer;
    }
}