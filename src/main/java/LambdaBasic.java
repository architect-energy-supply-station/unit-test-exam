/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/19 8:29
 */
public class LambdaBasic {
    public static int operation(int a, int b, MathOperatioin operation) {
        return operation.mathOperation(a,b);
    }
}
