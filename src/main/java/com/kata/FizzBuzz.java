package main.java.com.kata;

public class FizzBuzz {
    public Object translate(int numberToTranslate) {
        if(isFizz(numberToTranslate) && isBuzz(numberToTranslate)) return "FizzBuzz";
        else if (isFizz(numberToTranslate)) return "Fizz";
        else if (isBuzz(numberToTranslate)) return "Buzz";
        else return numberToTranslate;
    }

    private boolean isBuzz(int numberToTranslate) {
        if (numberToTranslate % 5 == 0) {
            return true;
        }
        return false;
    }

    private boolean isFizz(int numberToTranslate) {
        if (numberToTranslate % 3 == 0) {
            return true;
        }
        return false;
    }
}
