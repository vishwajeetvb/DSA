class Node{
    int value;
    Node next;
    Node(int value){
        this.value=value;
    }
}

class ISLL7LL{

    static Node insertAtStart(int value,Node head){
      Node temp = new Node(value);
      if(head==null){
        temp.next=null;
        head=temp;
      }else{
          temp.next=head;
          head=temp;
      }
      return head;
    }

    static void display(Node head){
        while(head!=null){
            System.out.print(head.value+"->");;
            head=head.next;
        }
    }

    static Node delete(Node head,int data){
        System.out.println();
        Node temp=head;;
        Node prev=null;
        while(temp!=null){
            if(temp.value==data){
               if(temp==head){
                  head=temp.next;
                  return head;
               }else{
                   prev.next=temp.next;
                   return head;
               } 
            }
            prev=temp;
            temp=temp.next;
        }
        System.out.println("Element Not Found");
        return head;
    } 


    public static void main(String[] args) {
        System.out.println("Implementation Of Singly Linked List");
        Node head = null;
        head = insertAtStart(15,head);
        head = insertAtStart(15,head);
        head = insertAtStart(14,head);
        head = insertAtStart(18,head);
        head = insertAtStart(19,head);
        head = insertAtStart(17,head);
        display(head);
        head = delete(head, 15);
        display(head);
        head = delete(head, 14);
        display(head);
        head = delete(head, 17);
        display(head);
        head = delete(head, 14);
        display(head);
    }
}