package Abstract_Constructor;

import java.util.Date;
import java.util.Scanner;

class Vehicle{


    String TenKhachHang,SoSo;
    float ThoiGianGui,LaiSuat,SoTien;
    Date NgayMo, NgayDaoHan;

    public Vehicle(){}
    public Vehicle(String tenKhachHang, String soSo, float thoiGianGui, float laiSuat, float soTien, Date ngayMo, Date ngayDaoHan) {
        TenKhachHang = tenKhachHang;
        SoSo = soSo;
        ThoiGianGui = thoiGianGui;
        LaiSuat = laiSuat;
        SoTien = soTien;
        NgayMo = ngayMo;
        NgayDaoHan = ngayDaoHan;
    }

    public String getTenKhachHang() {
        return TenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        TenKhachHang = tenKhachHang;
    }

    public String getSoSo() {
        return SoSo;
    }

    public void setSoSo(String soSo) {
        SoSo = soSo;
    }

    public float getThoiGianGui() {
        return ThoiGianGui;
    }

    public void setThoiGianGui(float thoiGianGui) {
        ThoiGianGui = thoiGianGui;
    }

    public float getLaiSuat() {
        return LaiSuat;
    }

    public void setLaiSuat(float laiSuat) {
        LaiSuat = laiSuat;
    }

    public float getSoTien() {
        return SoTien;
    }

    public void setSoTien(float soTien) {
        SoTien = soTien;
    }

    public Date getNgayMo() {
        return NgayMo;
    }

    public void setNgayMo(Date ngayMo) {
        NgayMo = ngayMo;
    }

    public Date getNgayDaoHan() {
        return NgayDaoHan;
    }

    public void setNgayDaoHan(Date ngayDaoHan) {
        NgayDaoHan = ngayDaoHan;
    }
}
public class Bai_1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("MENU");
        System.out.println("Chọn chức năng");
        System.out.println("1. Tạo mới tài khoản");
        System.out.println("2. Xuất bảng hạn mức vay");
        int n = scanner.nextInt();
        switch (n){
            case 1 :
                Vehicle tk = new Vehicle();
                tk.SoSo = scanner.nextLine();
                tk.TenKhachHang = scanner.nextLine();

                break;
            case 2:
                System.out.println("+ Dưới 100 triệu, cho vay 10% trị giá sổ.\n" +
                        "+ Từ 100 triệu - 500 triệu, cho vay 20% trị giá sổ.\n" +
                        "+ Từ 500 triệu - 1 tỷ, cho vay 30% trị giá sổ.\n" +
                        "+ Từ 1 tỷ - 5 tỷ, cho vay 40% trị giá sổ.\n" +
                        "+ Từ 5 tỷ - 10 tỷ, cho vay 50% trị giá sổ.\n" +
                        "+ Trên 10 tỷ, cho vay 70% trị giá sổ.");
                break;

        }
    }
}
