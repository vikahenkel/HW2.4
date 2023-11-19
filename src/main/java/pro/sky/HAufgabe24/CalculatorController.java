package pro.sky.HAufgabe24;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService ){
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello(){
        return calculatorService.hello();
    }
    /* /calculator/plus?num1=5&num2=5*/
    @GetMapping(path = "/plus")
    public String plus(@RequestParam(value = "num1", required = false) Integer a,
                       @RequestParam(value = "num2", required = false) Integer b) {
        if (a == null || b == null) {
            return "Ошибка! не передан параметр";
        }
            return a + " + " + b + " = " + calculatorService.plus (a,b);
    }
    @GetMapping(path = "/minus")
    public String minus(@RequestParam(value = "num1", required = false) Integer a,
                        @RequestParam(value = "num2", required = false) Integer b) {
        if (a == null || b == null) {
            return "Ошибка! не передан параметр";
        }
        return a + " - " + b + " = " + calculatorService.minus (a,b);
    }
    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) Integer a,
                           @RequestParam(value = "num2", required = false) Integer b) {
        if (a == null || b == null) {
            return "Ошибка! не передан параметр";
        }
        return a + " * " + b + " = " + calculatorService.multiply (a,b);
    }
    @GetMapping(path = "/divide")
    public String divide(@RequestParam(value = "num1", required = false) Integer a,
                         @RequestParam(value = "num2", required = false) Integer b) {
        if (a == null || b == null) {
            return "Ошибка! не передан параметр";
        }
        if (b == 0){
            return "Делить на ноль нельзя!";        }
        return a + " / " + b + " = " + calculatorService.divide (a,b);
    }
}