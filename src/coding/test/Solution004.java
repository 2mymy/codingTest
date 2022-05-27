package coding.test;

/***
 * 뉴스 클러스터링
 * https://programmers.co.kr/learn/courses/30/lessons/17677
 */

class Solution004 {

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