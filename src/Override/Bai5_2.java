package Override;

import java.util.Date;

class ThongBao{
String NoiDung,LoaiTB;


    public ThongBao(){

    }
    public ThongBao(String noiDung, String loaiTB, Date ngayThongBao) {
        NoiDung = noiDung;
        LoaiTB = loaiTB;
        NgayThongBao = ngayThongBao;
    }

    public String getNoiDung() {
        return NoiDung;
    }

    public void setNoiDung(String noiDung) {
        NoiDung = noiDung;
    }

    public String getLoaiTB() {
        return LoaiTB;
    }

    public void setLoaiTB(String loaiTB) {
        LoaiTB = loaiTB;
    }

    public Date getNgayThongBao() {
        return NgayThongBao;
    }

    public void setNgayThongBao(Date ngayThongBao) {
        NgayThongBao = ngayThongBao;
    }

    Date NgayThongBao;
    public String toString() {
        return NoiDung;
    }
}

class TBDinhKy extends ThongBao{
    public String toString() {
        if(getLoaiTB() == "SN")
            return NoiDung  = "Chuc mung sinh nhat";
        else if(getLoaiTB() == "BIL") return NoiDung  = "Tra tien hoa don";
        else return null;
    }
}

class TBDotXuat extends ThongBao{
    public String toString() {
        if(getLoaiTB() == "H")
            return NoiDung  = "Hop dot xuat";
        else return null;

    }
}
public class Bai5_2 {

    public static void main(String args[]) {
        ThongBao tb = new TBDinhKy();
        tb.setLoaiTB("BIL");
        System.out.println(tb);
    }
}
