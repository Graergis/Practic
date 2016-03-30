package ru.grishin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GrishinSergei {

    final static List<Integer> sg = new ArrayList<>();
    static double ball;

    public GrishinSergei(boolean bool) {
        int programma = 0;
        String name = "Sergey Grishin";
        String curriculum = "J2EE Developer";
        String startDate = "22.03.2016";
        programma += 24; //Version control systems
        programma += 16; //HTTP
        programma += 40; //java basics
        programma += 32; //XML, JSON and parsers
        programma += 24; //Build tools Maven\ Gradle. Cl overview
        programma += 24; //Unit testing in Java
        programma += 24; //Design Principles (SOLID, YAGNI)
        programma += 40; //Advanced Java
        programma += 24; //Java WEB basics. Servlet container

        Rasschet rass = new Rasschet(startDate, programma, name);

        Random r = new Random(System.currentTimeMillis());
        if (sg.size() < Rasschet.DAY) {
            for (int i = 0; i < Rasschet.DAY; i++) {
                int b = r.nextInt(3) + 3;
                sg.add(b);
                ball += b;
            }
        }
        MaxBall maxBal = new MaxBall(programma, ball);
        Main.PROGRESS.put(MaxBall.MAXBALL, name);
        Main.SORT.put(ball + 0.001, name);
        if (bool) {
            Rasschet ras = new Rasschet(programma, ball, curriculum);
        }
    }
}