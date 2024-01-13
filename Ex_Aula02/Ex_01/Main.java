package br.com.ada.pooii.Ex_Aula02.Ex_01;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Moto moto = new Moto();
        Bicicleta bicicleta = new Bicicleta();

        carro.ligar();
        carro.acelerar(60);
        carro.frear();
        carro.desligar();

        System.out.println("\n");

        moto.ligar();
        moto.acelerar(80);
        moto.frear();
        moto.desligar();

        System.out.println("\n");

        bicicleta.ligar();
        bicicleta.acelerar(20);
        bicicleta.frear();
        bicicleta.desligar();
    }
}
