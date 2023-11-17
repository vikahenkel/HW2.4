package pro.sky.HAufgabe24;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String hello() {
        return "Добро пожаловать в калькулятор!";
    }

    /* /calculator/plus?num1=5&num2=5*/
    public int plus(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }
}
