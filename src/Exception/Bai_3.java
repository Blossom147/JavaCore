package Exception;

import java.util.Scanner;

class ThongTinThe{
    String SoThe,TenNguoiDung,NgayHetHan,Pin;
    public ThongTinThe(){}

    public ThongTinThe(String soThe, String tenNguoiDung, String ngayHetHan, String pin) {
        SoThe = soThe;
        TenNguoiDung = tenNguoiDung;
        NgayHetHan = ngayHetHan;
        Pin = pin;
    }

    public String getSoThe() {
        return SoThe;
    }

    public void setSoThe(String soThe) {
        SoThe = soThe;
    }

    public String getTenNguoiDung() {
        return TenNguoiDung;
    }

    public void setTenNguoiDung(String tenNguoiDung) {
        TenNguoiDung = tenNguoiDung;
    }

    public String getNgayHetHan() {
        return NgayHetHan;
    }

    public void setNgayHetHan(String ngayHetHan) {
        NgayHetHan = ngayHetHan;
    }

    public String getPin() {
        return Pin;
    }

    public void setPin(String pin) {
        Pin = pin;
    }
}
public class Bai_3 {
    public static void main(String args[]) {

        String TenNguoiDung,NgayHetHan,SoThe;
        int Pin;
        boolean check = false;
        Scanner scanner = new Scanner(System.in);
        ThongTinThe tt = new ThongTinThe();
        System.out.println("Nhập thong tin thẻ ");
        while (!check){
            try {
                System.out.print("Nhập tên người dùng: ");
                TenNguoiDung = scanner.nextLine();
                if (TenNguoiDung.length() < 21 && TenNguoiDung.length() > 0){
                    check = true;
                }else{
                    check = false;
                }
            }catch (Exception e){
                scanner.nextLine();
                System.out.println(e);
            }
        }

    }

}
    