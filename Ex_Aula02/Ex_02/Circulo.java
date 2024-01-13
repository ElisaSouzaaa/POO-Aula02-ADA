package br.com.ada.pooii.Ex_Aula02.Ex_02;

public class Circulo implements Shape{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
