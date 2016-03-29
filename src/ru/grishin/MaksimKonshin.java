package ru.grishin;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class MaksimKonshin {
    public static List<Integer> MK = new ArrayList<>();

    public MaksimKonshin() {
        int ost;
        int progr = 0;
        String curriculum = "J2EE Developer";
        String startDate = "22.03.2016";
        progr += 24; //Version control systems
        progr += 16; //HTTP
        progr += 64; //HTML, CSS, JS basics
        progr += 40; //java basics
        progr += 32; //XML, JSON and parsers
        progr += 24; //Build tools Maven\ Gradle. Cl overview
        progr += 24; //Unit testing in Java
        progr += 24; //Design Principles (SOLID, YAGNI)
        progr += 40; //Advanced Java
        progr += 24; //Java WEB basics. Servlet container
        progr += 16; //Java WEB Services and REST clients
        progr += 32; //Databases basics
        progr += 24; //JDBC

        String d1 = startDate;
        Date date2 = new java.util.Date();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date date1 = null;
        try {
            date1 = format.parse(d1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        long difference = date2.getTime() - date1.getTime();
        long days = difference / (24 * 60 * 60 * 1000);
        System.out.println("Прошло дней после поступления - " + days);
        int day = (int) days;
        double sred = 0;
        if (MK.size() < day) {
            sred = 0;
            Random r = new Random(System.currentTimeMillis());
            for (int i = 0; i < day; i++) {
                int c = r.nextInt(3) + 3;
                MK.add(c);
            }
        }
        System.out.print("Баллы за дни обучения - ");
        for (int j = 0; j < MK.size(); j++) {
            System.out.print(MK.get(j) + " ");
            sred += MK.get(j);
        }
        System.out.println("");
        double cc = sred / day;
        double newDouble = new BigDecimal(cc).setScale(1, RoundingMode.HALF_UP).doubleValue();
        if (newDouble >= 4.5) {
            System.out.println("Средний балл " + newDouble + ". Может продолжать обучение.");
        } else {
            System.out.println("Средний балл " + newDouble + ". Может быть отчислен");
        }
        int p = day * 8;
        if (p > progr) {
            System.out.println("Уже отучился");
        } else {
            ost = progr - p;
            int d = ost % 8;
            if (d > 0) {
                int d2 = ost / 8;
                System.out.println("До окончания обучения по программе - " + (d2 + 1) + " дней (" + ost + " ч.)");
            } else {
                System.out.println("До окончания обучения по программе - " + d + " дней (" + ost + " ч.)");
            }
        }
    }
}
