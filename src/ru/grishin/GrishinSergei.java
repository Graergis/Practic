package ru.grishin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GrishinSergei {

    final static List<Integer> sg = new ArrayList<>();
    static double ball;

    public GrishinSergei() {
        int progress = 0;
        //curriculum J2EE Developer
        String startDate = "22.03.2016";
        progress += 24; //Version control systems
        progress += 16; //HTTP
        progress += 64; //HTML, CSS, JS basics
        progress += 40; //java basics
        progress += 32; //XML, JSON and parsers
        progress += 24; //Build tools Maven\ Gradle. Cl overview
        progress += 24; //Unit testing in Java
        progress += 24; //Design Principles (SOLID, YAGNI)
        progress += 40; //Advanced Java
        progress += 24; //Java WEB basics. Servlet container
        progress += 16; //Java WEB Services and REST clients
        progress += 32; //Databases basics
        progress += 24; //JDBC

        Rasschet rass = new Rasschet(startDate);

        Random r = new Random(System.currentTimeMillis());
        if (sg.size() < Rasschet.DAY) {
            for (int i = 0; i < Rasschet.DAY; i++) {
                int b = r.nextInt(3) + 3;
                sg.add(b);
                ball += b;
            }
        }
        Rasschet ras = new Rasschet(progress, ball);
    }
}
