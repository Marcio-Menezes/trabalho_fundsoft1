package com.company;

public abstract class Veiculos {

    private String placa, marca, modelo;
    private int ano;
    private double valor;

    public Veiculos(String placa, String marca, String modelo, int ano, double valor){
        this.placa = placa;
        this.marca = marca;
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Veículos{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", valor=" + valor +
                '}';

    }
}
