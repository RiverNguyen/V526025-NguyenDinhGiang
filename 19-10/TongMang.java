import java.util.Scanner;

public class TongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = docSoLuong(sc);
        int[] a = new int[n];
        if (n > 0) {
            System.out.println("Nhập " + n + " phần tử:");
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
        }

        System.out.println("Tổng mảng: " + tong(a));
        sc.close();
    }

    static int docSoLuong(Scanner sc) {
        int n;
        do {
            System.out.print("Nhập số lượng phần tử: ");
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("Số lượng phải >= 0.");
            }
        } while (n < 0);
        return n;
    }

    static long tong(int[] a) {
        long ketQua = 0;
        for (int x : a) {
            ketQua += x;
        }
        return ketQua;
    }
}
