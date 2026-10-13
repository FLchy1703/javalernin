import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        String ten = "Pham Lam";
//        int NamSinh = 2004;
//        double GPA = 2.18;
//        boolean ThucTap = false;
//        String TinhTrangThucTap;
//        if (ThucTap == true) {
//            TinhTrangThucTap = "chua thuc tap";
//        } else {
//            TinhTrangThucTap = "Da thuc tap";
//        }
//        int Tuoi = 2026 - NamSinh;
//        System.out.println("Tôi tên là " + ten);
//        System.out.println("Tuoi: " + Tuoi);
//        System.out.println("GPA: " + GPA);
//        System.out.println("Tình trạng thực tập " + TinhTrangThucTap);
//
//        String ten;
//        double diemMon1;
//        double diemMon2;
//        double diemMon3;
//        System.out.println("Nhap ten cua ban: ");
//        Scanner sc = new Scanner(System.in);
//        ten = sc.nextLine();
//
//        Scanner sc = new Scanner(System.in);  // 1 cái duy nhất, dùng cho mọi lần nhập
//        ten = sc.nextLine();
//        diemMon1 = sc.nextDouble();
//        diemMon2 = sc.nextDouble();
//        diemMon3 = sc.nextDouble();
//        sc.close();  // nhớ đóng khi xong
//
//        double diemTB = (diemMon1 + diemMon2 + diemMon3) / 3;
//        String xepLoai;
//        if (diemTB >= 8) {
//            xepLoai = "Gioi";
//        } else if (diemTB >= 6.5) {
//            xepLoai = "Kha";
//        } else {
//            xepLoai = "Trung Binh";
//        }
//        System.out.println("Ten cua ban: " + ten);
//        System.out.println("Diem trung binh cua ban: " + diemTB);
//        System.out.println("Xep loai cua ban: " + xepLoai);

//        System.out.println("Nhap so n: ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        sc.close();
//        int[] fibonacci = new int[10];
//        fibonacci[0] = 0;
//        fibonacci[1] = 1;
//
//        for (int i = 2; i <= 9; i++) {
//            fibonacci[i] = fibonacci[i-1]  + fibonacci[i-2];
//        }
//
//        for (int so : fibonacci) {
//            System.out.print(so + " ");
//        }

    System.out.println("Nhap so n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
    for(int i = 1; i < 10; i++){
        System.out.println(n + " x " + i + " = " + (n*i));
    }



    }
}
