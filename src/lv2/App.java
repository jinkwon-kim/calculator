package lv2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator cal= new Calculator();
        while (true){
            //1번째 숫자 변수에 넣기
            System.out.println("첫번째 숫자를 입력하세요.");
            int num1 = Integer.parseInt(scan.nextLine());
            //2번째 숫자 변수에 넣기
            System.out.println("두번째 숫자를 입력하세요.");
            int num2 = Integer.parseInt(scan.nextLine());
            //사칙연산 기호 변수에 넣기
            System.out.println("사칙연산 기호를 입력하세요");
            char symbol = scan.nextLine().charAt(0);
            //Calculator 활용되도록 수정
            int result =cal.calculate(num1,num2,symbol);
            System.out.println("결과 = " + result);
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String input = scan.nextLine();
            if (input.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
               break;
             }

        }


    }
}