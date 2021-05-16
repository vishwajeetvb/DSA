public class Node {
    
 private String data;
 private Node next;
 private int idata;

 
 
 Node(String data){
     this.data=data;
 }

 Node(int idata){
     this.idata=idata;
 }

 public void setiData(int idata){
     this.idata=idata;
 }

 public int getiData(){
     return idata;
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
