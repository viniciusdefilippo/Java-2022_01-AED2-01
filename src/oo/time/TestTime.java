package oo.time;

import oo.data.Data;

public class TestTime {
    public static void main(String[] args) {

        Time t1 = new Time();
        System.out.println(t1);

        Time t2 = new Time(18);
        System.out.println(t2);

        Time t3 = new Time(18, 35);
        System.out.println(t3);

        Time t4 = new Time(23, 59, 59);
        System.out.println(t4);

        Time t5 = new Time();
        t5.setHora(40);
        t5.setMinuto(-14);
        t5.setSegundo(150000);
        System.out.println(t5);

    }
}
