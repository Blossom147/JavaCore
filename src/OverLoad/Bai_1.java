package OverLoad;

import java.util.Date;

public class Bai_1 {
    public void showNotification(String abc, String s){
        System.out.println("Welcome customer");
    }
    public void showNotification(String message){
        System.out.println(message);
    }
    public void showNotification(String message, Date scheduleDate){
        System.out.println(scheduleDate);
    }

    public static void main(String[] args) {
        Bai_1 test = new Bai_1();
        test.showNotification("awlcmax");
        test.showNotification("abc", "14/06/2001");
    }
}
