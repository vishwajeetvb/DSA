
class DoubleNode {
    int value;
    DoubleNode next;
    DoubleNode prev;

    DoubleNode(int value) {
        this.value = value;
    }
}

public class IDLL7LL {

    static DoubleNode insertAtStart(int value, DoubleNode head) {
        DoubleNode temp = new DoubleNode(value);
        if (head == null) {
            temp.next = null;
            temp.prev = null;
            head = temp;
        } else {
            temp.prev = null;
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        return head;
    }

    static void display(DoubleNode head) {
        System.out.println();
        DoubleNode temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
    }

    static DoubleNode delete(int data, DoubleNode head) {
        DoubleNode temp = head;
        while (temp != null) {
            if (temp.value == data) {
                if (temp == head) {
                    head = temp.next;
                    return head;
                } else {
                    if (temp.next == null) {
                        temp.prev.next = temp.next;
                        return head;
                    } else {

                        // This line means temp node prev node next part will now point to the node
                        // which is earliner pointer
                        // out by next of temp
                        temp.prev.next = temp.next;
                        // This line means the prev of that node which was pointed by next of temp will
                        // not point to next of that node
                        // which was earlier pointed by prev of temp node;
                        temp.next.prev = temp.prev;
                        return head;
                    }
                }

            }
            temp = temp.next;
        }
        System.out.println("Element Not Found For deletion");
        ;
        return head;
    }

    public static void main(String[] args) {
        System.out.println("Doubly Linked List");
        DoubleNode head = null;
        head = insertAtStart(15, head);
        display(head);
        head = insertAtStart(18, head);
        display(head);
        head = insertAtStart(24, head);
        display(head);
        head = delete(18, head);
        display(head);
        head = delete(15, head);
        display(head);
        head = insertAtStart(26, head);
        head = insertAtStart(29, head);
        head = insertAtStart(24, head);
        display(head);
        head = delete(24, head);
        display(head);
        head = delete(24, head);
        display(head);
    }
}
