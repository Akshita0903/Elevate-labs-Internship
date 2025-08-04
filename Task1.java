package task1;

import java.util.Scanner;

public class Task1{
    public static void main(String[] args) {
        Task1 obj=new Task1();
        obj.calculator();
    
    }public void calculator(){
        System.out.println("--------------------Simple Calculator-----------------");
        System.out.println("--------------------please go ahead-------------------");
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter first value");
        float a=scanner.nextFloat();
        System.out.println("enter second value");
        float b=scanner.nextFloat();
        System.out.println("Which operation you want to do? \n(+,-,*,/,%)");
        char operation=scanner.next().charAt(0);
        switch(operation){
            case '+':
            System.out.println(add(a,b));
            break;
            case '-':
            System.out.println(sub(a, b));
            break;
            case '*':
            System.out.println(mul(a, b));
            break;
            case '/':
            System.out.println(divide(a, b));
            break;
            case '%':
            System.out.println(mod(a, b));
            break;
            default:
            System.out.println("wrong operation used");
        }
        scanner.close();
    }
    public float add(float a, float b){
        System.out.println("Result: ");
        return a+b;
    }
    public float sub(float a, float b){
        System.out.println("Result: ");
        return a-b;
    }
    public float mul(float a, float b){
        System.out.println("Result: ");
        return a*b;
    }
    public float divide(float a, float b){
        System.out.println("Result: ");
        return a/b;
    }
    public float mod(float a, float b){
        System.out.println(" Result: ");
        return a%b;
    }

}