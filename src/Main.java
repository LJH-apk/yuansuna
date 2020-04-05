/**
 * @author 刘佳航
 * @date 2020/4/5  19:39
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Number number = new Number();
        try{
            System.out.println("请输入上一次考试的分数");/** 提示语 */
            number.number1 = input.nextFloat();/**   number.number1和number.number2是要计算的数字   */
            System.out.println("请输入这场考试的分数");/** 提示语 */
            number.number2 = input.nextFloat();
        }
        catch (InputMismatchException e){
            System.err.println("Warning:你输入的不是数字");
            System.out.println("处理完毕\n程序退出");
            System.exit(0);
        }
        //TODO 下面的关键运算代码交给你了
        float number3 = ((number.number2-number.number1) / number.number1)*100;
        System.out.println("你进步了：" + number3 + "%");

    }
}
class Number{
    public float number1;
    public float number2;
}
