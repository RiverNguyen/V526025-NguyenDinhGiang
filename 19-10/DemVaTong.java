import java.util.Scanner;

public class DemVaTong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập các số nguyên, cách nhau bằng khoảng trắng: ");
        String dong = sc.nextLine();

        KetQua ketQua;
        try {
            ketQua = tinh(dong);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            sc.close();
            return;
        }
        System.out.println("Số lượng: " + ketQua.soLuong);
        System.out.println("Tổng: " + ketQua.tong);
        sc.close();
    }

    static KetQua tinh(String dong) {
        String daCat = dong.trim();
        if (daCat.isEmpty()) {
            return new KetQua(0, 0);
        }

        String[] phan = daCat.split("\\s+");
        long tong = 0;
        for (String token : phan) {
            try {
                tong += Integer.parseInt(token);
            } catch (NumberFormatException ex) {
                throw new IllegalArgumentException("'" + token + "' không phải số nguyên");
            }
        }
        return new KetQua(phan.length, tong);
    }

    static class KetQua {
        final int soLuong;
        final long tong;

        KetQua(int soLuong, long tong) {
            this.soLuong = soLuong;
            this.tong = tong;
        }
    }
}
