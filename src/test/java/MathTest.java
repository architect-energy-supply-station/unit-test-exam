import org.junit.Assert;
import org.junit.Test;

/**
 * https://www.jianshu.com/p/6178bb936e74
 *
 * @Classname MathTest
 * @Auther sunshinezhang
 * @Date 2019/10/19 21:06
 */
public class MathTest {

	@Test
	public void add(){
		MathOperatioin add = ((a, b) -> a + b);
		Assert.assertEquals(9, LambdaBasic.operation(4, 5, add));
	}

	@Test
	public void differ(){
		MathOperatioin differ = ((a, b) -> a - b);
		Assert.assertEquals(4, LambdaBasic.operation(11, 7, differ));
	}

	@Test
	public void multiple(){
		MathOperatioin multiple = ((a, b) -> a * b);
		Assert.assertEquals(18, LambdaBasic.operation(3, 6, multiple));
	}

	@Test
	public void division(){
		MathOperatioin division = ((a, b) -> a / b);
		Assert.assertEquals(5, LambdaBasic.operation(15, 3, division));
	}

}
