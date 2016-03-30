package ru.grishin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VladislavDanilov {

    final static List<Integer> vd = new ArrayList<>();
    static double ball;

    public VladislavDanilov(boolean bool) {
        int programma = 0;
        String curriculum = "J2EE Developer";
        String startDate = "22.03.2016";
        programma += 24; //Version control systems
        programma += 16; //HTTP
        programma += 64; //HTML, CSS, JS basics
        programma += 40; //java basics
        programma += 32; //XML, JSON and parsers
        programma += 24; //Build tools Maven\ Gradle. Cl overview
        programma += 24; //Unit testing in Java
        programma += 24; //Design Principles (SOLID, YAGNI)
        programma += 40; //Advanced Java
        programma += 24; //Java WEB basics. Servlet container
        programma += 16; //Java WEB Services and REST clients
        programma += 32; //Databases basics
        programma += 24; //JDBC

        Rasschet rass = new Rasschet(startDate);

        Random r = new Random(System.currentTimeMillis());
        if (vd.size() < Rasschet.DAY) {
            for (int i = 0; i < Rasschet.DAY; i++) {
                int b = r.nextInt(3) + 3;
                vd.add(b);
                ball += b;
            }
        }
        Main.SORT.put(ball+0.003, "Vladislav Danilov");
        if(bool) {
            Rasschet ras = new Rasschet(programma, ball, curriculum);
        }
    }
}
