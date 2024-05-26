public class Link {
    private int idData;
    private int sameData;
    
    public Link next;
    public Link previous;

    public Link(int id , int data){
        this.idData = id;
        this.sameData = data;
    }

    public void print(){
        System.out.println((this.idData) + " , " + (this.sameData));
    }

    public int getIdData(){
        return this.idData;
    }
    public int getSameData(){
        return this.sameData;
    }
}
