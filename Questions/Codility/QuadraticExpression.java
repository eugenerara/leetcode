package Questions.Codility;

public class QuadraticExpression {
    public int solveQuadraticEquation(String quadratic, int x) {
        String[] parts = quadratic.split("x\\^2");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1].split("x")[0]);
        int c = Integer.parseInt(parts[1].split("x")[1]);

        return a * x * x + b * x + c;
    }
}
