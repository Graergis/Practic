package ru.grishin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PavelLaptev {

    final static List<Integer> pl = new ArrayList<>();
    static double ball;

    public PavelLaptev() {
        int progr = 0;
        //curriculum J2EE Developer
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

        Rasschet rass = new Rasschet(startDate);

        Random r = new Random(System.currentTimeMillis());
        if (pl.size() < Rasschet.DAY) {
            for (int i = 0; i < Rasschet.DAY; i++) {
                int b = r.nextInt(3) + 3;
                pl.add(b);
                ball += b;
            }
        }
        Rasschet ras = new Rasschet(progr, ball);
    }
}
