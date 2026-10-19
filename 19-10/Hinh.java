import java.util.Locale;

/**
 * Hình phẳng có chu vi và diện tích.
 */
public abstract class Hinh {
    public abstract double chuVi();

    public abstract double dienTich();

    public abstract String ten();

    @Override
    public String toString() {
        return String.format(Locale.US, "%s: Chu vi = %.2f, Diện tích = %.2f", ten(), chuVi(), dienTich());
    }
}
