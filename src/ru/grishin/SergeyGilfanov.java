package ru.grishin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SergeyGilfanov {

    final static List<Integer> sgi = new ArrayList<>();
    static double ball;

    public SergeyGilfanov(boolean bool) {
        int programma = 0;
        String name = "Sergey Gilfanov";
        String curriculum = "J2EE Developer";
        String startDate = "21.03.2016";
        programma += 24; //Version control systems
        programma += 16; //HTTP

        Rasschet rass = new Rasschet(startDate, programma, name);

        Random r = new Random(System.currentTimeMillis());
        if (sgi.size() < Rasschet.DAY) {
            for (int i = 0; i < Rasschet.DAY; i++) {
                int b = r.nextInt(3) + 3;
                sgi.add(b);
                ball += b;
            }
        }
        double ball2 = ball / Rasschet.DAY;
        MaxBall maxBal = new MaxBall(programma, ball);
        Main.PROGRESS.put(MaxBall.MAXBALL + 0.006 , name);
        Main.SORT.put(ball2 + 0.006, name);
        if (bool) {
            Rasschet ras = new Rasschet(programma, ball, curriculum);
        }
    }
}