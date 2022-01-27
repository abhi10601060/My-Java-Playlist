public class DLL {
    private Node head;
    private Node tail;
    private int size;

    public DLL(){
        this.size=0;
    }

    public void insertFirst(int val){
        Node temp = new Node(val);
        if(size==0){
            this.head=temp;
            this.tail=temp;
            this.size++;
            return;
        }
        temp.next=this.head;
        this.head.prev=temp;
        this.head=temp;
        size++;
        return;
    }
    public void append(int val){
        Node temp = new Node(val);
        if (size==0){
            insertFirst(val);
            return;
        }
        tail.next=temp;
        temp.prev=tail;
        this.tail=temp;
        this.size++;
        return;
    }
    public void insert(int val, int idx) throws RuntimeException{
        Node temp=new Node(val);
        if (idx<0 || idx>this.size){
            throw new RuntimeException("You are a dumb...");
        }
        if (idx==0){
            insertFirst(val);
            return;
        }
        if(idx==this.size){
            append(val);
            return;
        }
        Node cur =this.head;
        for (int i = 0; i < idx-1; i++) {
            cur=cur.next;
        }
        Node next_cur=cur.next;
        cur.next=temp;
        temp.prev=cur;
        temp.next=next_cur;
        next_cur.prev=temp;
        this.size++;
        return;
    }
    public void deleteFirst(){
        if(size==0){
            return;
        }
        if (this.size==1){
            this.head=null;
            this.tail=null;
            this.size=0;
            return;
        }
        head=head.next;
        head.prev=null;
        this.size--;
        return;
    }
    public void pop(){
        if (this.size==0){
            return;
        }
        if(size==1){
            deleteFirst();
            return;
        }
        this.tail=this.tail.prev;
        this.tail.next=null;
        this.size--;
        return;
    }
    public RuntimeException delete(int idx) throws RuntimeException{
        if(this.size==0){
            return null;
        }
        if(idx>=this.size || idx<0){
            return new RuntimeException("You are a dumb...");
        }
        if(idx==0){
            deleteFirst();
            return null;
        }
        if (idx==this.size-1){
            pop();
            return null;
        }
        Node cur = this.head;
        for (int i = 0; i < idx-1; i++) {
            cur=cur.next;
        }
        cur.next=cur.next.next;
        cur.next.prev=cur;
        this.size--;
        return null;
    }
    public void display(){
        Node cur=this.head;
        while (cur!=null){
            System.out.print(cur.val + "->");
            cur=cur.next;
        }
        System.out.println("END");
    }
    public void displayRev(){
        Node cur= this.tail;
        while (cur!=null){
            System.out.print(cur.val + "->");
            cur=cur.prev;
        }
        System.out.println("START");

    }
    public void getSize(){
        System.out.println(this.size);
    }


    private class Node{
        private int val;
        private Node next;
        private Node prev;
        public Node (int val){
            this.val=val;
            this.next=null;
            this.prev=null;
        }
    }
}
