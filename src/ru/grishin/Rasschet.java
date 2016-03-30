package ru.grishin;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Rasschet {

    public static int DAY;
    static double balans = 0.001;

    public Rasschet(String startDate, int programma0, String name) {
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
        DAY = (int) days;
        int ost;
        int progress = DAY * 8;
        ost = programma0 - progress;
        int d = ost % 8;
        balans += 0.001;
        if (d > 0) {
            double d2 = ost / 8;
            d2 += 1;
            d2 += balans;
            Main.SORTTIME.put(d2, name);
        } else {
            double d2 = ost / 8;
            d2 += balans;
            Main.SORTTIME.put(d2, name);
        }
    }

    public Rasschet(int programma, double ball, String curriculum) {
        System.out.println("Прошло дней после поступления - " + DAY);
        int ost;
        int progress = DAY * 8;
        double srBall = ball / DAY;
        double srBall2 = new BigDecimal(srBall).setScale(1, RoundingMode.HALF_UP).doubleValue();
        ost = programma - progress;
        int d = ost % 8;
        if (progress > programma) {
            System.out.println("Закончил обучение");
            if (srBall2 >= 4.0) {
                System.out.println("Со средним баллом " + srBall2 + " был принят на работу");
            } else {
                System.out.println("Увы и ах. Средний балл был всего " + srBall2);
            }
        } else {
            if (d > 0) {
                int d2 = ost / 8;
                System.out.println("До окончания обучения по программе " + curriculum + " " + (d2 + 1) + " д. (" + ost + " ч.)");
            } else {
                int d3 = ost / 8;
                System.out.println("До окончания обучения по программе " + curriculum + " " + d3 + " д. (" + ost + " ч.)");
            }
            if (srBall2 >= 4.0) {
                System.out.println("Средний балл " + srBall2);
            } else {
                System.out.println("Средний балл " + srBall2);
            }
        }
    }
}