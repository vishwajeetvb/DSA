//Implementation Of Linked List Class in Java
package linkedlist;
class Node{ 
 private String data;
 private Node next;
 
 Node(String data){
     this.data=data;
 }

 public void setData(String data) {
     this.data = data;
 }

 public String getData() {
     return data;
 }

 public void setNext(Node next) {
     this.next = next;
 }

 public Node getNext() {
     return next;
 }
 
}

class LinkedList{
    private Node head;
    private Node tail;

    public void insertAfter(String data, String dataBefore){
        Node node = new Node(data);
        if (this.head == null)
			this.head = this.tail = node;
        else{
            Node nodeBefore = search(dataBefore);
            if(nodeBefore!=null){
            node.setNext(nodeBefore.getNext());
            nodeBefore.setNext(node);
            if (nodeBefore == this.tail)
					this.tail = node;
        }
            else{
                System.out.println("Node not found");
            }
        }
        
               

    }

    public Node search(String data){
        Node search = this.head;
        while(search!=null){
            if(search.getData().equalsIgnoreCase(data)){
                return search;
            }
            search = search.getNext();
        }
        
        
        return null;
    }

    public void AddAtEnd(String data){
       Node node = new Node(data);
       
        if(head==null){
            this.head=this.tail=node;
        }else{
            this.tail.setNext(node);
            this.tail=node;
        }

        System.out.println("Element added Successfully");

    }

    public void AddAtStart(String data){
        Node node = new Node(data);

        if(head==null){
            this.head=this.tail=node;
        }else{
            node.setNext(this.head);
            this.head=node; 
        }
    }

    public void display(){
        Node temp = this.head;
        while(temp != null){
            System.out.print(temp.getData()+"->");
            temp = temp.getNext();
        }
        System.out.println();
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public Node reverseList(){    
        // code here
        Node prev = null;
        Node next=null;
        Node curr = head;
        while(curr!=null){
            next=curr.getNext();
            curr.setNext(prev);
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
    
    }

    public void deleteNode(String data){
        Node dataNode = search(data);
        if(dataNode!=null){
            if(dataNode.getData().equals(head.getData())){
                head=dataNode.getNext();
                
            }else{
                Node nodeBefore = head;
                Node temp = head;
                while(temp!=null){
                    if(temp.getNext()==dataNode){
                    nodeBefore=temp;
                    break;
                }
                    temp=temp.getNext();
                 }
                    nodeBefore.setNext(dataNode.getNext());

                if(dataNode==this.tail){
                    this.tail=nodeBefore;
                } 
                nodeBefore.setNext(null);        


            }
        }        
    }
}

public class BLL7LL {
    public static void main(String[] args) {
        System.out.println("----------------------------Linked List Class-------------------------");
        LinkedList llobj = new LinkedList();
        llobj.AddAtEnd("NYC");
        llobj.AddAtEnd("NEW DELHI");
        llobj.AddAtEnd("PARIS");
        llobj.AddAtStart("Bhubneshwar");       
        llobj.insertAfter("Chennai","NEW DELHI");
        llobj.display();
        
        System.out.println("Element present: "+llobj.search("NEW DELHI"));;
        llobj.reverseList();
        llobj.display();
        llobj.deleteNode("PARIS");
        llobj.display();
        llobj.deleteNode("Bhubneshwar");
        llobj.display();

    }
}
