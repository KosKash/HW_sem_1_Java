import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Calc();
    }

    public static double Input_n() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Num");
        double num = iScanner.nextInt();
        return num;
    }

    public static String Input_op() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Oper");
        String o = iScanner.next();
        return o;
    }

    public static void Calc() {
        double num_1 = Input_n();
        String op = Input_op();
        double num_2 = Input_n();
        double result = 0;
        switch (op) {
            case "+":
                result = num_1 + num_2;
                break;
            case "-":
                result = num_1 - num_2;
                break;
            case "*":
                result = num_1 * num_2;
                break;
            case "/":
                result = num_1 / num_2;
                break;
            default:
                System.out.printf("Error! Enter correct operator");
                return;
        }
        boolean out = false;
        while (!out) {
            System.out.println(result);
            op = Input_op();
            num_1 = Input_n();
            switch (op) {
                case "+":
                    result = result + num_1;
                    break;
                case "-":
                    result = result - num_1;
                    break;
                case "*":
                    result = result * num_1;
                    break;
                case "/":
                    result = result / num_1;
                    break;
                case "":
                    out = true;
                
                default:
                    System.out.printf("Error! Enter correct operator");
                    return;
            }
        }
        System.out.println(result);
    }

}
