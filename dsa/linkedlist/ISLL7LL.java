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

    static Node insertAtEnd(int value,Node head){
       System.out.println();
       Node temp =new Node(value);
       temp.next=null;
       Node pointer = head;
       Node prev = null;
       while(pointer!=null){
           prev = pointer;
           pointer=pointer.next;
       }
       prev.next=temp;       
       return head;
    }

    static Node insertBeforeGivenValue(int value,int givenValue,Node head){
        System.out.println();
        Node temp = new Node(value);
        Node prev  = null;
        Node curr = head;
        while(curr!=null){
            if(curr.value==givenValue){
              if(curr==head){
                temp.next=curr;
                head=temp;
                return head;
              }
              else{
                  prev.next=temp;
                  temp.next=curr;
                  return head;
              }
            }
            prev=curr;
            curr=curr.next;
        }
        System.out.println("Given Element not Found");
        return head;
    }

    static Node insertAfterGivenValue(int value,int givenValue,Node head){
        System.out.println();
        Node temp = new Node(value);
        Node curr = head;
        while(curr!=null){
            if(curr.value==givenValue){
              if(curr==head){
                temp.next=curr.next;
                  curr.next=temp;
                return head;
              }
              else{
                  temp.next=curr.next;
                  curr.next=temp;
                  return head;
              }
            }
            curr=curr.next;
        }
        System.out.println("Given Element not Found");
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
                //If The element needed to be deleted is first element
               if(temp==head){
                  head=temp.next;
                  return head;
               }
               else//If element is in somewhere middle
               {
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
        head = insertAtEnd(299, head);
        display(head);
        head = delete(head, 15);
        display(head);
        head = delete(head, 14);
        display(head);
        head = delete(head, 17);
        display(head);
        head = delete(head, 14);
        display(head);
        head = insertAtEnd(25,head);
        display(head);
        head = insertAtEnd(26,head);
        display(head);
        head = insertBeforeGivenValue(30, 25, head);
        display(head);
        head = insertBeforeGivenValue(1, 19, head);
        display(head);
        head = insertBeforeGivenValue(11, 26, head);
        display(head);
        head = insertBeforeGivenValue(30, 100, head);
        display(head);
        head = insertAfterGivenValue(16, 25, head);
        display(head);
        head = insertAfterGivenValue(166, 1, head);
        display(head);
        head = insertAfterGivenValue(1666, 26, head);
        display(head);
        head = insertAfterGivenValue(16, 250, head);
        display(head);
    }
}