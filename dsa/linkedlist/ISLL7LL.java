class SingleLL {
    Node head;
    Node tail;

    void AddAtStart(int data) {
        Node node = new Node(data);
        if (head == null) {
            this.head = this.tail = node;
        } else {
            node.setNext(head);
            head = node;
        }
    }

    void display() {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.getiData() + "->");
            temp = temp.getNext();
        }
        System.out.println();
    }

    void deleteAtStart() {
        if (head == null) {
            System.out.println("List is Empty");
        } else {
            head = head.getNext();
        }
    }

}

public class ISLL7LL{
    public static void main(String[] args) {
        SingleLL obj = new SingleLL();
        obj.AddAtStart(20);
        obj.AddAtStart(30);
        obj.AddAtStart(40);
        obj.display();
        obj.deleteAtStart();
        obj.display();
    }
}
