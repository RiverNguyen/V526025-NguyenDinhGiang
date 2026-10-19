/**
 * Tam giác xác định bởi ba cạnh. Diện tích tính theo công thức Heron.
 */
public class TamGiac extends Hinh {
    private final double a;
    private final double b;
    private final double c;

    public TamGiac(double a, double b, double c) {
        if (!hopLe(a, b, c)) {
            throw new IllegalArgumentException("Ba cạnh không tạo thành tam giác");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static boolean hopLe(double a, double b, double c) {
        return a > 0 && b > 0 && c > 0
                && a + b > c
                && a + c > b
                && b + c > a;
    }

    @Override
    public double chuVi() {
        return a + b + c;
    }

    @Override
    public double dienTich() {
        double p = chuVi() / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public String ten() {
        return "Tam giác";
    }
}
