import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Bai3_Date {
    public static void main(String[] args) {
        int year,month,day,hour,minutes,second;
        Scanner scanner = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
        LocalDateTime localDateTime = LocalDateTime.now();
        do {
            System.out.println("Nhập năm (0-9999): ");
            year = scanner.nextInt();
        }while (year < 0 || year > 9999);

        do {
            System.out.println("Nhập tháng (1-12)");
            month = scanner.nextInt();
        }while (month < 1 || month > 12);

        do {
            System.out.println("Nhập ngày (1-31)");
            day = scanner.nextInt();
        }while (day < 1 || day > 31);

//        do {
//            System.out.println("Nhập giờ (1-24)");
//            hour = scanner.nextInt();
//        }while (hour < 1 || hour > 24);
//
//        do {
//            System.out.println("Nhập phút (0-59)");
//            minutes = scanner.nextInt();
//        }while (minutes < 0 || minutes > 59);
//
//        do {
//            System.out.println("Nhập giây (0-59)");
//            second = scanner.nextInt();
//        }while (second < 0 || second > 59);

//        bài 1: Covert ngày giờ hiện tại

//        DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        String formattedDate = localDateTime.format(date);
//        String formattedDateTime = localDateTime.format(dateTime);
//
//        System.out.println(formattedDate);
//        System.out.println(formattedDateTime);

//        Bài 2: Nhập thông tin ngày tháng sau đó convert
//
//        LocalDate localDate = LocalDate.of(year,month,day);
//        DateTimeFormatter date1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        DateTimeFormatter date2 = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
//        DateTimeFormatter date3 = DateTimeFormatter.ofPattern("yy-MM-dd");
//
//        String formattedDate1 = localDate.format(date1);
//        String formattedDate2 = localDate.format(date2);
//        String formattedDate3 = localDate.format(date3);
//        System.out.println(formattedDate1 +"\n"+ formattedDate2+"\n"+ formattedDate3);

//        Bài 3: Nhập thông tin sau dó convert

//        LocalTime localTime = LocalTime.of(hour,minutes,second);
//        DateTimeFormatter time1 = DateTimeFormatter.ofPattern("HH:mm:ss");
//        DateTimeFormatter time2 = DateTimeFormatter.ofPattern("hh:mm:ss a");
//        String formattedDate1 = localTime.format(time1);
//        String formattedDate2 = localTime.format(time2);
//        System.out.println(formattedDate1 +"\n"+ formattedDate2);

//        Bài 4 : Kiểm tra ngày nhập có lớn hơn ngày hiên tại không

//        int getDay = localDateTime.getDayOfMonth();
//        boolean result = (getDay > day) ? true : false;
//        System.out.println(result);

//        Bài 5: Cắt thời gian hiện tại và in ra màn hình

//        int getYear,getMonth,getDay,getHour,getMinutes,getSecond;
//        getYear = localDateTime.getYear();
//        getMonth = localDateTime.getMonthValue();
//        getDay = localDateTime.getDayOfMonth();
//        getHour = localDateTime.getHour();
//        getMinutes =localDateTime.getMinute();
//        getSecond = localDateTime.getSecond();
//
//        System.out.println(getYear + "/" + getMonth +"/" + getDay +"\t" + getHour +":" + getMinutes +":" + getSecond);

//        Bài 6 Kiểm tra nếu ngày nhập < 15 ngày và > 15 ngày so với ngày hiện tại thông báo không phù hợp.


//        Date date = cal.getTime();
//        System.out.println("Ngày hiện tại là " + date);
//
//        LocalDate localDate = LocalDate.now();
//        // Get Day of Year
//        int dayOfYear = localDate.getDayOfYear();
//        int dayPast = dayOfYear -15;
//        int dayFutu = dayOfYear + 15;
//        LocalDate dateInsert = LocalDate.of(year,month,day);
//        int dayInsert = dateInsert.getDayOfYear();
//        if(dayInsert < dayPast || dayInsert > dayFutu){
//            System.out.println("Không hợp lệ");
//        }else {
//            System.out.println("Họp lệ");
//        }

//        Bài 7: Tìm ngày cuối của tháng
//            cal.set(year,month-1,day);
//            int getDay = cal.getActualMaximum(Calendar.DATE);
//            System.out.println(getDay);

//        Bài 8: Tìm thứ của ngày nhập vào

//            cal.set(year,month,day);
//            Date day = cal.getTime();
//            String dayOfWeek = new SimpleDateFormat("EEEE").format(day);
//            System.out.println(dayOfWeek);
    }
}
