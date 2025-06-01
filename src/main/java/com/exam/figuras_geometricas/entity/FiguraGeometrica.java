package com.exam.figuras_geometricas.entity;

public abstract class FiguraGeometrica {

    public FiguraGeometrica(double radio) {
    }

    public FiguraGeometrica(double base, double altura) {
    }

    public abstract double calcularArea( );
    public abstract double calcularPerimetro( );

}
