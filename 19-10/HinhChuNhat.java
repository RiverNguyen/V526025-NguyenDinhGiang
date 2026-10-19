/**
 * Hình chữ nhật xác định bởi chiều dài và chiều rộng.
 */
public class HinhChuNhat extends Hinh {
    private final double chieuDai;
    private final double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        if (chieuDai <= 0 || chieuRong <= 0) {
            throw new IllegalArgumentException("Chiều dài và chiều rộng phải > 0");
        }
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public double chuVi() {
        return 2 * (chieuDai + chieuRong);
    }

    @Override
    public double dienTich() {
        return chieuDai * chieuRong;
    }

    @Override
    public String ten() {
        return "Hình chữ nhật";
    }
}
