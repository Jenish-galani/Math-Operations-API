package com.example.MathOperation.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {

    http://localhost:8080/math/addition?a=5&b=10
    // Handles addition of two numbers and returns the result as a string.
    @GetMapping("/addition")
    public String addition (@RequestParam int a, @RequestParam int b){
        return "Addition is : " + (a + b);
    }

    // Handles subtraction of two numbers and returns the result as a string.
    @GetMapping("/subtraction")
    public String subtraction (@RequestParam int a, @RequestParam int b){
        return "Subtraction  is : " + (a - b);
    }

    // Handles multiplication of two numbers and returns the result as a string.
    @GetMapping("/multiplication")
    public String multiplication (@RequestParam int a, @RequestParam int b){
        return "Multiplication  is : " + (a * b);
    }

    // Handles modulo operation and returns the result as a string.
    @GetMapping("/modulo")
    public String modulo (@RequestParam Double a, @RequestParam Double b){
        return "Modulo  is : " + (a % b);
    }

    // Handles division of two numbers and returns the result as a string.
    @GetMapping("/division")
    public String division (@RequestParam int a, @RequestParam int b){
        return "Division  is : " + (a / b);
    }

    // Compares if two numbers are equal and returns the result as a string.
    @GetMapping("/isEqual")
    public String isEqual (@RequestParam int a, @RequestParam int b){
        return a == b?"a is equal b":"a is not equal b";
    }

    // Checks if the first number is greater than the second and returns the result as a string.
    @GetMapping("/aIsGreater")
    public String aIsGreater (@RequestParam int a, @RequestParam int b){
        return a > b?"a is greater than b":"a is not greater than b";
    }

    // Checks if the second number is greater than the first and returns the result as a string.
    @GetMapping("/bIsGreater")
    public String bIsGreater (@RequestParam int a, @RequestParam int b){
        return a < b?"b is greater than a":"b is not greater than a";
    }

    // Compares if two numbers are not equal and returns the result as a string.
    @GetMapping("/notEqual")
    public String notEqual (@RequestParam int a, @RequestParam int b){
        return a != b?"a is not equal b":"a is equal b";
    }

    // Checks if a number is even or odd and returns the result as a string.
    @GetMapping("/evenOrOdd")
    public String evenOrOdd (@RequestParam int a){
        return a % 2 == 0?"A is even":"A is odd";
    }
}
    
