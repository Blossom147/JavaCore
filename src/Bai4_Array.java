import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Bai4_Array {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        cars.add("a");
        cars.add("c");
        cars.add("w");
        cars.add("e");
        cars.add("a");

        numbers.add(12);
        numbers.add(1);
        numbers.add(0);
        numbers.add(1);
        numbers.add(0);
        numbers.add(0);
        numbers.add(5);
        numbers.add(2);
        numbers.add(3);

//      Bài 1 : Sắp xếp mảng

//        System.out.print("Mảng trước khi sắp xếp: ");
//        for (String i : cars) {
//            System.out.print( i+ "\t" );
//        }
//        Collections.sort(cars);
//
//        System.out.print("\nMảng sau khi sắp xếp: ");
//        for (String i : cars) {
//            System.out.print(i + "\t");
//        }
//
//
//        System.out.print("\nMảng trước khi sắp xếp: ");
//        for (int i : numbers) {
//            System.out.print(i+ "\t" );
//        }
//        Collections.sort(numbers);
//
//        System.out.print("\nMảng sau khi sắp xếp: ");
//        for (int i : numbers) {
//            System.out.print(i +"\t");
//        }
//        bài 2: tính trung bình mảng

//        double sum = 0;
//        for (int i : numbers){
//            sum += i;
//        }
//
//        double tb = sum/numbers.size();
//        System.out.println("\nTrung bình mảng = " + tb);

//        Bài 3: TÌm giá trị > 10
//        System.out.print("\nCác giá trị lớn hơn 10: ");
//        for (int i : numbers){
//           if (i>10){
//               System.out.print(i + "\t");
//           }
//        }

//        Bài 4: Xóa 1 phần tử trong mảng chữ

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập phần tử muốn xóa: ");
//        String k = scanner.nextLine();
//        for (int i = 0; i < cars.size();i++){
//            cars.remove(k);
//        }
//        for (String i : cars) {
//            System.out.print(i + "\t");
//        }
//        Bài 5: Tìm giá trị lớn thứ 2 và nhỏ thứ 2 trong mảng

//
//        int n, secondMax,secondMin;
//        int largest = secondMax = Integer.MIN_VALUE;
//        int min = secondMin = Integer.MAX_VALUE;
//        System.out.println("Nhập số phần tử của mảng: ");
//        n = scanner.nextInt();
//
//        if (n < 2) {
//            System.out.printf("Không tồn tại phần tử lớn thứ 2");
//            return;
//        }
//        int arr[] = new int[n];
//        System.out.println("Nhập các phần tử cho mảng: ");
//        for (int i = 0; i < n; i++) {
//            System.out.print("Nhập phần tử thứ " + i + ": ");
//            arr[i] = scanner.nextInt();
//        }
//
//        for (int i = 0; i < n; i++) {
//            largest = Math.max(largest, arr[i]);
//        }
//        for (int i = 0; i < n; i++) {
//            if (arr[i] != largest)
//                secondMax = Math.max(secondMax, arr[i]);
//        }
//        System.out.println("Phần tử lớn 2: " + secondMax);
//
//        for (int i = 0; i < n; i++) {
//            min = Math.min(min, arr[i]);
//        }
//        for (int i = 0; i < n; i++) {
//            if (arr[i] != min)
//                secondMin = Math.min(secondMin, arr[i]);
//        }
//        System.out.println("phần tử bé thứ 2: " + secondMin);


//      Bài 6: chuyển đổi từ ArrayList sang Array.

//        String[] arr = {"Java","PHP","C#"};
//        ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
//        list.add("Laravel");
//        System.out.println(list);

//        Bài 7 :dịch chuyển toàn bộ số 0 về cuối mảng.

//        int[] arr = new int[]{1,0,0,0,3,4,5};
//        ArrayList<Integer> arr_new = new ArrayList<>();
//        int j=0,k=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]!=j){
//                arr_new.add(arr[i]);
//            }if(arr[i] == j){
//                k++;
//            }
//        }
//        for (int i = 0; i < k;i++){
//            arr_new.add(0);
//        }
//        System.out.println("Trước :" + Arrays.toString(arr));
//        System.out.println("Sau :" + arr_new);

//        Bài 8:chuyển các giá trị dương của mảng cha về mảng con.

//        int[] arr = new int[]{1,0,0,0,3,4,5};
//        ArrayList<Integer> arr_new = new ArrayList<>();
//        for(int i=0;i<arr.length;i++){
//            if(arr[i] > 0){
//                arr_new.add(arr[i]);
//            }
//        }
//        System.out.println("Mảng cha :" + Arrays.toString(arr));
//        System.out.println("Mảng con :" + arr_new);
    }

}
