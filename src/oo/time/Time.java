package oo.time;

public class Time {

    private int hora, minuto, segundo;

    public Time() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Time(int hora) {
        setHora(hora);
        this.minuto = 0;
        this.segundo = 0;
    }

    public Time(int hora, int minuto) {
        setHora(hora);
        setMinuto(minuto);
        this.segundo = 0;
    }

    public Time(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if ((hora >= 0) && (hora < 24)) this.hora = hora;
        else this.hora = 0;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if ((minuto >= 0) && (minuto < 60)) this.minuto = minuto;
        else this.minuto = 0;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if ((segundo >= 0) && (segundo < 60)) this.segundo = segundo;
        else this.segundo = 0;
    }

    public String toString() {
        String h = convertIntToString(hora);
        String m = convertIntToString(minuto);
        String s = convertIntToString(segundo);

        if (h.length() == 1) {
            h = "0" + h;
        }
        if (m.length() == 1) {
            m = "0" + m;
        }
        if (s.length() == 1) {
            s = "0" + s;
        }
        return h + ":" + m + ":" + s;
    }

    private String convertIntToString(int num) {
        return Integer.toString(num);
    }
}
