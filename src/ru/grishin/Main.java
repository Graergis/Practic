package ru.grishin;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Main {

    private static List<String> STUDENTS = new ArrayList<>();
    static Map<Double, String> SORT = new HashMap<>();
    static Map<Double, String> SORTTIME = new HashMap<>();
    static Map<Double, String> PROGRESS = new HashMap<>();

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
        System.out.println("Справка - help");
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print(">");
            String line = scan.nextLine();
            if (line.equals("Sergey Grishin") || line.equals("Grishin Sergey")) {
                GrishinSergei gs = new GrishinSergei(bool2);
                continue;
            }
            if (line.equals("Maksim Konshin") || line.equals("Konshin Maksim")) {
                MaksimKonshin mk = new MaksimKonshin(bool2);
                continue;
            }
            if (line.equals("Pavel Laptev") || line.equals("Laptev Pavel")) {
                PavelLaptev pl = new PavelLaptev(bool2);
                continue;
            }
            if (line.equals("Roman Kuznetsov") || line.equals("Kuznetsov Roman")) {
                RomanKuznetsov rk = new RomanKuznetsov(bool2);
                continue;
            }
            if (line.equals("Sergey Gilfanov") || line.equals("Gilfanov Sergey")) {
                SergeyGilfanov sgi = new SergeyGilfanov(bool2);
                continue;
            }
            if (line.equals("Sergey Piyanzin") || line.equals("Piyanzin Sergey")) {
                SergeyPiyanzin sp = new SergeyPiyanzin(bool2);
                continue;
            }
            if (line.equals("Vladislav Danilov") || line.equals("Danilov Vladislav")) {
                VladislavDanilov vd = new VladislavDanilov(bool2);
                continue;
            }
            if (line.equals("Kalinin Ivan") || line.equals("Ivan Kalinin")) {
                KalininIvan ki = new KalininIvan(bool2);
                continue;
            }
            if (line.equals("exit")) {
                return;
            }
            if (line.equals("ball")) {
                SORT = new TreeMap<>(SORT);
                Map<Double, String> n = new TreeMap<>();
                n.putAll(SORT);
                for (Map.Entry<Double, String> pair : n.entrySet()) {
                    Double key = pair.getKey();
                    double srBall2 = new BigDecimal(key).setScale(1, RoundingMode.HALF_UP).doubleValue();
                    String value = pair.getValue();
                    System.out.println("Средний балл - " + srBall2 + ". Студент - " + value);
                }
                continue;
            }
            if (line.equals("progress")) {
                PROGRESS = new TreeMap<>(PROGRESS);
                Map<Double, String> n = new TreeMap<>();
                n.putAll(PROGRESS);
                for (Map.Entry<Double, String> pair : n.entrySet()) {
                    String value = pair.getValue();
                    double key = pair.getKey();
                    if (key >= 4.0) {
                        System.out.println(value + " - Есть вероятность, что не будет отчислен");
                    } else if (key < 0) {
                        System.out.println(value + " - Закончил обучение");
                    } else {
                        System.out.println(value + " - Не пройдет");
                    }
                }
                continue;
            }
            if (line.equals("help")) {
                System.out.println("students - список студентов.");
                System.out.println("Список команд:");
                System.out.println("exit - выход.");
                System.out.println("Сортировки: ");
                System.out.println("progress - по успеваемости");
                System.out.println("ball - по среднему баллу");
                System.out.println("time - по времени до конца обучения");
                continue;
            }
            if (line.equals("students")) {
                System.out.println("Список студентов:");
                System.out.println("-----------------");
                for (int j = 0; j < STUDENTS.size(); j++) {
                    System.out.println(STUDENTS.get(j));
                }
                continue;
            }
            if (line.equals("time")) {
                SORTTIME = new TreeMap<>(SORTTIME);
                Map<Double, String> v = new TreeMap<>();
                v.putAll(SORTTIME);
                for (Map.Entry<Double, String> pair2 : v.entrySet()) {
                    Double key = pair2.getKey();
                    int time = (int) new BigDecimal(key).setScale(0, RoundingMode.HALF_UP).doubleValue();
                    String value = pair2.getValue();
                    if (time < 0) {
                        System.out.println(value + " - закончил обучение");
                    } else {
                        System.out.println(value + " - до конца обучения " + time + " д.");
                    }
                }
                continue;
            }
            System.out.println("Студент не найден/Неверная команда.");
        }
    }
}