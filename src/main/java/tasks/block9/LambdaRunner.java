package tasks.block9;

public class LambdaRunner {
    public static int test(LambdaDemo.GetStringLength getStringLength, String str) {
        return getStringLength.getLength(str);
    }

    public static char test1(LambdaDemo.GetStringFirstSymbol getStringFirstSymbol, String str) {
        return getStringFirstSymbol.getFirstSymbol(str);
    }
}
