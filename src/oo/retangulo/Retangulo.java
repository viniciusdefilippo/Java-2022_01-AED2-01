package oo.retangulo;

public class Retangulo {

    private float base;
    private float altura;

    public Retangulo() {
        this.base = 0;
        this.altura = 0;
    }

    public Retangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float calcularArea() {
        return altura * base;
    }

    public float calcularPerimetro() {
        return 2 * (altura + base);
    }
}
