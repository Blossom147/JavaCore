package Exception;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

//Tạo 1 mảng dữ liệu tên ListOfNumbers cho phép nhập các giá trị từ short, int, double...
//Thêm một phương thức có tên readList vào ListOfNumbers.
//Phương thức này có nhiệm vụ đọc các giá trị kiểu int từ ListOfNumbers, in ra từng giá trị, và thêm chúng vào mảng ListOfFinal.
public class Bai_1 {
    private ArrayList<Double> victor;
    static int n =0;
    public static Scanner scanner = new Scanner(System.in);

    public  Bai_1(){
        n = scanner.nextInt();
        victor = new ArrayList<Double>(n);
        System.out.println("Nhap phan tu: ");
        for (int i = 0; i < n;i++){
            System.out.print("a["+i+"]= " );
            double k = scanner.nextDouble();
            victor.add(k);
        }
        this.readList();

    }
    public static void main(String[] args) {
        new Bai_1();
    }
    public void readList() {
        System.out.print("Mảng vừa nhập là: ");
        for (int i = 0; i < victor.size(); i++) {
            System.out.print(victor.get(i) + " ");
        }

    }

    private static int check_real_integer_number(double c){
        //flag = 1 => số nguyên
        //flag = 0 => số thực

        int flag = 1;
        if (Math.ceil(c) != Math.floor(c)) flag = 0;
        return flag;
    }


}
