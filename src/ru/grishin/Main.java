package ru.grishin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<String> STUDENTS = new ArrayList<>();

    public static void main(String[] args) {
        STUDENTS.add("Sergey Grishin");
        STUDENTS.add("Maksim Konshin");
        STUDENTS.add("Pavel Laptev");
        STUDENTS.add("Roman Kuznetsov");
        STUDENTS.add("Sergey Gilfanov");
        STUDENTS.add("Sergey Piyanzin");
        STUDENTS.add("Vladislav Danilov");
        STUDENTS.add("Kalinin Ivan");
        System.out.println("Для справки введите - help. Для выхода - exit");
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print(">");
            String line = scan.nextLine();
            if (!line.equals("help")) {
                if (line.equals("Sergey Grishin")) {
                    GrishinSergei gs = new GrishinSergei();
                    continue;
                }
                if (line.equals("Maksim Konshin")) {
                    MaksimKonshin mk = new MaksimKonshin();
                    continue;
                }
                if (line.equals("Pavel Laptev")) {
                    PavelLaptev pl = new PavelLaptev();
                    continue;
                }
                if (line.equals("Roman Kuznetsov")) {
                    RomanKuznetsov rk = new RomanKuznetsov();
                    continue;
                }
                if (line.equals("Sergey Gilfanov")) {
                    SergeyGilfanov sgi = new SergeyGilfanov();
                    continue;
                }
                if (line.equals("Sergey Piyanzin")) {
                    SergeyPiyanzin sp = new SergeyPiyanzin();
                    continue;
                }
                if (line.equals("Vladislav Danilov")) {
                    VladislavDanilov vd = new VladislavDanilov();
                    continue;
                }
                if (line.equals("Kalinin Ivan")) {
                    KalininIvan ki = new KalininIvan();
                    continue;
                }
                if (line.equals("exit")) {
                    return;
                }
            } else if (line.equals("help")) {
                System.out.println("Список студентов:");
                for (int j = 0; j < STUDENTS.size(); j++) {
                    System.out.println(STUDENTS.get(j));
                }
            } else {
                System.out.println("Студент не найден.");
            }
        }
    }
}
