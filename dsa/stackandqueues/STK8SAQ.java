
class Stack{
    private String data[];
    private static int top;
    int maxSize;

    Stack(int maxSize){
        data = new String[maxSize];
        this.maxSize=maxSize;
        top=0;
    }

    public void push(String data){
        setData(data);
    }

    public void setData(String data) {
        if(top<maxSize){        
        this.data[top] = data; 
        top++;               
        }else{            
            System.out.println("Stack is Full");
        }
    }

    public void display(){
        int temp=top;
        
        if(temp==-1){
            System.out.println("Stack is empty");
        }
        if(temp==maxSize){
            temp--;
        }
        while(temp>=0){
           System.out.print(temp+" "+data[temp]+" ");
           temp--;
        }
        System.out.println();
    }    

    public int getTop() {
        return top;
    }

    public String pop(){
        String ele;
        if(top==-1){
            System.out.println("Stack is Empty");
        }
        if(top==maxSize){
            top--;            
        }
        ele = data[top];
        top--;        
        return ele;
    } 

    public int getMaxSize() {
        return maxSize;
    }

    public String peek(){
        
        String ele;
        if(top==maxSize){
            ele=data[top-1];
        }else{
            ele=data[top];
        }
        return ele;
    }

    public boolean isFull(){
        if(top==maxSize){
            return true;
        }else{
            return false;
        }
    }

    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else{
            return false;
        }
    }
}

public class STK8SAQ {
    public static void main(String[] args) {
        Stack obj = new Stack(10);
        obj.push("New Zealand");
        obj.push("New Delhi");
        obj.push("USA");
        obj.push("aka");
        obj.push("Figure");
        obj.push("Australia");
        obj.push("Amer");
        obj.push("hello");
        obj.push("my usage");
        obj.push("hellooo");
        obj.push("full");
        obj.push("jhskjakda");
        obj.display();
        System.out.println("Is Stack Full: "+obj.isFull());
        System.out.println("Popped element is: "+obj.pop());
        obj.display();
        System.out.println("Is Stack Full: "+obj.isFull());
        System.out.println("Popped element is: "+obj.pop());
        obj.display();

    }
}
