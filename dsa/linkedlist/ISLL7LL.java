class Node{
    public int data;
    public Node next;

    Node(int data){
        this.data = data;
    }
}

class SingleLL{
    Node head;
    Node tail;
    
    void AddAtStart(int data){
        Node node = new Node(data);
        if(head==null){            
            this.head=this.tail=node;
        }else{
            node.next=head;
            head=node;
        }
    }

   void display(){
        Node temp = this.head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
    }

    void deleteAtStart(){
       if(head==null){
           System.out.println("List is Empty");
       }else{
           head.next=head.next.next;
       }
    }

}

public class ISLL7LL {    
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
