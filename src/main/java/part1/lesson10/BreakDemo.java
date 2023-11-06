package part1.lesson10;

public class BreakDemo {
    public static void main(String[] args) {
        unLabeled();
        labeled();
    }


    static void unLabeled() {
        for(int i = 0; i<= 10; i++) {
            System.out.println(i);
            if(i==6) {
                break;
            }
        }
    }

    static void labeled() {
        search : for(int i = 0; i<= 10; i++) {
            for (int j = 0; j<= 10; j++){
                System.out.println("i : " + i + ", j :" + j);
                if(i == 3 && j == 3) {
                    break search;
                }
            }
        }
    }
}
