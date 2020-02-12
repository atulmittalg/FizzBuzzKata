package test.java.com.kata;

import main.java.com.kata.FizzBuzz;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class FizzBuzzTest {

    private int numberToTranslate;
    private Object translatedNumber;
    private FizzBuzz fizzBuz = new FizzBuzz();

    public FizzBuzzTest(int numberToTranslate, Object translatedNumber){
        this.numberToTranslate = numberToTranslate;
        this.translatedNumber = translatedNumber;
    }

    @Before
    public void initialize(){
        FizzBuzz fizzBuz = new FizzBuzz();
    }

    @Parameterized.Parameters
    public static Collection inputParameters(){
        return Arrays.asList(new Object[][]{{1, 1},{2, 2},{3,"Fizz"},{5,"Buzz"},{6,"Fizz"},{10,"Buzz"},{15,"FizzBuzz"},{30,"FizzBuzz"}});
    }

    @Test
    public void shouldTranslateGivenNumAsExpected(){
        Assert.assertEquals(translatedNumber, fizzBuz.translate(numberToTranslate));
    }
}
