package coding.test;


import java.util.Arrays;

class Solution002 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19})));
        System.out.println(Arrays.toString(solution(new int[]{0, 0, 0, 0, 0, 0}, new int[]{38, 19, 20, 40, 15, 25})));
        System.out.println(Arrays.toString(solution(new int[]{45, 4, 35, 20, 3, 9}, new int[]{20, 9, 3, 45, 4, 35})));
    }
    public static int[] solution(int[] lottos, int[] win_nums) {

        int[] answer = new int[2];

        int min = 0, max = 0;

        for(int num : lottos){
            if (num == 0) {
                max++;
            //}else if(Arrays.asList(win_nums).contains(num)){
            } else if(Arrays.stream(win_nums).anyMatch(win->win==num)){
                min++;
            }
        }

        System.out.println(max);
        System.out.println(min);


        answer[0]=getPlace(min+max);
        answer[1]=getPlace(min);

        return answer;
    }

    public static int getPlace(int i){
        switch(i){
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;
        }
    }
}