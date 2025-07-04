package com.exam.figuras_geometricas.entity;

public class FigureRequest {
    private String tipo;
    private double radio;
    private double base;
    private double altura;
    private double [] lados;

    public FigureRequest(String tipo, double radio, double base, double altura, double[] lados) {
        this.tipo = tipo;
        this.radio = radio;
        this.base = base;
        this.altura = altura;
        this.lados = lados;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double[] getLados() {
        return lados;
    }

    public void setLados(double[] lados) {
        this.lados = lados;
    }
}
