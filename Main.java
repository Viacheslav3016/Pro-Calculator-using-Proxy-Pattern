import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        boolean programEnd = false;
        do {
            System.out.println("Варіант 5");
            System.out.println("Программа калькулятор");
            System.out.println("Натисніть 1 щоб ввійти в стандартний режим та почати робити обчислення.\nНатисніть 2 щоб перейти в інженерний режим  \nНастисніть 0 щоб вийти з программи");
            int n = parseInt(sc.nextLine());
            if (n == 1) {
                System.out.println("Яку операцiю бажаєте виконати?(+, -, *, / )");  }
            if (n == 2) {
                System.out.println("Будь ласка виберіть одну з операцій(+ - * / або Lg())"); }
            String Operation = sc.nextLine();
            if (!Operation.equals("Lg()")) { n = 3; }
            if (Operation.equals("Lg()")) { n = 4; }
            if (n == 3) {
                try {

                    IMath proxy = MathProxy.getInstance();

                        System.out.print("Перше число: ");
                        double TheFirstNumber = Double.parseDouble(sc.nextLine());
                        System.out.print("Друге число: ");
                        double TheSecondNumber = Double.parseDouble(sc.nextLine());
                        if (Operation.equals("+")){
                                System.out.print("Сумма введених чисел дорiвнює: ");
                                System.out.print(proxy.Addition(TheFirstNumber, TheSecondNumber));}

                            else if (Operation.equals("-")){
                                System.out.print("Рiзниця введених чисел дорiвнює: ");
                                System.out.print(proxy.Subtraction(TheFirstNumber, TheSecondNumber));}

                            else if (Operation.equals("*")){
                                System.out.print("Добуток введених чисел дорiвнює: ");
                                System.out.print(proxy.Multiplication(TheFirstNumber, TheSecondNumber));}

                            else if (Operation.equals("/")){
                                    if (proxy.Division(TheFirstNumber, TheSecondNumber) != 0) {
                                        System.out.println("Частка введених чисел дорівнює: ");
                                        System.out.println(proxy.Division(TheFirstNumber, TheSecondNumber));
                                    }
                                else  {
                                   //throw new ArithmeticException();
                                    System.out.println("Ділення на 0 неможливе");
                                }
                                }
//                                else{
//                                System.out.println("Операція неправильна");
//                            }
                        }
                catch (Exception e) {
                    System.out.println("Неправильне введення данних");}
                }

                if (n == 4) {
                    try {
                        System.out.println("Введіть число: ");
                        double NumberLog1 = Double.parseDouble(sc.nextLine());
                        Math x = new MaxDiapazone();
                        MaxDiapazone m = new MaxDiapazone();
                        m.Variable = NumberLog1;
                        System.out.println(x.Logarithm(NumberLog1));
                        m.setLogarithm();
                    } catch (NewException k) {
                        System.out.println(k.getMessage());
                    }
                }
            System.out.println("\nНатисніть Enter щоб продовжити");
            sc.nextLine();
        } while (!programEnd);
    }
}

