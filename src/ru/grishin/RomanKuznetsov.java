package ru.grishin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RomanKuznetsov {

    final static List<Integer> rk = new ArrayList<>();
    static double ball;

    public RomanKuznetsov(boolean bool) {
        int programma = 0;
        String name = "Roman Kuznetsov";
        String curriculum = "J2EE Developer";
        String startDate = "22.03.2016";
        programma += 24; //Java WEB basics. Servlet container
        programma += 16; //Java WEB Services and REST clients
        programma += 32; //Databases basics

        Rasschet rass = new Rasschet(startDate, programma, name);

        Random r = new Random(System.currentTimeMillis());
        if (rk.size() < Rasschet.DAY) {
            for (int i = 0; i < Rasschet.DAY; i++) {
                int b = r.nextInt(3) + 3;
                rk.add(b);
                ball += b;
            }
        }
        MaxBall maxBal = new MaxBall(programma, ball);
        Main.PROGRESS.put(MaxBall.MAXBALL, name);
        Main.SORT.put(ball + 0.005, name);
        if (bool) {
            Rasschet ras = new Rasschet(programma, ball, curriculum);
        }
    }
}