package org.example;

import org.example.Classes.Lista;

public class Main {
    public static void main(String[] args) {

        Lista lista1 = new Lista();
        lista1.adiciona(1);
        lista1.adiciona(2);
        lista1.adiciona(3);

        Lista lista2 = new Lista();
        lista2.adiciona(4);
        lista2.adiciona(5);
        lista2.adiciona(6);

        System.out.println("Lista 1:");
        lista1.exibeLista();

        System.out.println("Lista 2:");
        lista2.exibeLista();

        // Concatenação
        lista1.concatena(lista2);
        System.out.println("Lista após concatenação:");
        lista1.exibeLista();

        // Divisão
        Lista[] listasDivididas = lista1.divide();
        System.out.println("Lista 1 após divisão:");
        listasDivididas[0].exibeLista();
        System.out.println("Lista 2 após divisão:");
        listasDivididas[1].exibeLista();

        // Cópia
        Lista listaCopia = lista1.copia();
        System.out.println("Cópia da Lista 1:");
        listaCopia.exibeLista();

        // Pesquisa
        System.out.println("Pesquisa por 5 na Lista 1: " + lista1.pesquisa(5));
        System.out.println("Pesquisa por 8 na Lista 1: " + lista1.pesquisa(8));
    }
}