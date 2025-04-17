package lv1;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //1번째 숫자 변수에 넣기
        System.out.println("첫번째 숫자를 입력하세요.");
        int num1 = scan.nextInt();
        //2번째 숫자 변수에 넣기
        System.out.println("두번째 숫자를 입력하세요.");
        int num2 = scan.nextInt();
        //사칙연산 기호 변수에 넣기
        System.out.println("사칙연산 기호를 입력하세요");
        char symbol = scan.nextShort().charAt();
        //계산기 기능 넣기
        switch (symbol){
            int result = 0;
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                System.out.println("결과 = " + result);

        }
    }
}
