import java.util.Locale;
import java.util.Scanner;

/**
 * Đọc một hình tam giác, chữ nhật hoặc tròn từ bàn phím.
 */
public class NhapHinh {
    public static Scanner scanner() {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        return sc;
    }

    public static int chonLoai(Scanner sc) {
        while (true) {
            System.out.print("Chọn loại hình (1 - Tam giác, 2 - Chữ nhật, 3 - Tròn): ");
            int loai = sc.nextInt();
            if (loai >= 1 && loai <= 3) {
                return loai;
            }
            System.out.println("Chọn 1, 2 hoặc 3.");
        }
    }

    public static Hinh nhap(Scanner sc, int loai) {
        switch (loai) {
            case 1:
                return nhapTamGiac(sc);
            case 2:
                return nhapChuNhat(sc);
            case 3:
                return nhapTron(sc);
            default:
                throw new IllegalArgumentException("Loại hình không hợp lệ: " + loai);
        }
    }

    private static TamGiac nhapTamGiac(Scanner sc) {
        while (true) {
            System.out.print("Nhập 3 cạnh a b c: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            if (TamGiac.hopLe(a, b, c)) {
                return new TamGiac(a, b, c);
            }
            System.out.println("Ba cạnh không tạo thành tam giác. Nhập lại.");
        }
    }

    private static HinhChuNhat nhapChuNhat(Scanner sc) {
        double dai = docSoDuong(sc, "Nhập chiều dài: ");
        double rong = docSoDuong(sc, "Nhập chiều rộng: ");
        return new HinhChuNhat(dai, rong);
    }

    private static HinhTron nhapTron(Scanner sc) {
        double banKinh = docSoDuong(sc, "Nhập bán kính: ");
        return new HinhTron(banKinh);
    }

    private static double docSoDuong(Scanner sc, String nhan) {
        while (true) {
            System.out.print(nhan);
            double x = sc.nextDouble();
            if (x > 0) {
                return x;
            }
            System.out.println("Giá trị phải > 0.");
        }
    }
}
