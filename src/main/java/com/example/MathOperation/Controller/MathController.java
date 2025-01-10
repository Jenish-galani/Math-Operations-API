package com.example.MathOperation.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {
    @GetMapping("/addition")
    public String addition (@RequestParam int a,@RequestParam int b){
        return "Addition is : " + (a + b);
    }

    @GetMapping("/subtraction")
    public String subtraction (@RequestParam int a,@RequestParam int b){
        return "Subtraction  is : " + (a - b);
    }

    @GetMapping("/multiplication")
    public String multiplication (@RequestParam int a,@RequestParam int b){
        return "Multiplication  is : " + (a * b);
    }

    @GetMapping("/modulo")
    public String modulo (@RequestParam Double a,@RequestParam Double b){
        return "Modulo  is : " + (a % b);
    }

    @GetMapping("/division")
    public String division (@RequestParam int a,@RequestParam int b){
        return "Division  is : " + (a / b);
    }

    @GetMapping("/isEqual")
    public String isEqual (@RequestParam int a,@RequestParam int b){
        return a == b?"a is equal b":"a is not equal b";
    }

    @GetMapping("/aIsGreater")
    public String aIsGreater (@RequestParam int a,@RequestParam int b){
        return a > b?"a is greater than b":"a is not greater than b";
    }

    @GetMapping("/bIsGreater")
    public String bIsGreater (@RequestParam int a,@RequestParam int b){
        return a < b?"b is greater than a":"b is not greater than a";
    }

    @GetMapping("/notEqual")
    public String notEqual (@RequestParam int a,@RequestParam int b){
        return a != b?"a is not equal b":"a is equal b";
    }

    @GetMapping("/evenOrOdd")
    public String evenOrOdd (@RequestParam int a){
        return a % 2 == 0?"A is even":"A is odd";
    }
}
