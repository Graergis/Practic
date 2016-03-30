package ru.grishin;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Main {

    public static List<String> STUDENTS = new ArrayList<>();
    public static Map<Double, String> SORT = new HashMap<>();

    public static void main(String[] args) {
        STUDENTS.add("Sergey Grishin");
        STUDENTS.add("Maksim Konshin");
        STUDENTS.add("Pavel Laptev");
        STUDENTS.add("Roman Kuznetsov");
        STUDENTS.add("Sergey Gilfanov");
        STUDENTS.add("Sergey Piyanzin");
        STUDENTS.add("Vladislav Danilov");
        STUDENTS.add("Kalinin Ivan");
        boolean bool = false;
        boolean bool2 = true;
        GrishinSergei gs2 = new GrishinSergei(bool);
        KalininIvan ki2 = new KalininIvan(bool);
        MaksimKonshin mk2 = new MaksimKonshin(bool);
        PavelLaptev pl2 = new PavelLaptev(bool);
        RomanKuznetsov rk2 = new RomanKuznetsov(bool);
        SergeyGilfanov sgi2 = new SergeyGilfanov(bool);
        SergeyPiyanzin sp2 = new SergeyPiyanzin(bool);
        VladislavDanilov vd2 = new VladislavDanilov(bool);
        System.out.println("Справка по студентам - help. Выхода - exit");
        System.out.println("Сортировка по среднему баллу - sortirovka");
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print(">");
            String line = scan.nextLine();
            if (!line.equals("help")) {
                if (line.equals("Sergey Grishin")) {
                    GrishinSergei gs = new GrishinSergei(bool2);
                    continue;
                }
                if (line.equals("Maksim Konshin")) {
                    MaksimKonshin mk = new MaksimKonshin(bool2);
                    continue;
                }
                if (line.equals("Pavel Laptev")) {
                    PavelLaptev pl = new PavelLaptev(bool2);
                    continue;
                }
                if (line.equals("Roman Kuznetsov")) {
                    RomanKuznetsov rk = new RomanKuznetsov(bool2);
                    continue;
                }
                if (line.equals("Sergey Gilfanov")) {
                    SergeyGilfanov sgi = new SergeyGilfanov(bool2);
                    continue;
                }
                if (line.equals("Sergey Piyanzin")) {
                    SergeyPiyanzin sp = new SergeyPiyanzin(bool2);
                    continue;
                }
                if (line.equals("Vladislav Danilov")) {
                    VladislavDanilov vd = new VladislavDanilov(bool2);
                    continue;
                }
                if (line.equals("Kalinin Ivan")) {
                    KalininIvan ki = new KalininIvan(bool2);
                    continue;
                }
                if (line.equals("exit")) {
                    return;
                }
                if (line.equals("sortirovka")) {
                    SORT = new TreeMap<>(SORT);
                    Map <Double, String> n = new TreeMap<>();
                    n.putAll(SORT);
                    for(Map.Entry<Double, String> pair : n.entrySet()){
                        Double key = pair.getKey();
                        double srBall = key / Rasschet.DAY;
                        double srBall2 = new BigDecimal(srBall).setScale(1, RoundingMode.HALF_UP).doubleValue();
                        String value = pair.getValue();
                        System.out.println("Средний балл - " + srBall2 + ". Имя студента - " + value);
                    }
                } else {
                    System.out.println("Студент не найден.");

                }
            } else if (line.equals("help")) {
                System.out.println("Список студентов:");
                System.out.println("-----------------");
                for (int j = 0; j < STUDENTS.size(); j++) {
                    System.out.println(STUDENTS.get(j));
                }
            }
        }
    }
}
