public class Main {
    public static void main(String[] args) {
        System.out.println("Primeira Aula");
        Caneta caneta1 = new Caneta();

        Caneta caneta2 = new Caneta();
        caneta1.cor= "Azul";
        caneta1.tampada = false;


        caneta2.cor = "Vermelha";
        caneta2.tampada = true;

        System.out.println("========= CANETA 1 =======");
        System.out.println(caneta1.cor);
        System.out.println(caneta1.tampada);
        caneta1.escrever();

        System.out.println("========= LIVRO =======");
        Livro l1 = new Livro();
        System.out.println(l1.quantida_paginas = 600);
        System.out.println(l1.tipo_capa = "Capa Dura");
        caneta2.escrever();

    }
}