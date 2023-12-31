package org.example;

import org.example.Lista.ListaEncadeada;

public class Main {
    public static void main(String[] args) {



        ListaEncadeada list = new ListaEncadeada();
        // Inserindo alguns elementos na primeira posição
        list.insertAtFirst(3);
        list.insertAtFirst(7);
        list.insertAtFirst(1);

        // Imprimindo a lista
        list.printList();

        // Removendo da última posição
        list.removeFromLast();

        // Imprimindo a lista após a remoção
        list.printList();

    }
}