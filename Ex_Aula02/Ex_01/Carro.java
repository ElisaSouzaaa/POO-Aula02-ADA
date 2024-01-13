package br.com.ada.pooii.Ex_Aula02.Ex_01;

public class Carro implements Veiculo{
    @Override
    public void ligar() {
        System.out.println("Carro ligando");
    }

    @Override
    public void desligar() {
        System.out.println("Carro desligando");
    }

    @Override
    public void acelerar(int velocidade) {
        System.out.println("Velocidade do carro: " + velocidade + "km/h");
    }

    @Override
    public void frear() {
        System.out.println("Carro freando");
    }
}
