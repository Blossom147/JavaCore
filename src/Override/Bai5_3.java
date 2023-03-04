package Override;

class TaiSan{
    String TenTaiSan, LoaiTaiSan, NguoiSuDUng, PhongBanSD;
    int NamNhap;

    public TaiSan(){

    }
    public TaiSan(String tenTaiSan, String loaiTaiSan, String nguoiSuDUng, String phongBanSD, int namNhap) {
        TenTaiSan = tenTaiSan;
        LoaiTaiSan = loaiTaiSan;
        NguoiSuDUng = nguoiSuDUng;
        PhongBanSD = phongBanSD;
        NamNhap = namNhap;
    }

    public String getTenTaiSan() {
        return TenTaiSan;
    }

    public void setTenTaiSan(String tenTaiSan) {
        TenTaiSan = tenTaiSan;
    }

    public String getLoaiTaiSan() {
        return LoaiTaiSan;
    }

    public void setLoaiTaiSan(String loaiTaiSan) {
        LoaiTaiSan = loaiTaiSan;
    }

    public String getNguoiSuDUng() {
        return NguoiSuDUng;
    }

    public void setNguoiSuDUng(String nguoiSuDUng) {
        NguoiSuDUng = nguoiSuDUng;
    }

    public String getPhongBanSD() {
        return PhongBanSD;
    }

    public void setPhongBanSD(String phongBanSD) {
        PhongBanSD = phongBanSD;
    }

    public int getNamNhap() {
        return NamNhap;
    }

    public void setNamNhap(int namNhap) {
        NamNhap = namNhap;
    }

    public void showInfo(){
        System.out.println(getLoaiTaiSan());
    }
    public void getUser(){
        System.out.println(getNguoiSuDUng());
    }
}
class VanPhongPham extends TaiSan{
    public void showInfo(){
        if(getLoaiTaiSan()=="Giấy" || getLoaiTaiSan()=="Bút" ){
            System.out.println(getTenTaiSan() + getPhongBanSD());
        }
    }
    public void getUser(){
        if(getPhongBanSD()=="HR" || getPhongBanSD()=="CS" ){
            System.out.println(getTenTaiSan() + getLoaiTaiSan());
        }
    }
}
class ThietBi extends TaiSan{
    public void showInfo(){
            System.out.println(getTenTaiSan() + getNamNhap());
    }
    public void getUser(){
        if(getPhongBanSD()=="HR" || getPhongBanSD()=="CS" ){
            System.out.println(getTenTaiSan() + getLoaiTaiSan());
        }
    }
}
public class Bai5_3 {
}
