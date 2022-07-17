import java.util.ArrayList;

class MySet{
    //ArrayList
    ArrayList<Integer> list;

    // 생성자1
    MySet(){
        this.list = new ArrayList<Integer>();
    }

    // 생성자2
    MySet(int[] arr){
        this.list = new ArrayList<Integer>();
        for(int item: arr){
            this.list.add(item);
        }
    }

    // 원소 추가
    public void add(int x){
        for (int item: this.list){
            if(item == x){
                return ;
            }
        }
        this.list.add(x);
    }


    // 교집합
    public MySet retainAll(MySet b){
        MySet result = new MySet();
        for(int itemA: this.list){
            for(int itemB: b.list){
                if(itemA == itemB){
                    result.add(itemA);
                }
            }
        }
        return result;
    }


    // 합집합
    public MySet addAll(MySet b){
        MySet result = new MySet();

        for(int itemA: this.list){
            result.add(itemA);
        }
        for(int itemB: b.list){
            result.add(itemB);
        }
        return result;
    }


    // 차집합
    public MySet removeAll(MySet b){
        MySet result = new MySet();

        for(int itemA: this.list) {
            boolean containFlag = false;

            for (int itemB : b.list) {
                if (itemA == itemB) {
                    containFlag = true;
                    break;
                }
            }
            if (!containFlag) {
                result.add(itemA);
            }
        }
        return result;
    }
}

public class SetPractice {
    public static void main(String[] args){
        MySet a = new MySet();

        a.add(1);
        a.add(1);
        a.add(1);
        a.add(2);
        a.add(3);

        a = new MySet(new int[]{1, 2, 3, 4, 5});
        MySet b = new MySet(new int[]{2, 4, 6, 8, 10});
        MySet result = a.retainAll(b);
        System.out.println("result = " + result.list);
        result = a.addAll(b);
        System.out.println("result = " + result.list);
        result = a.removeAll(b);
        System.out.println("result = " + result.list);
    }
}
