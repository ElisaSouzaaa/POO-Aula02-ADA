package br.com.ada.pooii.Ex_Aula02.Ex_01;

public class Moto implements Veiculo{
    @Override
    public void ligar() {
        System.out.println("Moto ligando.");
    }

    @Override
    public void desligar() {
        System.out.println("Moto desligando.");
    }

    @Override
    public void acelerar(int velocidade) {
        System.out.println("Velocidade da moto: " + velocidade + "km/h");
    }

    @Override
    public void frear() {
        System.out.println("Moto freando.");
    }
}
