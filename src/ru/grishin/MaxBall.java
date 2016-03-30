package ru.grishin;

public class MaxBall  {

    public static double MAXBALL;
    public MaxBall(int programma, double ball) {
        int maxDay = programma / 8;
        int md = programma % 8;
        if (md > 0) {
            maxDay += 1;
        }
        int ost = programma / 8;
        ost -= Rasschet.DAY;
        ost *= 5;
        MAXBALL = ost + ball;
        MAXBALL /= maxDay;
        MAXBALL += 0.001;
    }
}
