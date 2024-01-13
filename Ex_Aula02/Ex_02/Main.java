package br.com.ada.pooii.Ex_Aula02.Ex_02;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(9);
        Retangulo retangulo = new Retangulo(6,8);
        Triangulo triangulo = new Triangulo(9,12);

        System.out.printf("A área do círculo é: %.2f%n", circulo.calcularArea());
        System.out.println("A área do retângulo é: " + retangulo.calcularArea());
        System.out.println("A área do triângulo é: " + triangulo.calcularArea());
    }
}
