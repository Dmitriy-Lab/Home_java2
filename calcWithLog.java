import java.util.Scanner;
import java.io.PrintWriter;
import java.util.logging.Logger;
import java.io.FileNotFoundException;

public class calcWithLog {
    /**
     * К калькулятору из предыдущего дз добавить логирование
     */
    private static Logger logger = Logger.getLogger(calcWithLog.class.getName());
    public static void main(String[] args) {
        double num1;
        double num2;
        double result;
        char operation;

        try(PrintWriter out = new PrintWriter("fileCalc.txt")) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите 1 число: ");
        num1 = input.nextDouble();
        out.println(("Введено первое число " + num1));
        System.out.println("Введите 2 число: ");
        num2 = input.nextDouble();
        out.println(("Введено второе число " + num2));
        System.out.println("Введите операцию (+ - * /): ");
        operation = input.next().charAt(0);
        out.println(("Введена операция " + operation));
        switch(operation) {
            case '+': result = num1 + num2;
               break;
            case '-': result = num1 - num2;
               break;
            case '*': result = num1 * num2;
               break;
            case '/': result = num1 / num2;
               break;
               default:  System.out.printf("Неправильный ввод знака");
               return;
         }
         out.println(("Результат вычислений " + result));
         System.out.printf("%f %c %f =" + result + "\n", num1, operation, num2);

        logger.info("Содержимое записано в файл fileCalc.txt");
        } catch (FileNotFoundException e) {
            logger.info(e.getMessage());
        }
    }
}

