package main;
import java.util.Scanner;
/**
 * @author 刘佳航
 * @date 2020/4/6  14:40
 */
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String formula = input.next();
        Yichang we = new Yichang();
        for (int i=0;i>formula.length();i++){
            char ch = formula.charAt(i);
            if (ch == '+'){
                Jia input1 = new Jia();
                String number1 = formula.substring(0,i);
                input1.setNumber1(we.Yichang1(number1));
                String number2 = formula.substring(i+1,formula.length());
                input1.setNumber2(we.Yichang2(number2));
                System.out.println(input1.getNumber3());
            }
        }

    }
}
abstract class Number{
    double number1;
    double number2;
    double number3;
    public abstract void setNumber1(double number1);
    public abstract void setNumber2(double number2);
    public abstract double getNumber3();
}
class Jia extends Number{
    @Override
    public void setNumber1(double number1){
        this.number1 = number1;
    }
    @Override
    public void setNumber2(double number2){
        this.number2 = number2;
    }
    @Override
    public double getNumber3(){
        this.number3 = this.number2 + this.number1;
        return this.number3;
    }
}
class Jian extends Number{
    @Override
    public void setNumber1(double number1){
        this.number1 = number1;
    }
    @Override
    public void setNumber2(double number2){
        this.number2 = number2;
    }
    @Override
    public double getNumber3(){
        double number3 = this.number1 + this.number2;
        return number3;
    }
}
class Cheng extends Number{
    @Override
    public void setNumber1(double nunber1){
        this.number1 = number2;
    }
    @Override
    public void setNumber2(double number2){
        this.number2 = number2;
    }
    @Override
    public double getNumber3(){
        double number3 = this.number1 * this.number2;
        return number3;
    }
}
class Chu extends Number{
    @Override
    public void setNumber1(double number1){
        this.number1 = number1;
    }
    @Override
    public void setNumber2(double number2){
        this.number2 = number2;
    }
    @Override
    public double getNumber3(){
        double number3 = this.number1 / this.number2;
        return number3;
    }
}
class Yichang{
    public double num1;
    public double num2;
    public double Yichang1(String number1){
        try{
            num1 = Float.parseFloat(number1);
        }
        catch (NumberFormatException number){
            System.err.println("Error:你输入的不是数字");
            System.out.println("处理完毕\n程序退出");
            System.exit(0);
        }
        double numbe1 = num1;
        return numbe1;
    }
    public double Yichang2(String number2){
        try{
            num2 = Float.parseFloat(number2);
        }
        catch (NumberFormatException nu){
            System.out.println("Error:你输入的不是数字");
            System.out.println("处理完毕\n程序退出");
            System.exit(0);
        }
        double numb2 = num2;
        return numb2;
    }
}
