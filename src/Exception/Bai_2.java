package Exception;


import java.io.*;

//      Viết 1 chương trình cho phép copy dữ liệu từ file 1 (dạng txt) sang file 2 (dạng txt).
//        Bạn cần bắt tất cả các lỗi liên quan (vd: file không tồn tại, thư mục không tồn tại, lỗi định dạng ....)
public class Bai_2 {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            File inFile = new File("E:\\Study\\IntelliJ IDEA Community Edition 2022.3.2\\demo\\untitled\\src\\Exception\\input.txt");
            File outFile = new File("E:\\Study\\IntelliJ IDEA Community Edition 2022.3.2\\demo\\untitled\\src\\Exception\\output.txt");

            inputStream = new FileInputStream(inFile);
            outputStream = new FileOutputStream(outFile);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0){
                outputStream.write(buffer,0,length);
            }
        } catch (FileNotFoundException fnf){
            System.out.println(fnf);
        } catch (IOException io){
            io.printStackTrace();
        } finally {
            inputStream.close();
            outputStream.close();
        }
    }

}
