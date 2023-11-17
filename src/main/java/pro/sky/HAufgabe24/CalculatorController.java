package pro.sky.HAufgabe24;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService ){
        this.calculatorService = calculatorService;
    }

    @RequestMapping (path = "/calculator")
    public String hello(){
        return calculatorService.hello();
    }
    /* /calculator/plus?num1=5&num2=5*/
    @GetMapping(path = "/calculator/plus")
    public String plus(@RequestParam("num1") int a, @RequestParam ("num2")int b) {
        return a + " + " + b + " = " + calculatorService.plus (a,b);
    }
    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam ("num1") int a, @RequestParam ("num2")int b) {
        return a + " - " + b + " = " + calculatorService.minus (a,b);
    }
    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam ("num1") int a, @RequestParam ("num2")int b) {
        return a + " * " + b + " = " + calculatorService.multiply (a,b);
    }
    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam ("num1") int a, @RequestParam ("num2")int b) {
        return a + " / " + b + " = " + calculatorService.divide (a,b);
    }
}