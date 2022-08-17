import java.util.ArrayList;
import java.util.Collections;

class Activity{
    String name;
    int start;
    int end;

    public Activity(String name, int start, int end) {
        this.name = name;
        this.start = start;
        this.end = end;
    }
}

public class Greedy {
    /*
        그리디 알고리즘
        - 매 순간 현재 기준으로 최선의 답을 선택
        - 빠르게 근사치를 계산 가능
        - 결과는 최적해가 아닐 수도 있음
        - 두 가지 조건
            - 탐욕적 선택: 지금 선택이 다음 선택에 영향을 주지 않음
            - 최적 부분 구조: 전체 문제의 최적해는 부분 문제의 최적해로 이루어짐
     */

    public static void selectActivity(ArrayList<Activity> list){
        Collections.sort(list, (x1, x2) -> x1.end - x2.end); // 오름차순 정렬

        int curTime = 0;
        ArrayList<Activity> result = new ArrayList<>();
        for(Activity item: list){
            if (curTime <= item.start){
                curTime = item.end;
                result.add(item);
            }
        }

        for(Activity item:result){
            System.out.print(item.name + " ");
        }
        System.out.println();

    }

    public static void main(String[] args){
        ArrayList<Activity> list = new ArrayList<>();
        list.add(new Activity("A", 1, 5));
        list.add(new Activity("B", 4, 5));
        list.add(new Activity("C", 2, 3));
        list.add(new Activity("D", 4, 7));
        list.add(new Activity("E", 6, 10));
        selectActivity(list);
    }
}
