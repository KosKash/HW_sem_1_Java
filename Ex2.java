public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Все простые числа от 1 до 1000");
        for (int i = 2; i < 1000; i++) {
            boolean flag = false;
            for (int j = 2; j < i-1; j++) {
                    if (i % j == 0) {
                        flag = true;
                    }
            }
            if (flag == false) {
                System.out.print(i+" ");
            }
        }
    }
}
