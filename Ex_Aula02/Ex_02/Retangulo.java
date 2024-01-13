package br.com.ada.pooii.Ex_Aula02.Ex_02;

public class Retangulo implements Shape{
    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return comprimento * largura;
    }
}
