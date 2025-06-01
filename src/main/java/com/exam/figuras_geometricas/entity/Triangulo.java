package com.exam.figuras_geometricas.entity;

import java.util.Arrays;
import java.util.Collections;

public class Triangulo extends FiguraGeometrica {

    private double base;
    private double altura;
    private double area;
    private double perimetro;
    private double [] lados ;

    public Triangulo(double [] lados, double base, double altura) {
        super(base, altura);
        this.lados = lados;
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        area = (base * altura )/2;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        perimetro = Arrays.stream(lados).sum();
        return perimetro;
    }



}
