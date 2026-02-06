package DAY5.LambdaExpressions;

@FunctionalInterface
interface Add {
    int sum(int a, int b);
}

public class MultipleParameterLambda {
    public static void main(String[] args) {
        Add add = (a, b) -> {
            int result = a + b;
            return result;
        };
        System.out.println(add.sum(10, 20));

    }

}
