import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
    System.out.println("Input N ");
    int n = Input_n();
    System.out.println("N Треугольного числа от " + n + " = " + Triang(n));
    System.out.println("Факториал " + n + " = " + Fact(n));
    } 
    public static int Input_n(){
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        iScanner.close();
        return n;
    }
    public static int Triang(int n){
        int result = (n*(n+1))/2;
        return result;
    }
    public static int Fact(int n){
        int num = 1;
        int result = 1;
        while (num != n+1){
            result *= num;
            num++;
        } 

    
    
        return result;
    } 

}


