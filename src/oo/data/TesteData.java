package oo.data;

public class TesteData {
    public static void main(String[] args) {

        Data d1 = new Data();
        System.out.println(d1);

        Data d2 = new Data(9);
        System.out.println(d2);

        Data d3 = new Data(9, 3);
        System.out.println(d3);

        Data d4 = new Data(19,12,2022);
        System.out.println(d4);

        Data d5 = new Data();
        d5.setDia(40);
        d5.setMes(-14);
        d5.setAno(150000);

        System.out.println(d5);
    }
}
