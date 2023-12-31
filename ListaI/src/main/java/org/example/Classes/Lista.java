package org.example.Classes;

import java.util.Arrays;

public class Lista {
    private Object[] elementos;
    private int tamanho;

    public Lista() {
        this.elementos = new Object[10];
        this.tamanho = 0;
    }

    public void adiciona(Object elemento) {
        if (this.tamanho == this.elementos.length) {
            aumentaCapacidade();
        }
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
    }

    public void concatena(Lista outraLista) {
        Object[] novaLista = new Object[this.tamanho + outraLista.tamanho];
        System.arraycopy(this.elementos, 0, novaLista, 0, this.tamanho);
        System.arraycopy(outraLista.elementos, 0, novaLista, this.tamanho, outraLista.tamanho);
        this.elementos = novaLista;
        this.tamanho += outraLista.tamanho;
    }

    public Lista[] divide() {
        int meio = this.tamanho / 2;
        Lista lista1 = new Lista();
        Lista lista2 = new Lista();

        lista1.elementos = Arrays.copyOfRange(this.elementos, 0, meio);
        lista1.tamanho = meio;

        lista2.elementos = Arrays.copyOfRange(this.elementos, meio, this.tamanho);
        lista2.tamanho = this.tamanho - meio;

        Lista[] resultado = {lista1, lista2};
        return resultado;
    }

    public Lista copia() {
        Lista novaLista = new Lista();
        novaLista.elementos = Arrays.copyOf(this.elementos, this.tamanho);
        novaLista.tamanho = this.tamanho;
        return novaLista;
    }

    public boolean pesquisa(Object elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    private void aumentaCapacidade() {
        int novaCapacidade = this.elementos.length * 2;
        this.elementos = Arrays.copyOf(this.elementos, novaCapacidade);
    }

    public void exibeLista() {
        for (int i = 0; i < this.tamanho; i++) {
            System.out.print(this.elementos[i] + " ");
        }
        System.out.println();
    }



}
