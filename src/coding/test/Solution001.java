package coding.test;


import java.util.Stack;

class Solution001 {

    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{0,2,4,4,2},{0,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        System.out.println(solution(board, moves));
    }
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;

        //stack 구조
        Stack<Integer> stack = new Stack<>();

        for(int i: moves){
            System.out.println("getting number[" + i + "]");
            for (int j = 0; j < board.length; j++) {
                System.out.print("#");
                System.out.print(board[j][0]);
                System.out.print(board[j][1]);
                System.out.print(board[j][2]);
                System.out.print(board[j][3]);
                System.out.print(board[j][4]);
                System.out.println("#");
                if(board[j][i-1] != 0){
                    if(!stack.empty()) {
                        if (stack.peek() == board[j][i-1]) {
                            answer = answer+2;
                            stack.pop();
                            board[j][i-1] = 0;
                            break;
                        }
                    }
                    stack.add(board[j][i-1]);
                    board[j][i-1] = 0;
                    break;
                }
            }
            System.out.println(stack.toString());
        }
        return answer;
    }
}