package org.example.Lista;

public class ListaEncadeada {

    private Node head;

    public ListaEncadeada() {
        this.head = null;
    }

    // Minserir na primeira posição
    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println("Elemento inserido na primeira posição: " + data);
    }

    //remover da última posição
    public void removeFromLast() {
        if (head == null) {
            System.out.println("A lista está vazia. Nada para remover.");
            return;
        }

        if (head.next == null) {
            System.out.println("Elemento removido da última posição: " + head.data);
            head = null;
            return;
        }

        Node current = head;
        Node previous = null;

        while (current.next != null) {
            previous = current;
            current = current.next;
        }

        System.out.println("Elemento removido da última posição: " + current.data);
        previous.next = null;
    }

    // imprimir a lista
    public void printList() {
        Node current = head;
        System.out.print("Lista: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }


}
