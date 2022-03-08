package oo.data;

public class TesteData {
    public static void main(String[] args) {

        Data d1 = new Data();
        System.out.println(d1.toString());

        Data d2 = new Data(9);
        System.out.println(d2.toString());

        Data d3 = new Data(9, 3);
        System.out.println(d3.toString());

        Data d4 = new Data(19,12,2022);
        System.out.println(d4.toString());

        Data d5 = new Data();
        d5.setDia(40);
        d5.setMes(-14);
        d5.setAno(150000);

        System.out.println(d5.toString());
    }
}
