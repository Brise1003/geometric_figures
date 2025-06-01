package com.exam.figuras_geometricas.entity;

public class Rectangulo extends FiguraGeometrica {

    private double base;
    private double altura;
    private double area;
    private double perimetro;

    public Rectangulo(double base, double altura) {
        super(base, altura);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        area = base * altura ;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        perimetro = 2 * ( base + altura );
        return perimetro;
    }
}
