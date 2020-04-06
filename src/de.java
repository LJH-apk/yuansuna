/**
 * @author 刘佳航
 * @date 2020/4/5  21:30
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class de {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Numbe number = new Numbe();
        try{

            System.out.println("请输入上一次考试的分数");/** 提示语 */
            number.setNumber1(input.nextFloat());/**   number.number1和number.number2是要计算的数字   */
            System.out.println("请输入这场考试的分数");/** 提示语 */
            number.setNumber2(input.nextFloat());
        }
        catch (InputMismatchException e){
            System.err.println("Warning:你输入的不是数字");
            System.out.println("处理完毕\n程序退出");
            System.exit(0);
        }
        catch (IllegalArgumentException ex){
            System.err.println("Warning:0不能做除数");
            System.out.println("处理完毕\n程序退出");
            System.exit(0);
        }
        catch (BaseExcrption err){
            err.printStackTrace();
            System.exit(0);
        }

        //TODO 下面的关键运算代码交给你了


    }
}
class Numbe{
    private float number1;
    private float number2;

    public void setNumber1(float number1) {
        if (number1 == 0){
            throw new BaseExcrption();
        }else{
            this.number1 = number1;
        }
    }

    public void setNumber2(float number2) {
        this.number2 = number2;
    }

    public float getNumber1() {
        return number1;
    }

    public float getNumber2() {
        return number2;
    }
}
class BaseExcrption extends RuntimeException {
    public BaseExcrption() {
        super();
    }

    public BaseExcrption(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseExcrption(Throwable cause) {
        super(cause);
    }
}