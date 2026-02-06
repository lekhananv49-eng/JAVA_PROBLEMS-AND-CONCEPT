package DAY5.LambdaExpressions;

interface Square {
    int findSquare(int x);
}

public class SingleParameterLambda {
    public static void main(String[] args) {
        Square s = (x) -> x * x;
        System.out.println(s.findSquare(5));

    }
}
