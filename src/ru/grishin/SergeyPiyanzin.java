package ru.grishin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SergeyPiyanzin {

    final static List<Integer> sp = new ArrayList<>();
    static double ball;

    public SergeyPiyanzin(boolean bool) {
        int programma = 0;
        String name = "Sergey Piyanzin";
        String curriculum = "J2EE Developer";
        String startDate = "22.03.2016";
        programma += 24; //Version control systems
        programma += 40; //java basics
        programma += 32; //XML, JSON and parsers
        programma += 24; //Build tools Maven\ Gradle. Cl overview
        programma += 24; //Unit testing in Java

        Rasschet rass = new Rasschet(startDate, programma, name);

        Random r = new Random(System.currentTimeMillis());
        if (sp.size() < Rasschet.DAY) {
            for (int i = 0; i < Rasschet.DAY; i++) {
                int b = r.nextInt(3) + 3;
                sp.add(b);
                ball += b;
            }
        }
        double ball2 = ball / Rasschet.DAY;
        MaxBall maxBal = new MaxBall(programma, ball);
        Main.PROGRESS.put(MaxBall.MAXBALL + 0.004 , name);
        Main.SORT.put(ball2 + 0.004, name);
        if (bool) {
            Rasschet ras = new Rasschet(programma, ball, curriculum);
        }
    }
}