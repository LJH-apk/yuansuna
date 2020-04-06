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
            System.out.println("请输入上一次考试的分数");/* 提示语 */
            number.setNumber1(input.nextFloat()); /*   number.number1和number.number2是要计算的数字   */
            System.out.println("请输入这场考试的分数"); /* 提示语 */
            number.setNumber2(input.nextFloat());
        }
        catch (InputMismatchException e){
            System.err.println("Error:你输入的不是数字");
            System.out.println("处理完毕\n程序退出");
            System.exit(1);
        }
        catch (IllegalArgumentException ex){
            System.err.println("Warning:你输入的是非法数字");
            System.out.println("错误处理完毕\n程序退出");
            System.exit(1);
        }

        //TODO 下面的关键运算代码交给你了
        float number3 = ((number.getNumber2()-number.getNumber1())/number.getNumber1())*100;
        System.out.println("你进步了：" + number3 + "%");
    }
}
class Number{
    private float number1;
    private float number2;

    public void setNumber1(float number1) {
        if (number1 <= 0){
            throw new IllegalArgumentException();
        }else{
            if(number1 > 150){
                throw new IllegalArgumentException();
            }else{
                this.number1 = number1;
            }
        }
    }

    public void setNumber2(float number2) {
            if (number2 <= 0){
                throw new IllegalArgumentException();
            }else{
                if (number2 > 150){
                    throw new IllegalArgumentException();
                }else{
                    this.number2 = number2;
                }
            }
    }

    public float getNumber1() {
        return number1;
    }

    public float getNumber2() {
        return number2;
    }
}
