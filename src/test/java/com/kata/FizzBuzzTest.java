package test.java.com.kata;

import main.java.com.kata.FizzBuzz;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class FizzBuzzTest {

    private int numberToTranslate;
    private int translatedNumber;

    public FizzBuzzTest(int numberToTranslate, int translatedNumber){
        this.numberToTranslate = numberToTranslate;
        this.translatedNumber = translatedNumber;
    }

    @Parameterized.Parameters
    public static Collection inputParameters(){
        return Arrays.asList(new Object[][]{{1, 1},{2, 2}});
    }

    @Test
    public void shouldTranslateGivenNumToTheSameNum(){
        FizzBuzz fizzBuz = new FizzBuzz();
        Assert.assertEquals(numberToTranslate,fizzBuz.translate(translatedNumber));
    }

}
