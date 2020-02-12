package test.java.com.kata;

import main.java.com.kata.FizzBuzz;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void shouldTranslate1To1(){
        FizzBuzz fizzBuz = new FizzBuzz();
        Assert.assertEquals(1,fizzBuz.translate(1));
    }

}
