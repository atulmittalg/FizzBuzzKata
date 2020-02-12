package main.java.com.kata;

public class FizzBuzz {
    public Object translate(int numberToTranslate) {
        if(numberToTranslate % 3 == 0){
            return "Fizz";
        }
        return numberToTranslate;
    }
}
