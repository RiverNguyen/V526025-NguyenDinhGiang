import java.util.Scanner;

public class NhapNHinh {
    public static void main(String[] args) {
        Scanner sc = NhapHinh.scanner();

        int n;
        do {
            System.out.print("Nhập số lượng hình: ");
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("Số lượng phải >= 0.");
            }
        } while (n < 0);

        Hinh[] danhSach = new Hinh[n];
        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("--- Hình " + (i + 1) + " ---");
            int loai = NhapHinh.chonLoai(sc);
            danhSach[i] = NhapHinh.nhap(sc, loai);
        }

        System.out.println();
        System.out.println("===== Kết quả =====");
        if (n == 0) {
            System.out.println("Không có hình nào.");
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Hình " + (i + 1) + " - " + danhSach[i]);
        }
        sc.close();
    }
}
