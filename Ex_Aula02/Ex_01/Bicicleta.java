package br.com.ada.pooii.Ex_Aula02.Ex_01;

public class Bicicleta implements Veiculo{
    @Override
    public void ligar() {
        System.out.println("Pedalando a bicicleta.");
    }

    @Override
    public void desligar() {
        System.out.println("Parando de pedalar a bicicleta.");
    }

    @Override
    public void acelerar(int velocidade) {
        velocidade = 10;
        System.out.println("A velocidade da bicicleta é de: " + velocidade + "km/h");
    }

    @Override
    public void frear() {
        System.out.println("Freando a bicicleta.");
    }
}
