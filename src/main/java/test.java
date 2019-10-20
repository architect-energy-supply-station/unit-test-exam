import jdk.nashorn.internal.objects.annotations.Optimistic;
import org.junit.Assert;
import org.junit.Test;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-10-20
 */
public class test {

    @Test
    public void testAdd1(){
        MathOperatioin math=new MathOperatioin(){
            @Override
            public int mathOperation(int a, int b) {
                return a+b;
            }
        };

        Assert.assertEquals(5, LambdaBasic.operation(2, 3, math));
    }

    @Test
    public void testAdd2(){
        MathOperatioin math=new MathOperatioin(){
            @Override
            public int mathOperation(int a, int b) {
                return a+b;
            }
        };

        Assert.assertEquals(5, LambdaBasic.operation(3, 3, math));
    }

    @Test
    public void testSub1(){
        MathOperatioin mathOperatioin=(a, b) ->a-b;
        Assert.assertEquals(1,LambdaBasic.operation(3,2,mathOperatioin));
    }

    @Test
    public void testSub2(){
        MathOperatioin mathOperatioin=(a, b) ->a-b;
        Assert.assertEquals(1,LambdaBasic.operation(3,3,mathOperatioin));
    }

    @Test
    public void testDiv1(){
        MathOperatioin mathOperatioin=(a,b)->a/b;
        Assert.assertEquals(2,LambdaBasic.operation(6,3,mathOperatioin));
    }

    @Test
    public void testDiv2(){
        MathOperatioin mathOperatioin=(a,b)->a/b;
        Assert.assertEquals(3,LambdaBasic.operation(6,3,mathOperatioin));
    }

    @Test
    public void testDiv3(){
        MathOperatioin mathOperatioin=(a,b)->a/b;
        Assert.assertEquals(3,LambdaBasic.operation(6,0,mathOperatioin));
    }

    @Test
    public void testMultiply1(){
        MathOperatioin mathOperatioin=(a,b)->a*b;
        Assert.assertEquals(0,LambdaBasic.operation(6,0,mathOperatioin));
    }

    @Test
    public void testMultiply2(){
        MathOperatioin mathOperatioin=(a,b)->a*b;
        Assert.assertEquals(0,LambdaBasic.operation(6,1,mathOperatioin));
    }

    @Test
    public void testMultiply3(){
        MathOperatioin mathOperatioin=(a,b)->a*b;
        Assert.assertEquals(6,LambdaBasic.operation(6,1,mathOperatioin));
    }


}
