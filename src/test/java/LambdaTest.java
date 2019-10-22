import org.junit.Assert;
import org.junit.Test;


public class LambdaTest {
    @Test
    public void add() {
        MathOperatioin mathOperatioin=(a,b)->a+b;
        Assert.assertEquals(7,LambdaBasic.operation(3,4,mathOperatioin));
    }

    @Test
    public void sub() {
        MathOperatioin mathOperatioin=(a,b)->a-b;
        Assert.assertEquals(-1,LambdaBasic.operation(3,4,mathOperatioin));
    }

    @Test
    public void mul() {
        MathOperatioin mathOperatioin=(a,b)->a*b;
        Assert.assertEquals(12,LambdaBasic.operation(3,4,mathOperatioin));
    }

    @Test
    public void div() {
        MathOperatioin mathOperatioin=(a,b)->a/b;
        Assert.assertEquals(7,LambdaBasic.operation(7,1,mathOperatioin));
    }

}
