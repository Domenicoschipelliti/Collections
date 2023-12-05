package es1;

import java.util.Objects;

public class Utente {
    private String parola;
    private int num;



    public String getParola() {
        return parola;
    }

    public int getNum() {
        return num;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public void setNum(int num) {
        this.num = num;
    }


    @Override
    public String toString() {
        return "Utente{" +
                "parola='" + parola + '\'' +
                ", num=" + num +
                '}';
    }


}
