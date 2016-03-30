package ru.grishin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class KalininIvan {

    final static List<Integer> ki = new ArrayList<>();
    static double ball;

    public KalininIvan(boolean bool) {
        int programma = 0;
        String name = "Kalinin Ivan";
        String curriculum = "J2EE Developer";
        String startDate = "22.03.2016";
        programma += 24; //Version control systems
        programma += 40; //java basics
        programma += 24; //Design Principles (SOLID, YAGNI)
        programma += 24; //Java WEB basics. Servlet container
        programma += 16; //Java WEB Services and REST clients
        programma += 32; //Databases basics
        programma += 24; //JDBC

        Rasschet rass = new Rasschet(startDate, programma, name);

        Random r = new Random(System.currentTimeMillis());
        if (ki.size() < Rasschet.DAY) {
            for (int i = 0; i < Rasschet.DAY; i++) {
                int b = r.nextInt(3) + 3;
                ki.add(b);
                ball += b;
            }
        }
        double ball2 = ball / Rasschet.DAY;
        MaxBall maxBal = new MaxBall(programma, ball);
        Main.PROGRESS.put(MaxBall.MAXBALL + 0.002 , name);
        Main.SORT.put(ball2 + 0.002, name);
        if (bool) {
            Rasschet ras = new Rasschet(programma, ball, curriculum);
        }
    }
}