public class LL {
    private int size;
    private Node head;
    private Node tail;

    public LL(){
        this.size=0;
    }
    public void insertFirst(int val){
        Node temp= new Node(val);
        if (this.head==null){
            this.head=temp;
            this.tail=temp;
            this.size++;
            return;
        }
        temp.next=this.head;
        this.head=temp;
        this.size++;
        return;

    }
    public void append(int val){
        Node temp = new Node(val);

        if (this.size==0){
            this.head=temp;
            this.tail=temp;
            this.size++;
            return;
        }
        this.tail.next=temp;
        this.tail=temp;
        this.size++;
        return;
    }
    public void insert(int val,int idx) throws ArithmeticException{
        Node temp=new Node(val);
        if (idx>size || idx<0){
            throw new ArithmeticException("you are a dumb...");
        }
        if (idx==0){
            insertFirst(val);
            return;
        }
        if (idx==size){
            append(val);
            return;
        }
        Node cur = this.head;
        for (int i = 0; i < idx-1; i++) {
            cur=cur.next;
        }
        Node next_cur=cur.next;
        cur.next=temp;
        temp.next=next_cur;
        this.size++;
        return;

    }
    public void deleteFirst(){
        if(head==null || this.size==1){
            this.head=null;
            this.tail=null;
            this.size=0;
        }
        this.head=this.head.next;
        this.size--;
        return;
    }
    public void delete(int idx) throws ArithmeticException{
        if (idx>=size || idx<0){
            throw new ArithmeticException("you are a dumb...");
        }
        if (idx==0){
            deleteFirst();
            return;
        }
        if (idx==size-1){
            pop();
            return;
        }
        Node cur = this.head;
        for (int i = 0; i < idx-1; i++) {
            cur=cur.next;
        }
        cur.next=cur.next.next;
        this.size--;
        return;

    }
    public void pop(){
        if (this.size==0 || this.size==1){
            this.tail=null;
            this.head=null;
            this.size=0;
            return;
        }
        Node cur;
        cur=this.head;
        while(cur.next!=this.tail){
            cur =cur.next;
        }
        this.tail=cur;
        tail.next=null;
        this.size--;
        return;
    }
    public void display(){
        if (this.size==0){
            return;
        }
        Node cur;
        cur=this.head;
        while (cur!=null){
            System.out.print(cur.value + "->");
            cur=cur.next;
        }
        System.out.print("END");
        System.out.println();
    }
    public void getSize(){
        System.out.println(this.size);
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
}
