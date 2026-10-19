import java.util.Scanner;
∂
public class ChonLoaiHinh {
    public static void main(String[] args) {
        Scanner sc = NhapHinh.scanner();

        int loai = NhapHinh.chonLoai(sc);
        Hinh hinh = NhapHinh.nhap(sc, loai);

        System.out.println(hinh);
        sc.close();
    }
}
