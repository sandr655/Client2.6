package com.company;

import java.text.DecimalFormat;
import java.util.Random;

public class FunctionForClient {

    public static int Perevod(int id) {
        int per;

        for (int i = 1; 1 == 1; i++) {
            Random r = new Random();
           int pe = r.nextInt(100);
            if (pe < 60) {
                int minR = 1;
                int maxR = 20;
                Random ran = new Random();
                per = minR + ran.nextInt(maxR - minR);
                break;

            }
            else if (pe >= 60) {
                int minR = 20;
                int maxR = 51;
                Random ran = new Random();
             per = minR + ran.nextInt(maxR - minR);
                break;
            }
        }
        return per;

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
        for(int i = 1; 1==1; i++) {
            Random r = new Random();
            int ra = r.nextInt(100);

            if ( ra < 70){
                int minR = 100;
                int maxR = 300;
                Random ran = new Random(id);
                zp = minR + ran.nextInt(maxR - minR);
                break;
            }
            else if ( ra >= 70 && ra < 90){
                int minR = 300;
                int maxR = 500;
                Random ran = new Random(id);
                zp = minR + ran.nextInt(maxR - minR);
                break;
            }
            else  if (ra >= 90){
                int minR = 500;
                int maxR = 601;
                Random ran = new Random(id);
                zp = minR + ran.nextInt(maxR - minR);
                break;
            }
        }
            return zp;
        }

    public static String Name(int id){
        String name;
        if(id >1000){
            id = id/1000;
        }
        int c = 0;
        if (id<5) {
            c = id + 5;
        }
        else if (id >= 5 && id<=10) {
            c = id;
        }
        else if (id <500 && id>10) {
            c = id/100+5;
        }
        else if (id >=500 && id<=1000) {
            c = id/100;
        }

        RanS name2 = new RanS();
        name = RanS.RS(c,id);
        return name;
    }
}
