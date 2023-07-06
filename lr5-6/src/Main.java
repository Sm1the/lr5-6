import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] massive = {-2,-1,0,1,2};
        int a;
        Scanner sc = new Scanner(System.in);
        try {
            a = sc.nextInt();
            massive[a-1] = 4/a;
            System.out.println(massive[a]);
        }catch (ArithmeticException e){
            System.out.println("Произошла недопустимая арифметическая операция.");
            System.out.println(e+"");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Обращение по недопустимому индексу массива.");
            System.out.println(e+"");
        }catch (Exception e){
            System.out.println("Произошло еще какое-то исключение.");
            System.out.println(e+"");
        }
    }
}
