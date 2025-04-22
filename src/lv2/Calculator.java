package lv2;
import java.util.List;
import java.util.ArrayList;

public class Calculator {
    // 컬렉션 타입 필드 선언 및 생성
    private List<Integer> results = new ArrayList<>();


    //계산 수행하는 기능 생성
    public int calculate (int num1, int num2, char symbol) {
        int result = 0;
        switch (symbol){
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
                break;}
        results.add(result);
        return result;
    }
}