package part1.lesson10;

public class ContinueDemo {
    public static void main(String[] args) {
        labeled();
        unlabeled();
    }

    static void unlabeled() {
        for(int i = 0; i<= 10; i++) {
            if(i==6) {
                continue;
            }
            System.out.println(i);
        }
    }

    static void labeled() {
        search : for(int i = 0; i<= 10; i++) {
            for (int j = 0; j<= 10; j++){
                if(i == 3 && j == 3) {
                    continue search;
                    // A labeled continue statement skips the current iteration
                    // of an outer loop marked with the given label
                }
                System.out.println("i : " + i + ", j :" + j);
            }
        }
    }
}
