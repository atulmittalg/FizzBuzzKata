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
    private int translatedNumber;
    private FizzBuzz fizzBuz = new FizzBuzz();

    public FizzBuzzTest(int numberToTranslate, int translatedNumber){
        this.numberToTranslate = numberToTranslate;
        this.translatedNumber = translatedNumber;
    }

    @Before
    public void initialize(){
        FizzBuzz fizzBuz = new FizzBuzz();
    }

    @Parameterized.Parameters
    public static Collection inputParameters(){
        return Arrays.asList(new Object[][]{{1, 1},{2, 2}});
    }

    @Test
    public void shouldTranslateGivenNumToTheSameNum(){
        Assert.assertEquals(numberToTranslate,fizzBuz.translate(translatedNumber));
    }

    @Test
    public void shouldTranslate3ToFizz(){
        Assert.assertEquals("Fizz",fizzBuz.translate(3));
    }

    @Test
    public void shouldTranslate5ToBuzz(){
        Assert.assertEquals("Buzz",fizzBuz.translate(5));
    }

    @Test
    public void shouldTranslate6ToFizz(){
        Assert.assertEquals("Fizz",fizzBuz.translate(6));
    }

}
