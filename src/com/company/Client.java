package com.company;

import java.text.DecimalFormat;
import java.util.Random;

public class Client {

    int id;
    String name;
    static int zp;
    String date;
    int per;


    public Client(int id){
        this.id = id;
        this.zp = FunctionForClient.ZP(id);
        this.name = FunctionForClient.Name(id);
        this.per = FunctionForClient.Perevod(id);
        this.date = FunctionForClient.Date(id);

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getZp() {
        return zp;
    }

    public String getDate() {
        return date;
    }

    public int getPer() {
        return per;
    }
}


