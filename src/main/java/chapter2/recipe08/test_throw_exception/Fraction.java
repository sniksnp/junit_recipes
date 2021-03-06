package chapter2.recipe08.test_throw_exception;

public class Fraction {
    double n, d;

    public Fraction(double n, double d) {
        this.n = n;
        this.d = d;
    }

    public double getResult() {
        if (d == 0) {
            throw new IllegalArgumentException("denominator == 0");
        } else {
            return n / d;
        }
    }
}
