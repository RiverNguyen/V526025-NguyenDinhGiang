/**
 * Hình tròn xác định bởi bán kính.
 */
public class HinhTron extends Hinh {
    private final double banKinh;

    public HinhTron(double banKinh) {
        if (banKinh <= 0) {
            throw new IllegalArgumentException("Bán kính phải > 0");
        }
        this.banKinh = banKinh;
    }

    @Override
    public double chuVi() {
        return 2 * Math.PI * banKinh;
    }

    @Override
    public double dienTich() {
        return Math.PI * banKinh * banKinh;
    }

    @Override
    public String ten() {
        return "Hình tròn";
    }
}
