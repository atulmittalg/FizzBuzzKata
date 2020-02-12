package main.java.com.kata;

public class FizzBuzz {
    public Object translate(int numberToTranslate) {
        if(numberToTranslate % 3 == 0){
            return "Fizz";
        }
        if(numberToTranslate % 5 == 0){
            return "Buzz";
        }
        return numberToTranslate;
    }
}
