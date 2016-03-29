package ru.grishin;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Rasschet {

    public static int DAY;

    public Rasschet(String startDate) {
        String startDate1 = startDate;
        Date date2 = new java.util.Date();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date date1 = null;
        try {
            date1 = format.parse(startDate1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        long difference = date2.getTime() - date1.getTime();
        long days = difference / (24 * 60 * 60 * 1000);
        System.out.println("Прошло дней после поступления - " + days);
        DAY = (int) days;
        return;
    }

    public Rasschet(int programma, double ball) {
        int ost;
        int progress = DAY * 8;
        if (progress > programma) {
            System.out.println("Уже отучился");
        } else {
            double srBall = ball / DAY;
            double srBall2 = new BigDecimal(srBall).setScale(1, RoundingMode.HALF_UP).doubleValue();
            if (srBall2 >= 4.5) {
                System.out.println("Средний балл " + srBall2 + ". Может продолжать обучение.");
            } else {
                System.out.println("Средний балл " + srBall2 + ". Может быть отчислен");
            }
            ost = programma - progress;
            int d = ost % 8;
            if (d > 0) {
                int d2 = ost / 8;
                System.out.println("До окончания обучения по программе - " + (d2 + 1) + " дней (" + ost + " ч.)");
            } else {
                int d3 = ost / 8;
                System.out.println("До окончания обучения по программе - " + d3 + " дней (" + ost + " ч.)");
            }
        }
    }

}
