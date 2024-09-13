package listas;

public class Lista {
    private Nodo head;
    private int size;
    public Lista(){
        this.head = null;
        this.size = 0;  
}

    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public boolean isEmpty(){
    return head = null;
    }
    public Nodo insertBegin(Object element){
        Nodo nodo = new Nodo(element);
        if (isEmpty ()(){
            setHead(head:nodo);
     
        }
    }
