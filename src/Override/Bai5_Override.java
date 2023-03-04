package Override;

import java.util.Date;
import java.util.Scanner;

class TaiKhoan {
    String STK,TenChuTK;
    int SoDu,SoNo ,Hang;
    Date NgayTao;

    public TaiKhoan(){}
    public TaiKhoan(String STK, String tenChuTK, int soDu, int soNo, int hang, Date ngayTao) {
        this.STK = STK;
        TenChuTK = tenChuTK;
        SoDu = soDu;
        SoNo = soNo;
        Hang = hang;
        NgayTao = ngayTao;
    }

    Scanner sc = new Scanner(System.in);

    public String getSTK() {
        return STK;
    }

    public void setSTK(String STK) {
        this.STK = STK;
    }

    public String getTenChuTK() {
        return TenChuTK;
    }

    public void setTenChuTK(String tenChuTK) {
        TenChuTK = tenChuTK;
    }

    public int getSoDu() {
        return SoDu;
    }

    public void setSoDu(int soDu) {
        SoDu = soDu;
    }

    public int getSoNo() {
        return SoNo;
    }

    public void setSoNo(int soNo) {
        SoNo = soNo;
    }

    public int getHang() {
        return Hang;
    }

    public void setHang(int hang) {
        Hang = hang;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date ngayTao) {
        NgayTao = ngayTao;
    }

    public void HanMuc() {
      int hanmuc = getSoDu();
    }

    void inTK() {
        System.out.println("Thông tin tài khoản: ");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s \n",STK,TenChuTK,SoDu,SoNo,Hang);
    }
}

 class TKVay extends TaiKhoan {
    public void HanMuc() {
        int hanmuc = getSoDu()-getSoNo() + 5;

        System.out.println("hạn mức = " +hanmuc);
    }
}

class TkThanhToan extends TaiKhoan {
    public void HanMuc() {
        int hanmuc = (getSoDu()-getSoNo());
        System.out.println("hạn mức = " +hanmuc);
    }
}

class TKThauChi extends TaiKhoan {
    public void HanMuc() {

        int hanmuc = (getSoDu()-getSoNo())*(getHang()*10);
        System.out.println("hạn mức = " +hanmuc);
    }
}


public class Bai5_Override {
//    static  Scanner sc = new Scanner(System.in);
//    static void nhapTK(Override.TaiKhoan tk) {
//        System.out.println("Nhập tên tài khoản: ");
//        tk.setTenChuTK(sc.nextLine());
//        System.out.println("Nhập số tài khoản: ");
//        tk.setSTK(sc.nextLine());
//        System.out.println("Nhập số dư: ");
//        tk.setSoDu(sc.nextInt());
//        System.out.println("Nhập số nợ: ");
//        tk.setSoNo(sc.nextInt());
//        System.out.println("Nhập hạng: ");
//        tk.setHang(sc.nextInt());
//    }
    public static void main(String args[]) {
        TaiKhoan stk = new TKVay();
        stk.setSTK("12984710299");
        stk.setTenChuTK("Long");
        stk.setHang(2);
        stk.setSoDu(100);
        stk.setSoNo(50);
        stk.inTK();

        stk.HanMuc();
    }
}
