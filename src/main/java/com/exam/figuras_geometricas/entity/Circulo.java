package com.exam.figuras_geometricas.entity;

public class Circulo extends FiguraGeometrica {

    private double radio;
    private double area;
    private double perimetro;

    public Circulo(double radio) {
        super(radio);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    @Override
    public double calcularPerimetro( ) {
        perimetro = Math.PI*radio;
        return perimetro;
    }


}
