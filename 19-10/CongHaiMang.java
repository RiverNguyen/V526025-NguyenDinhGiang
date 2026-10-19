import java.util.Scanner;

/**
 * Cộng hai mảng theo từng vị trí. Vị trí thiếu ở mảng ngắn hơn được xem là 0.
 */
public class CongHaiMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = nhapMang(sc, "thứ nhất");
        int[] b = nhapMang(sc, "thứ hai");
        int[] c = cong(a, b);

        System.out.println("Mảng kết quả: " + dinhDang(c));
        sc.close();
    }

    static int[] nhapMang(Scanner sc, String ten) {
        int n;
        do {
            System.out.print("Nhập số lượng phần tử mảng " + ten + ": ");
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("Số lượng phải >= 0.");
            }
        } while (n < 0);

        int[] a = new int[n];
        if (n > 0) {
            System.out.println("Nhập " + n + " phần tử mảng " + ten + ":");
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
        }
        return a;
    }

    static int[] cong(int[] a, int[] b) {
        int n = Math.max(a.length, b.length);
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            int x = i < a.length ? a[i] : 0;
            int y = i < b.length ? b[i] : 0;
            c[i] = x + y;
        }
        return c;
    }

    static String dinhDang(int[] a) {
        if (a.length == 0) {
            return "(rỗng)";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(a[i]);
        }
        return sb.toString();
    }
}
