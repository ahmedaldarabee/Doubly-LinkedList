public class LinkedList extends Link {
    
    public Link first;
    public Link last;
    
    public LinkedList(int id , int data){
        super(id,data);
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void insertFirst(int id , int data){
        Link newObj = new Link(id,data);

        if(isEmpty()){
            last = newObj;
        }else{
            first.previous = newObj;
        }
        newObj.next = first;
        first = newObj;
    }

    public void insertLast(int id , int data){
        Link newObj = new Link(id,data);
        
        if(isEmpty()){
            first = newObj;
        }else{
            last.next = newObj;
            newObj.previous = last;
        }
        last = newObj;
    }

    public void deleteFirst(){

        if(first.next == null){
            last = null;
        }else{
            first.next.previous = null;
        }
        first = first.next;
    }

    public void deleteLast(){

        if(first.next == null){
            first = null;
        }else{
            last.previous.next = null;
        }
        last = last.previous;
    }

    public void displayForward(){
        Link current = first;

        while(current != null){
            current.print();
            current = current.next;
        }System.out.println("\n");
    }

    public void displayBackward(){
        Link current = last;

        while(current != null){
            current.print();
            current = current.previous;
        }System.out.println("");
    }

    public boolean findElement(int elementData){
        Link current = first;
        while(current != null){
            if(current.getSameData() == elementData)
            return true;
            current = current.next;
        }        
        return false;
    }


    public static void main(String arrs[]){
        System.out.println("\nHello ahmed\n");        
        LinkedList linkListObj = new LinkedList(1,2);
        
        linkListObj.insertFirst(10,22);
        linkListObj.insertFirst(11,21);
        linkListObj.insertFirst(12,24);

        linkListObj.insertLast(16,77);
        linkListObj.insertLast(17,75);
        linkListObj.insertLast(18,99);

        linkListObj.deleteFirst();
        linkListObj.deleteLast();

        boolean searchResult = linkListObj.findElement(99);

        if(searchResult == true){
            System.out.println("Your element exist!");
        }else{
            System.out.println("Sorry , but your element not exist!");
        }
    }
}