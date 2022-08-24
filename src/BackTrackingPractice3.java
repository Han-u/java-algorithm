public class BackTrackingPractice3 {
    /*
        배열에 5지선다 문제 정답률이 적혀있을 때 3번 연속해서 같은 정답이 없는 경우가 없다는 것을
        알아낸 후 문제를 찍어서 푼다고 할 때 5점 이상 받을 경우의 수 출력
     */
    final static int numOfProblems = 10;
    static int cnt; // 경우의 수 카운트

    public static void solution(int[] sols){
        if(sols == null || sols.length != numOfProblems){
            return;
        }

        cnt = 0;
        int[] submit = new int[numOfProblems]; // 내 정답 배열
        backTracking(sols, submit, 0, 0);
        System.out.println(cnt);
    }

    public static void backTracking(int[] sols, int[] submit, int correctCnt, int idx){
        if(numOfProblems - idx + correctCnt < 5){ // 남은 문제를 풀어봤자 5점을 넘을 수 없는 상황
            return;
        }

        if(idx == numOfProblems){ // 다풀었는데
            if(correctCnt >= 5){ //5점 이상이면
                cnt += 1; // 카운트수 증가
            }
        } else {
            int towInRow = 0; // 같은 값을 두 번 썼을 때 체크
            if (idx >= 2){ // 두 문제 이상 푼 상황에서
                if(submit[idx - 1] == submit[idx - 2]){ // 연속값 정답이있으면
                    towInRow = submit[idx - 1];
                }
            }
            for (int i = 1; i <= 5; i++) {
                if(i == towInRow){ // 3번째 연속나오는거면
                    continue; // 패쓰
                }

                submit[idx] = i; // 정답을 이걸로 놓음
                if(sols[idx] == i){ // 내가 선택한 값과 정답이 같으면
                    backTracking(sols, submit, correctCnt + 1, idx + 1);
                }else{
                    backTracking(sols, submit, correctCnt, idx + 1);
                }
                submit[idx] = 0;
            }
        }
    }

    public static void main(String[] args){
        int[] sols = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        solution(sols);

        sols = new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
        solution(sols);
    }
}
