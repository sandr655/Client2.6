package com.company;

import java.text.DecimalFormat;
import java.util.Random;

public class FunctionForClient {

    public static int Perevod(int id) {
        int per;
        int pe;
        for (int i = 1; 1 == 1; i++) {
            Random r = new Random();
            if (r.nextInt(100) < 60) {
                int a = 10;
                int b = 10;
                per = (int) (a + (Math.random() * b));
                pe = per;
                break;

            } else {
                int a2 = 20;
                int b2 = 30;
                per = (int) (a2 + (Math.random() * b2));
                pe = per;
                break;
            }
        }
        return pe;

    }

    public static String Date(int id){
        String date;
        DecimalFormat decimalFormat = new DecimalFormat("00");
        Random random = new Random(id);
        int minY = 1950;
        int maxY = 2020;
        int minD = 1;
        int maxD = 31;
        int minM = 1;
        int maxM = 13;
        int yyyy = minY + random.nextInt(maxY - minY);
        int dd = minD + random.nextInt(maxD - minD);
        int mm = minM + random.nextInt(maxM - minM);
        date = decimalFormat.format(dd)+"."+decimalFormat.format(mm)+"."+yyyy;
        return date;
    }

    public static int ZP(int id) {
            int zp;
        int minR = 100;
        int maxR = 601;
                Random r = new Random(id);
        zp = minR + r.nextInt(maxR - minR);
            return zp;
        }

    public static String Name(int id){
        String name;
        if(id >1000){
            id = id/1000;
        }
        int c = 0;
        if(id<5) {
            c = id + 5;
        }
        if (id >= 5 && id<=10) {
            c = id;
        }
        if (id <500 && id>10) {
            c = id/100+5;
        }
        if (id >=500 && id<=1000) {
            c = id/100;
        }

        RanS name2 = new RanS();
        name = RanS.RS(c,id);
        return name;
    }
}
