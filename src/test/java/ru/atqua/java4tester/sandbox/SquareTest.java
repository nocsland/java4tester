package ru.atqua.java4tester.sandbox;
import org.junit.Assert;
import org.junit.Test;
import ru.atqa.java4tester.sandbox.Square;




public class SquareTest {
   @Test
    public void testArea(){

        Square s = new Square(5);
        Assert.assertEquals(s.area(),25.0,0);
   }
}
